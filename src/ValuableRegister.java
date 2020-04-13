import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;

public class ValuableRegister extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane pane = new BorderPane();

        Label heading = new Label("Värdesaker");
        FlowPane top = new FlowPane();
        pane.setTop(top);
        top.getChildren().add(heading);
        top.setAlignment(Pos.CENTER);
        top.setPadding(new Insets(4));

        VBox vBox = new VBox();
        pane.setRight(vBox);
        vBox.setPadding(new Insets(5));
        vBox.setSpacing(5);
        Label sorting = new Label("Sortering");
        vBox.getChildren().add(sorting);
        RadioButton name = new RadioButton("Namn");
        RadioButton value = new RadioButton("Värde");
        vBox.getChildren().addAll(name, value);
        ToggleGroup sortingGroup = new ToggleGroup();
        sortingGroup.getToggles().addAll(name, value);
        name.setSelected(true);

        TextArea textArea = new TextArea();
        pane.setCenter(textArea);
        textArea.setEditable(false);

        Button show = new Button("Visa");
        show.setOnAction(new ShowHandler());
        Button stockMarketCrash = new Button("Börskrasch");
        FlowPane bottom = new FlowPane();
        bottom.setAlignment(Pos.CENTER);
        bottom.setPadding(new Insets(5));
        bottom.setHgap(5);
        pane.setBottom(bottom);
        bottom.getChildren().addAll(show, stockMarketCrash);

        Scene scene = new Scene(pane, 600, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    class ShowHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            System.out.println("Klick");
        }
    }

}
