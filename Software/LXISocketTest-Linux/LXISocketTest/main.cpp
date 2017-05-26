#include <iostream>
#include <sys/types.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <netinet/ip.h>
#include <cstdlib>
#include <cstring>
#include <arpa/inet.h>
#include <cstdio>
#include <unistd.h>

using namespace std;


int sockt;

int main (int argc, char *argv[])
{
	cout << "Hello world!" << endl;
	sockt = socket(AF_INET, SOCK_STREAM, IPPROTO_TCP); 
	if (sockt < 0)
		exit(1);
	
	struct sockaddr_in sockAddr;
	
	memset(&sockAddr, 0, sizeof(sockAddr));

	if (inet_pton(AF_INET, "192.168.1.10", &sockAddr.sin_addr.s_addr) < 0)
	{
		printf("error 2");
		exit(1);
	}
	
	sockAddr.sin_family = AF_INET;
	sockAddr.sin_port = htons(80);
	// sockAddr.sin_addr.s_addr = inet_addr("192.168.1.10");

	int ret = connect(sockt, (struct sockaddr*)&sockAddr, sizeof(sockAddr));
	/* 
	if (connect(sockt, (struct sockaddr*)&sockAddr, sizeof(sockAddr)) == -1)	
	{
		printf("error 1");
		exit(1);	
	}*/
	
	
	if (send(sockt, "GPIB0::23::INSTR\n\r", 18, 0) == -1)
	{
		printf("error 2");
		exit(1);	
	}

	
	char buffer[200];
	int actual;
	if (actual = recv(sockt, buffer, 200, 0) == -1)
	{
		printf("error 3");
		exit(1);	
	}

	buffer[actual] = 0;
	printf("Instrument ID: %s\n", buffer);
	
	if (close(sockt) == -1)
		exit(1);	
	
	return 0;
}

