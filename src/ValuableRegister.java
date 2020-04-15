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

import java.util.ArrayList;
import java.util.Optional;

public class ValuableRegister extends Application {
    ArrayList<Stock> stocks = new ArrayList<>();

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
        FlowPane pane = new FlowPane();
        pane.getChildren().add(heading);
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(4));
        return pane;
    }

    private TextArea createTextArea() {
        TextArea textArea = new TextArea();
        textArea.setEditable(false);
        return textArea;
    }

    private FlowPane createButtonPane() {
        MenuButton chooseMenuButton = new MenuButton("Välj en värdesak: ");
        MenuItem jewelleryMenuItem = createJewelleryMenuItem();
        MenuItem stockMenuItem = createStockMenuItem();
        MenuItem applianceMenuItem = createApplianceMenuItem();
        chooseMenuButton.getItems().addAll(jewelleryMenuItem, stockMenuItem, applianceMenuItem);

        Button show = new Button("Visa");
        show.setOnAction(new ShowHandler());
        Button stockMarketCrash = createMarketCrashButton();

        FlowPane pane = new FlowPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(5));
        pane.setHgap(5);
        pane.getChildren().addAll(chooseMenuButton, show, stockMarketCrash);
        return pane;
    }

    private Button createMarketCrashButton() {
        Button stockMarketCrash = new Button("Börskrasch");
        stockMarketCrash.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                for (Stock s : stocks) {
                    s.setRate(0);
                }
            }
        });
        return stockMarketCrash;
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


    private MenuItem createJewelleryMenuItem() {
        MenuItem menuItem = new MenuItem("Smycke");
        menuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    JewelleryInputForm jewelleryInputForm = new JewelleryInputForm();
                    Optional<ButtonType> answer = jewelleryInputForm.showAndWait();
                    if (answer.isPresent() && answer.get() == ButtonType.OK) {
                        String name = jewelleryInputForm.getName();
                        if (name.isEmpty()) {
                            Alert alert = new Alert(Alert.AlertType.ERROR);
                            alert.setTitle("Fel!");
                            alert.setHeaderText("Felaktig inmatning!");
                            alert.showAndWait();
                            return;
                        }
                        int jewels = jewelleryInputForm.getJewels();
                        boolean material = jewelleryInputForm.getMaterial();
                    }
                } catch (NumberFormatException e) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Fel!");
                    alert.setHeaderText("Felaktig inmatning!");
                    alert.showAndWait();
                }
            }

        });
        return menuItem;
    }

    private MenuItem createStockMenuItem() {
        MenuItem menuItem = new MenuItem("Aktie");
        menuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    StockInputForm stockInputForm = new StockInputForm();
                    Optional<ButtonType> answer = stockInputForm.showAndWait();
                    if (answer.isPresent() && answer.get() == ButtonType.OK) {
                        String name = stockInputForm.getName();
                        if (name.isEmpty()) {
                            Alert alert = new Alert(Alert.AlertType.ERROR);
                            alert.setTitle("Fel!");
                            alert.setHeaderText("Felaktig inmatning!");
                            alert.showAndWait();
                            return;
                        }
                        int numbers = stockInputForm.getNumbers();
                        int price = stockInputForm.getPrice();
                    }
                } catch (NumberFormatException e) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Fel!");
                    alert.setHeaderText("Felaktig inmatning!");
                    alert.showAndWait();
                }
            }

        });
        return menuItem;
    }

    private MenuItem createApplianceMenuItem() {
        MenuItem menuItem = new MenuItem("Apparat");
        menuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    ApplianceInputForm applianceInputForm = new ApplianceInputForm();
                    Optional<ButtonType> answer = applianceInputForm.showAndWait();
                    if (answer.isPresent() && answer.get() == ButtonType.OK) {
                        String name = applianceInputForm.getName();
                        if (name.isEmpty()) {
                            Alert alert = new Alert(Alert.AlertType.ERROR);
                            alert.setTitle("Fel!");
                            alert.setHeaderText("Felaktig inmatning!");
                            alert.showAndWait();
                            return;
                        }
                        int price = applianceInputForm.getPrice();
                        int wear = applianceInputForm.getWear();
                    }
                } catch (NumberFormatException e) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Fel!");
                    alert.setHeaderText("Felaktig inmatning!");
                    alert.showAndWait();
                }
            }

        });
        return menuItem;
    }

    class ShowHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            System.out.println("Visa");
        }
    }

    class StockMarketHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            for (Stock s : stocks) {
                s.setRate(0);
            }
        }
    }
}