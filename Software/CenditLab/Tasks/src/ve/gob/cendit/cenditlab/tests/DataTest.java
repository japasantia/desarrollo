package ve.gob.cendit.cenditlab.tests;

import ve.gob.cendit.cenditlab.tasks.DataSet;
import ve.gob.cendit.cenditlab.tasks.Data;

/**
 * Created by root on 22/08/17.
 */
public class DataTest
{
    public static void main(String[] args)
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

    public static void print(Object object)
    {
        System.out.println(object.toString());
    }
}
