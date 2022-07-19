package com.example.billingapp.menuler;

import com.example.billingapp.Urun;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class UrunListeleMenu extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.BOTTOM_LEFT);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        for (int i = 0; i < Urun.getButunUrunlerMapi().size(); i++) {

        }

        Urun faraziUrun = new Urun();

        Scene scene = new Scene(satirOlustur(faraziUrun), 500, 500);
        primaryStage.setTitle("ShowGridPane");
        primaryStage.setScene(scene);
        primaryStage.show();



        satirOlustur(faraziUrun);
    }

    public Pane satirOlustur(Urun urun) {
        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(11, 12, 13, 14));
        pane.setHgap(5);
        pane.setVgap(5);
        // Place nodes in the pane

        Urun faraziUrun1 = new Urun("Cokonat",500);
        Urun faraziUrun2 = new Urun("Cokonat",500);
        Urun faraziUrun3 = new Urun("Cokonat",500);

        pane.getChildren().addAll(new Label(faraziUrun1.getIsim()),new Label("" + faraziUrun1.getId()),new Label("" + faraziUrun1.getMiktar()));
        TextField tfMi = new TextField();
        tfMi.setPrefColumnCount(1);
        pane.getChildren().addAll(tfMi, new Label("Last Name:"), new TextField());

        Scene scene = new Scene(pane, 210, 150);
        // Display the stage
        return pane;
    }

}
