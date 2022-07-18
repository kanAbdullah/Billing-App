package com.example.billingapp.menuler;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class StokYonetimMenu extends Application {

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

        Button urunListeleButonu = new Button("Urun Listele");
        pane.add(urunListeleButonu,0,0);
        Button urunekleButonu = new Button("Urun Ekle");
        pane.add(urunekleButonu,0,1);
        Button urunCikarButonu = new Button("Urun Cikar");
        pane.add(urunCikarButonu,0,2);
        Button urunGuncelleButonu = new Button("Urun Guncelle");
        pane.add(urunGuncelleButonu,0,3);
        Button geriButonu = new Button("Geri");
        pane.add(geriButonu,0,4);

        Scene scene = new Scene(pane,500,500);
        primaryStage.setTitle("ShowGridPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
