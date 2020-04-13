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

import javax.swing.*;
import java.util.Optional;

public class ValuableRegister extends Application {

    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(createBorderPane(), 600, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private BorderPane createBorderPane() {
        BorderPane pane = new BorderPane();
        pane.setTop(createValuablePane());
        pane.setBottom(createButtonPane());
        pane.setCenter(createTextArea());
        pane.setRight(createSortingVBox());
        return pane;
    }

    private FlowPane createValuablePane() {
        Label heading = new Label("Värdesaker");
        FlowPane top = new FlowPane();
        top.getChildren().add(heading);
        top.setAlignment(Pos.CENTER);
        top.setPadding(new Insets(4));
        return top;
    }

    private TextArea createTextArea() {
        TextArea textArea = new TextArea();
        textArea.setEditable(false);
        return textArea;
    }

    private FlowPane createButtonPane() {
        MenuButton chooseValuable = new MenuButton("Välj en värdesak: ");
        MenuItem jewellery = new MenuItem("Smycke");
        MenuItem stock = new MenuItem("Aktie");
        MenuItem appliance = new MenuItem("Apparat");
        chooseValuable.getItems().addAll(jewellery, stock, appliance);
        jewellery.setOnAction(new ItemHandler());
        stock.setOnAction(new ItemHandler());
        appliance.setOnAction(new ItemHandler());

        Button show = new Button("Visa");
        show.setOnAction(new ShowHandler());
        Button stockMarketCrash = new Button("Börskrasch");
        stockMarketCrash.setOnAction(new ButtonHandler());

        FlowPane bottom = new FlowPane();
        bottom.setAlignment(Pos.CENTER);
        bottom.setPadding(new Insets(5));
        bottom.setHgap(5);
        bottom.getChildren().addAll(chooseValuable, show, stockMarketCrash);
        return bottom;
    }

    private VBox createSortingVBox() {
        VBox vBox = new VBox();
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
        return vBox;
    }

    class ShowHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            System.out.println("Visa");
        }
    }

    class ButtonHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            System.out.println("Börskrasch");
        }
    }


    class ItemHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            InputForm inputForm = new InputForm();
            Optional<ButtonType> answer = inputForm.showAndWait();
            if (answer.isPresent() && answer.get() == ButtonType.OK) {
                String name = inputForm.getName();
                if (name.isEmpty()) {
                    Alert alert = new Alert(Alert.AlertType.ERROR, "Felaktig inmatning!");
                    alert.showAndWait();
                    return;
                }
                int jewels = inputForm.getJewels();
                boolean material = inputForm.getMaterial();
            }

        }
    }

}