package ve.gob.cendit.cenditlab.ui;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TitledPane;
import javafx.scene.input.MouseEvent;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FrequencyListPane extends TitledPane
{
    private static final String FXML_URL = "frequency-list-pane.fxml";

    @FXML
    private ListView frequencyListView;

    @FXML
    private Button addButton;

    @FXML
    private Button removeButton;

    private ObservableList<ValueField> valueFieldsList;

    private static final IValueValidator valueValidator =
            value -> FrequencyValue.isValid(value);

    public FrequencyListPane()
    {
        FXMLLoader fxmlLoader =
                new FXMLLoader(getClass().getResource(FXML_URL));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try
        {
            fxmlLoader.load();
        }
        catch (IOException ex)
        {
            throw new RuntimeException(ex);
        }

        valueFieldsList = frequencyListView.getItems();
        ValueField valueField = new ValueField();
        valueField.setChoiceUnits(FrequencyValue.getValidUnits());
        valueFieldsList.add(valueField);
    }

    @FXML
    private void addButtonClicked(MouseEvent event)
    {
        ValueField valueField = new ValueField();
        valueField.setChoiceUnits(FrequencyValue.getValidUnits());

        valueFieldsList.add(valueField);
    }

    @FXML
    private void removeButtonClicked(MouseEvent event)
    {
        int selectedIndex = frequencyListView.getSelectionModel().getSelectedIndex();

        if (selectedIndex >= 0 && selectedIndex < valueFieldsList.size())
        {
            valueFieldsList.remove(selectedIndex);
        }
    }

    public boolean validate()
    {
        return valueFieldsList.stream()
                .allMatch(valueField -> valueField.validate(valueValidator));
    }

    public List<String> getFrequencies()
    {
        int size = valueFieldsList.size();

        ArrayList<String> frequenciesList = new ArrayList<>(size);

        valueFieldsList.stream()
                .forEach(valueField ->
                    {
                        frequenciesList.add(valueField.getValue());
                    });

        return frequenciesList;
    }
}


