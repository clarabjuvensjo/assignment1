import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class StockInputForm extends Alert {
    private TextField nameField = new TextField();
    private TextField numberField = new TextField();
    private TextField priceField = new TextField();

    public StockInputForm() {
        super(AlertType.CONFIRMATION);
        GridPane pane = new GridPane();
        pane.addRow(0, new Label("Namn: ", nameField));
        pane.addRow(1, new Label("Antal: ", numberField));
        pane.addRow(2, new Label("Pris: ", priceField));
        getDialogPane().setContent(pane);
        setHeaderText("Ny aktie");
    }

    public String getName() {
        return nameField.getText();
    }

    public int getNumbers() {
        return Integer.parseInt(numberField.getText());
    }

    public int getPrice() {
        return Integer.parseInt(priceField.getText());
    }

}
