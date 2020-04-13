import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class DropDownMenu extends Application {

    private MenuButton chooseValuable = new MenuButton("Välj en värdesak: ");
    private MenuItem jewellery = new MenuItem("Smycke");
    private MenuItem stock = new MenuItem("Aktie");
    private MenuItem appliance = new MenuItem("Apparat");


    public void start(Stage primaryStage) {
        FlowPane root = new FlowPane();
        root.getChildren().add(chooseValuable);

        chooseValuable.getItems().addAll(jewellery, stock, appliance);

        ItemHandler handler = new ItemHandler();
        jewellery.setOnAction(handler);
        stock.setOnAction(handler);
        appliance.setOnAction(handler);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    class ItemHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            MenuItem item = (MenuItem) event.getSource();
            String choice = item.getText();
            System.out.println(choice);
        }
    }
}
