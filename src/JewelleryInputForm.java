// PROG2 VT2020, Inlämningsuppgift 1, del 1
// Clara Bjuvensjö clbj3090

import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class JewelleryInputForm extends Alert {
    private TextField nameField = new TextField();
    private TextField jewelField = new TextField();
    private CheckBox materialBox = new CheckBox("Av guld");

    public JewelleryInputForm() {
        super(AlertType.CONFIRMATION);
        GridPane pane = new GridPane();
        pane.addRow(0, new Label("Namn: "), nameField);
        pane.addRow(1, new Label("Stenar: "), jewelField);
        pane.addRow(2, materialBox);
        getDialogPane().setContent(pane);
        setHeaderText("Nytt smycke");
    }

    public String getName() {
        return nameField.getText();
    }

    public int getJewels() {
        return Integer.parseInt(jewelField.getText());
    }

    public boolean getMaterial() {
        return materialBox.isSelected();
    }

}
