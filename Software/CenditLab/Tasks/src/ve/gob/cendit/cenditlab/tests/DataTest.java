package ve.gob.cendit.cenditlab.tests;

import ve.gob.cendit.cenditlab.tasks.DataSet;
import ve.gob.cendit.cenditlab.tasks.Data;
import ve.gob.cendit.cenditlab.tasks.ListData;
import ve.gob.cendit.cenditlab.tasks.NumericData;

import java.util.Arrays;

/**
 * Created by root on 22/08/17.
 */
public class DataTest
{
    public static void main(String[] args)
    {
        // numericDataTest();
        listDataTest();
    }

    public static void dataTest()
    {
        Data freqData = new Data("Frequency");
        Data ampData = new Data("Amplitude", 10.5);
        Data maxData = new Data("Maximum", 120.0f);
        Data minData = new Data("Minimum", maxData);

        DataSet dataSet1;
        try
        {
            dataSet1 = new DataSet();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        dataSet1 = new DataSet(freqData, ampData, maxData);
        DataSet dataSet2 = new DataSet(freqData, ampData);
        DataSet dataSet3 = new DataSet(new Data[] {minData, maxData});

        dataSet1.setValue("Frequency", ampData);
        dataSet2.setValue("Amplitude", 15.0f);

        minData.set(ampData);

        float result;

        if (dataSet2.containsData("Amplitude"))
            result =  (float) dataSet2.getData("Amplitude").get();

        dataSet3.setValue("Minimum", (Object) new Float(-10.0f));

        print("Single Values");
        print(freqData);
        print(ampData);

        print("DataSet container");
        print(dataSet1);
        print(dataSet2);
        print(dataSet3);
    }

    public static void numericDataTest()
    {
        NumericData data1 = new NumericData("Number1");
        NumericData data2 = new NumericData("Number1", 12.3);
        NumericData data3 = new NumericData("Number1", "+45.67e3");

        print("Data1", data1);
        print("Data2", data2);
        print("Data3", data3);

        data1.set("#HCAFEdeadbeef");
        data2.set(data1);

        try
        {
            data1.set("Hola");
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public static void listDataTest()
    {
        ListData list1 = new ListData("List1");

        list1.set(12.5);
        print("List with single double value", list1);

        list1.set(" frequency  , spam  , V5  , 12.34 ");
        print("String list", list1);

        list1.set("freq span, voltage range");
        print("String list with space", list1);

        list1.set("frequency");
        print("List with single value", list1);
    }

    public static void print(Object object)
    {
        System.out.println(object.toString());
    }

    public static void print(String message, Object object)
    {
        System.out.printf("%s: %s\n", message, object.toString());
    }


}
