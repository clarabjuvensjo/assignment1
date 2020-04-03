import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;

public class ValuableRegister extends Application {

    @Override
    public void start(Stage primaryStage){
        BorderPane root = new BorderPane();

        Label heading = new Label("Värdesaker");
        root.setTop(heading);

        VBox vBox = new VBox();
        root.setRight(vBox);
        Label sorting = new Label("Sortering");
        vBox.getChildren().add(sorting);
        RadioButton name = new RadioButton("Namn");
        RadioButton value = new RadioButton("Värde");
        vBox.getChildren().addAll(name, value);

        TextArea textArea = new TextArea();
        root.setCenter(textArea);
        textArea.setEditable(false);

        Button show = new Button("Visa");
        Button stockMarketCrash = new Button("Börskrasch");
        FlowPane flowPane = new FlowPane();
        root.setBottom(flowPane);
        flowPane.getChildren().addAll(show, stockMarketCrash);


        Scene scene = new Scene(root,600, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
