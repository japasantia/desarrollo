package ve.gob.cendit.cenditlab.ui;

public class EnrSetup
{
    private Options enrModeOptions =
            new Options("Modo ENR", "Tabla", "Spot");

    private Options snsTcoldOptions =
            new Options("SNS Tcold", "ON", "OFF");

    private Options userTcoldOptions =
            new Options("Tcold usuario", "ON", "OFF");

    private Options noiseSourcePreferenceOptions =
            new Options("Preferencia NS", "Normal", "SNS");

    private Options autoLoadEnrOptions =
            new Options("Carga automatica ENR", "ON", "OFF");

    private EnrField enrField =
            new EnrField();

    private TemperatureField userTcoldField =
            new TemperatureField();

    public Options getEnrModeOptions()
    {
        return enrModeOptions;
    }

    public Options getSnsTcoldOptions()
    {
        return snsTcoldOptions;
    }

    public Options getNoiseSourcePreferenceOptions()
    {
        return noiseSourcePreferenceOptions;
    }

    public Options getAutoLoadEnrOptions()
    {
        return autoLoadEnrOptions;
    }

    public EnrField getEnrField()
    {
        return enrField;
    }
}
