#include <stdio.h>
#include <stdlib.h>

#include <vxi11.h>
#include <vxi11_xdr.c>
#include <vxi11_clnt.c>
#include <vxi11_user.c>


int main (int argc, char *argv[])
{
	// test_vxi11_clnt();

	test_vxi11_user();
}

CLIENT* vxi11Client;

void test_vxi11_clnt()
{
	printf ("Pruebas de librerias VXI11");

	enum clnt_stat res;

	if ((vxi11Client = clnt_create("192.168.1.10", DEVICE_CORE, 
	DEVICE_CORE_VERSION, "tcp")) == NULL)
	{
		printf("VXI11 connection error\n");
		return 1;
	}

	Create_LinkParms linkParms;
	linkParms.clientId = 0;
	linkParms.lockDevice = 0;
	linkParms.lock_timeout = 0;
	linkParms.device = "gpib0,10";

	Create_LinkResp linkResp;

	if ((res = create_link_1(&linkParms, &linkResp, vxi11Client)) != 0)
	{
		printf("VXI11 crate link error");
		return 1;
	}

	Device_Link devLink;
	devLink = linkResp.lid;
	Device_WriteParms devWriteParms;
	devWriteParms.lid = devLink;
	devWriteParms.io_timeout = 10000;
	devWriteParms.lock_timeout = 10000;
	devWriteParms.flags = 0;
	devWriteParms.data.data_val = "*IDN?\n";
	devWriteParms.data.data_len = 6;
	// devWriteParms.data.data_val = ":SYST:ERR?\n";
	// devWriteParms.data.data_len = 11;

	Device_WriteResp devWriteResp;
	if ((res = device_write_1(&devWriteParms, &devWriteResp, vxi11Client)) != 0)
	{
		printf("Response reception error");
		return 1;
	}

	Device_ReadParms devReadParms;
	devReadParms.lid = devLink;
	devReadParms.io_timeout = 10000;
	devReadParms.lock_timeout = 10000;
	devReadParms.flags = 0;
	devReadParms.termChar = '\n';
	Device_ReadResp devReadResp;
	if ((res = device_read_1(&devReadParms, &devReadResp, vxi11Client)) != 0)
	{
		printf("Reading response error");
		return 1;
	}

	char dataRead[200];
	strncpy(dataRead, devReadResp.data.data_val, 
		devReadResp.data.data_len);
	printf("Instrument ID string: %s\n", dataRead);

	if ((res = destroy_link_1(&devLink, NULL, vxi11Client)) != 0)
	{
		printf("Destroy link error");
		return 1;
	}

	clnt_destroy(vxi11Client);

	getc(NULL);

	return 0;
}

void test_vxi11_user()
{
	VXI11_CLINK* pVXI11Link;
	char response[1024] = {'\0'};

	int status = vxi11_open_device(&pVXI11Link, "192.168.1.10", "gpib0,10");
	/*
	status = vxi11_send(pVXI11Link, "*IDN?\n", 5);

	int sizeRecv = vxi11_receive(pVXI11Link, response, 1024);
	response[sizeRecv] = '\0';

	printf("Response: %s", response);
	*/
	status = vxi11_send_and_receive(pVXI11Link, "*IDN?\n", 
		response, 1024, 5000);

	printf("Response: %s", response);
}