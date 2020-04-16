// PROG2 VT2020, Inlämningsuppgift 1, del 1
// Clara Bjuvensjö clbj3090

import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class ApplianceInputForm extends Alert {
    private TextField nameField = new TextField();
    private TextField priceField = new TextField();
    private TextField wearField = new TextField();

    public ApplianceInputForm() {
        super(AlertType.CONFIRMATION);
        GridPane pane = new GridPane();
        pane.addRow(0, new Label("Namn: "), nameField);
        pane.addRow(1, new Label("Pris: "), priceField);
        pane.addRow(2, new Label("Skick: "), wearField);
        getDialogPane().setContent(pane);
        setHeaderText("Ny apparat");
    }

    public String getName() {
        return nameField.getText();
    }

    public double getPrice() {
        return Integer.parseInt(priceField.getText());
    }

    public int getWear() {
        return Integer.parseInt(wearField.getText());
    }

}
