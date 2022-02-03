package com.example.liftproject;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class GUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    //az egész scene egy 3 hboxból álló vbox
    VBox vbox = new VBox();

    //hboxS a szervizpanel, 3 fő oszlopa vboxS1, vboxS2 és vboxS3
    HBox hboxS = new HBox();
    VBox vboxS1 = new VBox();
    HBox hboxS11 = new HBox();
    VBox vboxS111 = new VBox();
    VBox vboxS112 = new VBox();
    VBox vboxS113 = new VBox();
    VBox vboxS114 = new VBox();
    VBox vboxS115 = new VBox();
    Label f2_S = new Label("2. emelet");
    Circle f2_SCircle = new Circle(10);
    Label f1_S = new Label("1. emelet");
    Circle f1_SCircle = new Circle(10);
    Label f0_S = new Label("Földszint");
    Circle f0_SCircle = new Circle(10);
    Label cellar_S = new Label("Pince");
    Circle cellar_SCircle = new Circle(10);
    Label garage_S = new Label("Parkoló");
    Circle garage_SCircle = new Circle(10);

    HBox hboxS12 = new HBox();
    VBox vboxS121 = new VBox();
    VBox vboxS122 = new VBox();
    VBox vboxS123 = new VBox();
    Label fireS = new Label("Tűzérzékelő");
    Circle fireSCircle = new Circle(20);
    Label emergencyS = new Label("Segélyhívó");
    Circle emergencySCircle = new Circle(20);
    Label overloadS = new Label("Túlsúly");
    Circle overloadSCircle = new Circle(20);

    VBox vboxS2 = new VBox();
    Label doorStateS = new Label("Lift ajtó állapot jelző");
    Label doorOpenInProgS = new Label("Ajtó nyitás folyamatban");
    Label doorOpenedS = new Label("Ajtó nyitva");
    Label doorCloseInProgS = new Label("Ajtó zárás folyamatban");
    Label doorClosedS = new Label("Ajtó zárva");

    VBox vboxS3 = new VBox();
    RadioButton mainSwitch = new RadioButton("Főkapcsoló");
    RadioButton doorEmergencyOpener = new RadioButton("Ajtó vésznyitó");

    //hboxFL-ben (FL: Floors&Lift) vannak az emeletek paneljai és a lift kabin kezelő gombok, ezek mind vbox-ok
    HBox hboxFL = new HBox();
    VBox vboxF2 = new VBox();
    Circle movingCircleF2 = new Circle(5);
    Circle outOfServiceF2 = new Circle(5);
    Button callLiftDownF2 = new Button();

    VBox vboxF1 = new VBox();
    Circle movingCircleF1 = new Circle(5);
    Circle outOfServiceF1 = new Circle(5);
    Button callLiftUpF1 = new Button();
    Button callLiftDownF1 = new Button();

    VBox vboxF0 = new VBox();
    Circle movingCircleF0 = new Circle(5);
    Circle outOfServiceF0 = new Circle(5);
    Button callLiftUpF0 = new Button();
    Button callLiftDownF0 = new Button();

    VBox vboxCellar = new VBox();
    Circle movingCircleCellar = new Circle(5);
    Circle outOfServiceCellar = new Circle(5);
    Button callLiftUpCellar = new Button();
    Button callLiftDownCellar = new Button();

    VBox vboxGarage = new VBox();
    Circle movingCircleGarage = new Circle(5);
    Circle outOfServiceGarage = new Circle(5);
    Button callLiftUpGarage = new Button();

    VBox vboxLift = new VBox();


    Scene scene = new Scene(vbox);


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Lift simulation");
        primaryStage.setScene(scene);

        //Szervízpanel:
        f2_SCircle.setFill(Color.GRAY);
        f1_SCircle.setFill(Color.GRAY);
        f0_SCircle.setFill(Color.GRAY);
        cellar_SCircle.setFill(Color.GRAY);
        garage_SCircle.setFill(Color.GRAY);
        fireSCircle.setFill(Color.GRAY);
        emergencySCircle.setFill(Color.GRAY);
        overloadSCircle.setFill(Color.GRAY);

        ObservableList S111 = vboxS111.getChildren();
        S111.addAll(f2_S, f2_SCircle);
        ObservableList S112 = vboxS112.getChildren();
        S112.addAll(f1_S, f1_SCircle);
        ObservableList S113 = vboxS113.getChildren();
        S113.addAll(f0_S, f0_SCircle);
        ObservableList S114 = vboxS114.getChildren();
        S114.addAll(cellar_S, cellar_SCircle);
        ObservableList S115 = vboxS115.getChildren();
        S115.addAll(garage_S, garage_SCircle);

        ObservableList S11 = hboxS11.getChildren();
        S11.addAll(vboxS111, vboxS112, vboxS113, vboxS114, vboxS115);
        vboxS111.setSpacing(10);
        vboxS111.setAlignment(Pos.CENTER);
        vboxS112.setSpacing(10);
        vboxS112.setAlignment(Pos.CENTER);
        vboxS113.setSpacing(10);
        vboxS113.setAlignment(Pos.CENTER);
        vboxS114.setSpacing(10);
        vboxS114.setAlignment(Pos.CENTER);
        vboxS115.setSpacing(10);
        vboxS115.setAlignment(Pos.CENTER);
        hboxS11.setSpacing(10);

        ObservableList S121 = vboxS121.getChildren();
        S121.addAll(fireS, fireSCircle);
        ObservableList S122 = vboxS122.getChildren();
        S122.addAll(emergencyS, emergencySCircle);
        ObservableList S123 = vboxS123.getChildren();
        S123.addAll(overloadS, overloadSCircle);

        ObservableList S12 = hboxS12.getChildren();
        S12.addAll(vboxS121, vboxS122, vboxS123);
        vboxS121.setSpacing(10);
        vboxS121.setAlignment(Pos.CENTER);
        vboxS122.setSpacing(10);
        vboxS122.setAlignment(Pos.CENTER);
        vboxS123.setSpacing(10);
        vboxS123.setAlignment(Pos.CENTER);
        hboxS12.setSpacing(40);
        hboxS12.setPadding(new Insets(30, 0, 0, 0));

        ObservableList S1 = vboxS1.getChildren();
        S1.addAll(new Label("Lift szervíz panel"), hboxS11, hboxS12);
        vboxS1.setSpacing(10);
        vboxS1.setPadding(new Insets(20, 20, 20, 20));

        ObservableList S2 = vboxS2.getChildren();
        S2.addAll(doorStateS, doorOpenInProgS, doorOpenedS, doorCloseInProgS, doorClosedS);
        vboxS2.setAlignment(Pos.BOTTOM_CENTER);
        vboxS2.setSpacing(10);
        vboxS2.setPadding(new Insets(20, 20, 20, 20));
        doorOpenInProgS.setStyle("-fx-border-color:black");
        doorOpenInProgS.setPrefSize(140, 25);
        doorOpenInProgS.setAlignment(Pos.CENTER);
        doorOpenedS.setStyle("-fx-border-color:black");
        doorOpenedS.setPrefSize(140, 25);
        doorOpenedS.setAlignment(Pos.CENTER);
        doorCloseInProgS.setStyle("-fx-border-color:black");
        doorCloseInProgS.setPrefSize(140, 25);
        doorCloseInProgS.setAlignment(Pos.CENTER);
        doorClosedS.setStyle("-fx-border-color:black");
        doorClosedS.setPrefSize(140, 25);
        doorClosedS.setAlignment(Pos.CENTER);

        ObservableList S3 = vboxS3.getChildren();
        S3.addAll(mainSwitch, doorEmergencyOpener);
        vboxS3.setAlignment(Pos.BOTTOM_LEFT);
        vboxS3.setSpacing(30);
        vboxS3.setPadding(new Insets(20, 20, 20, 20));

        ObservableList S = hboxS.getChildren();
        S.addAll(vboxS1, vboxS2, vboxS3);
        hboxS.setStyle("-fx-border-color:black");

        //Emeletek paneljai és a lift kabin kezelő gombok vboxF2
        ObservableList FL_F2 = vboxF2.getChildren();
        FL_F2.addAll(new Label("2. EMELET"), new Label("Foglalt-Mozgásban"), movingCircleF2, new Label("Üzemen kívül"), outOfServiceF2, new Label(" "), callLiftDownF2);
        movingCircleF2.setFill(Color.GRAY);
        outOfServiceF2.setFill(Color.GRAY);
        callLiftDownF2.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: gray;");

        ObservableList FL_F1 = vboxF1.getChildren();
        FL_F1.addAll(new Label("1. EMELET"), new Label("Foglalt-Mozgásban"), movingCircleF1, new Label("Üzemen kívül"), outOfServiceF1, callLiftUpF1, callLiftDownF1);
        movingCircleF1.setFill(Color.GRAY);
        outOfServiceF1.setFill(Color.GRAY);
        callLiftUpF1.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: gray;");
        callLiftDownF1.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: gray;");

        ObservableList FL_F0 = vboxF0.getChildren();
        FL_F0.addAll(new Label("FÖLDSZINT"), new Label("Foglalt-Mozgásban"), movingCircleF0, new Label("Üzemen kívül"), outOfServiceF0, callLiftUpF0, callLiftDownF0);
        movingCircleF0.setFill(Color.GRAY);
        outOfServiceF0.setFill(Color.GRAY);
        callLiftUpF0.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: gray;");
        callLiftDownF0.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: gray;");

        ObservableList FL_Cellar = vboxCellar.getChildren();
        FL_Cellar.addAll(new Label("PINCE"), new Label("Foglalt-Mozgásban"), movingCircleCellar, new Label("Üzemen kívül"), outOfServiceCellar, callLiftUpCellar, callLiftDownCellar);
        movingCircleCellar.setFill(Color.GRAY);
        outOfServiceCellar.setFill(Color.GRAY);
        callLiftUpCellar.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: gray;");
        callLiftDownCellar.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: gray;");

        ObservableList FL_Garage = vboxGarage.getChildren();
        FL_Garage.addAll(new Label("PARKOLÓ"), new Label("Foglalt-Mozgásban"), movingCircleGarage, new Label("Üzemen kívül"), outOfServiceGarage, callLiftUpGarage);
        movingCircleGarage.setFill(Color.GRAY);
        outOfServiceGarage.setFill(Color.GRAY);
        callLiftUpGarage.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: gray;");

        ObservableList FL = hboxFL.getChildren();
        FL.addAll(vboxF2, vboxF1, vboxF0, vboxCellar, vboxGarage);
        hboxFL.setSpacing(10);
        vboxF2.setSpacing(10);
        vboxF2.setPadding(new Insets(20, 20, 10, 10));
        vboxF2.setAlignment(Pos.TOP_CENTER);
        vboxF2.setStyle("-fx-border-color:black");
        vboxF1.setSpacing(10);
        vboxF1.setPadding(new Insets(20, 20, 10, 10));
        vboxF1.setAlignment(Pos.TOP_CENTER);
        vboxF1.setStyle("-fx-border-color:black");
        vboxF0.setSpacing(10);
        vboxF0.setPadding(new Insets(20, 20, 10, 10));
        vboxF0.setAlignment(Pos.TOP_CENTER);
        vboxF0.setStyle("-fx-border-color:black");
        vboxCellar.setSpacing(10);
        vboxCellar.setPadding(new Insets(20, 20, 10, 10));
        vboxCellar.setAlignment(Pos.TOP_CENTER);
        vboxCellar.setStyle("-fx-border-color:black");
        vboxGarage.setSpacing(10);
        vboxGarage.setPadding(new Insets(20, 20, 10, 10));
        vboxGarage.setAlignment(Pos.TOP_CENTER);
        vboxGarage.setStyle("-fx-border-color:black");


        //ide jön még a lift panel


        //Teszt panel:



        //Teljes scene:
        ObservableList all = vbox.getChildren();
        all.addAll(hboxS, hboxFL);
        vbox.setSpacing(20);
        vbox.setPadding(new Insets(20, 20, 20, 20));

        primaryStage.show();


    }
}


