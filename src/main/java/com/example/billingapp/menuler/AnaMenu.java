package com.example.billingapp.menuler;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AnaMenu extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        // Place nodes in the pane at positions column,row
        Button stokYonetimiButonu = new Button("Stok Yonetimi");
        pane.add(stokYonetimiButonu,0,0);
        Button musteriYonetimiButonu = new Button("Musteri Yonetimi");
        pane.add(musteriYonetimiButonu,1,0);
        Button cikisButonu = new Button("cikis");
        pane.add(cikisButonu,0,1);

        GridPane.setHalignment(cikisButonu, HPos.CENTER);

        class EnlargeHandler implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent e) {

            }
        }

        Scene scene = new Scene(pane);
        primaryStage.setTitle("ShowGridPane");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
