import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class DropDownMenu extends Application{

    private MenuButton chooseValuable = new MenuButton("Välj en värdesak: ");
    private MenuItem jewellery = new MenuItem("Smycke");
    private MenuItem stock = new MenuItem("Aktie");
    private MenuItem appliance = new MenuItem("Apparat");


    public void start(Stage primaryStage){
        FlowPane root = new FlowPane();

        chooseValuable.getItems().addAll(jewellery, stock, appliance);

        root.getChildren().add(chooseValuable);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
