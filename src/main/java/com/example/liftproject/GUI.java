package com.example.liftproject;

import javafx.application.Application;
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
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

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
    Circle fireCircleS = new Circle(20);
    Label emergencyS = new Label("Segélyhívó");
    Circle emergencyCircleS = new Circle(20);
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
    Label liftPositionNoF2 = new Label("--");
    Button callLiftDownF2 = new Button();

    VBox vboxF1 = new VBox();
    Circle movingCircleF1 = new Circle(5);
    Circle outOfServiceF1 = new Circle(5);
    Label liftPositionNoF1 = new Label("--");
    Button callLiftUpF1 = new Button();
    Button callLiftDownF1 = new Button();

    VBox vboxF0 = new VBox();
    Circle movingCircleF0 = new Circle(5);
    Circle outOfServiceF0 = new Circle(5);
    Label liftPositionNoF0 = new Label("--");
    Button callLiftUpF0 = new Button();
    Button callLiftDownF0 = new Button();

    VBox vboxCellar = new VBox();
    Circle movingCircleCellar = new Circle(5);
    Circle outOfServiceCellar = new Circle(5);
    Label liftPositionNoCellar = new Label("--");
    Button callLiftUpCellar = new Button();
    Button callLiftDownCellar = new Button();

    VBox vboxGarage = new VBox();
    Circle movingCircleGarage = new Circle(5);
    Circle outOfServiceGarage = new Circle(5);
    Label liftPositionNoGarage = new Label("--");
    Button callLiftUpGarage = new Button();

    HBox hboxLift = new HBox();
    VBox vboxLift = new VBox();
    VBox vBoxliftButtons = new VBox();
    Button liftButtonF2 = new Button("2");
    Button liftButtonF1 = new Button("1");
    Button liftButtonF0 = new Button("Fsz.");
    Button liftButtonCellar = new Button("P.");
    Button liftButtonGarage = new Button("G.");

    VBox vboxLiftArrows = new VBox();
    Label liftArrowUp = new Label("⇧");
    Label liftPositionNoLift = new Label("--");
    Label liftArrowDown = new Label("⇩");

    VBox vboxLiftRightSide = new VBox();
    Label overloadLift = new Label("Túlsúly jelzés\n13 fő vagy 1000 kg");
    Label safeGettingOut = new Label("Biztonságos\na kiszállás");
    HBox hboxDoorButtonsLift = new HBox();
    Button openDoor = new Button("◁▷");
    Button closeDoor = new Button("▷◁");
    HBox hboxLabelsLift = new HBox();
    HBox hboxEmergencyLineLift = new HBox();
    Circle fireCircleLift = new Circle(20);
    Button emergencyButtonLift = new Button();


    Scene scene = new Scene(vbox);


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Lift simulation");
        primaryStage.setScene(scene);

        //Szervízpanel:
        f2_SCircle.setFill(Color.LIGHTGRAY);
        f1_SCircle.setFill(Color.LIGHTGRAY);
        f0_SCircle.setFill(Color.LIGHTGRAY);
        cellar_SCircle.setFill(Color.LIGHTGRAY);
        garage_SCircle.setFill(Color.LIGHTGRAY);
        fireCircleS.setFill(Color.LIGHTGRAY);
        emergencyCircleS.setFill(Color.LIGHTGRAY);
        overloadSCircle.setFill(Color.LIGHTGRAY);

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
        S121.addAll(fireS, fireCircleS);
        ObservableList S122 = vboxS122.getChildren();
        S122.addAll(emergencyS, emergencyCircleS);
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
        FL_F2.addAll(new Label("2. EMELET"), new Label("Foglalt-Mozgásban"), movingCircleF2, new Label("Üzemen kívül"), outOfServiceF2, liftPositionNoF2, new Label(" "), callLiftDownF2);
        movingCircleF2.setFill(Color.GRAY);
        outOfServiceF2.setFill(Color.GRAY);
        liftPositionNoF2.setMinWidth(50);
        liftPositionNoF2.setMinHeight(50);
        liftPositionNoF2.setAlignment(Pos.CENTER);
        liftPositionNoF2.setStyle("-fx-border-color:black");
        callLiftDownF2.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: gray;");

        ObservableList FL_F1 = vboxF1.getChildren();
        FL_F1.addAll(new Label("1. EMELET"), new Label("Foglalt-Mozgásban"), movingCircleF1, new Label("Üzemen kívül"), outOfServiceF1, liftPositionNoF1, callLiftUpF1, callLiftDownF1);
        movingCircleF1.setFill(Color.GRAY);
        outOfServiceF1.setFill(Color.GRAY);
        liftPositionNoF1.setMinWidth(50);
        liftPositionNoF1.setMinHeight(50);
        liftPositionNoF1.setAlignment(Pos.CENTER);
        liftPositionNoF1.setStyle("-fx-border-color:black");
        callLiftUpF1.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: gray;");
        callLiftDownF1.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: gray;");

        ObservableList FL_F0 = vboxF0.getChildren();
        FL_F0.addAll(new Label("FÖLDSZINT"), new Label("Foglalt-Mozgásban"), movingCircleF0, new Label("Üzemen kívül"), outOfServiceF0, liftPositionNoF0, callLiftUpF0, callLiftDownF0);
        movingCircleF0.setFill(Color.GRAY);
        outOfServiceF0.setFill(Color.GRAY);
        liftPositionNoF0.setMinWidth(50);
        liftPositionNoF0.setMinHeight(50);
        liftPositionNoF0.setAlignment(Pos.CENTER);
        liftPositionNoF0.setStyle("-fx-border-color:black");
        callLiftUpF0.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: gray;");
        callLiftDownF0.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: gray;");

        ObservableList FL_Cellar = vboxCellar.getChildren();
        FL_Cellar.addAll(new Label("PINCE"), new Label("Foglalt-Mozgásban"), movingCircleCellar, new Label("Üzemen kívül"), outOfServiceCellar, liftPositionNoCellar, callLiftUpCellar, callLiftDownCellar);
        movingCircleCellar.setFill(Color.GRAY);
        outOfServiceCellar.setFill(Color.GRAY);
        liftPositionNoCellar.setMinWidth(50);
        liftPositionNoCellar.setMinHeight(50);
        liftPositionNoCellar.setAlignment(Pos.CENTER);
        liftPositionNoCellar.setStyle("-fx-border-color:black");
        callLiftUpCellar.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: gray;");
        callLiftDownCellar.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: gray;");

        ObservableList FL_Garage = vboxGarage.getChildren();
        FL_Garage.addAll(new Label("PARKOLÓ"), new Label("Foglalt-Mozgásban"), movingCircleGarage, new Label("Üzemen kívül"), outOfServiceGarage, liftPositionNoGarage, callLiftUpGarage);
        movingCircleGarage.setFill(Color.GRAY);
        outOfServiceGarage.setFill(Color.GRAY);
        liftPositionNoGarage.setMinWidth(50);
        liftPositionNoGarage.setMinHeight(50);
        liftPositionNoGarage.setAlignment(Pos.CENTER);
        liftPositionNoGarage.setStyle("-fx-border-color:black");
        callLiftUpGarage.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: gray;");

        //Lift panel:
        ObservableList liftButtonList = vBoxliftButtons.getChildren();
        liftButtonList.addAll(liftButtonF2, liftButtonF1, liftButtonF0, liftButtonCellar, liftButtonGarage);
        liftButtonF2.setShape(new Circle(40));
        liftButtonF2.setPrefSize(40,40);
        liftButtonF1.setShape(new Circle(40));
        liftButtonF1.setPrefSize(40,40);
        liftButtonF0.setShape(new Circle(40));
        liftButtonF0.setPrefSize(40,40);
        liftButtonCellar.setShape(new Circle(40));
        liftButtonCellar.setPrefSize(40,40);
        liftButtonGarage.setShape(new Circle(40));
        liftButtonGarage.setPrefSize(40,40);
        vBoxliftButtons.setAlignment(Pos.BOTTOM_CENTER);
        vBoxliftButtons.setSpacing(5);

        ObservableList liftArrowList = vboxLiftArrows.getChildren();
        liftArrowList.addAll(liftArrowUp, liftPositionNoLift, liftArrowDown);
        liftArrowUp.setFont(new Font("Arial", 50));
        liftArrowDown.setFont(new Font("Arial", 50));
        liftPositionNoLift.setMinWidth(50);
        liftPositionNoLift.setMinHeight(50);
        liftPositionNoLift.setAlignment(Pos.CENTER);
        liftPositionNoLift.setStyle("-fx-border-color:black");
        vboxLiftArrows.setAlignment(Pos.CENTER);

        ObservableList doorButtonsLiftList = hboxDoorButtonsLift.getChildren();
        doorButtonsLiftList.addAll(openDoor, closeDoor);
        openDoor.setShape(new Circle(20));
        openDoor.setPrefSize(50,50);
        openDoor.setFont(new Font("Arial", 20));
        openDoor.setAlignment(Pos.CENTER);
        closeDoor.setShape(new Circle(20));
        closeDoor.setPrefSize(50,50);
        closeDoor.setFont(new Font("Arial", 20));
        openDoor.setAlignment(Pos.CENTER);
        hboxDoorButtonsLift.setSpacing(5);
        hboxDoorButtonsLift.setAlignment(Pos.CENTER);

        ObservableList LabelsList = hboxLabelsLift.getChildren();
        LabelsList.addAll(new Label("Tűzjelzés"), new Label("Vészjelző"));
        hboxLabelsLift.setSpacing(10);
        hboxLabelsLift.setAlignment(Pos.CENTER);

        ObservableList emergencyLineLiftList = hboxEmergencyLineLift.getChildren();
        emergencyLineLiftList.addAll(fireCircleLift, emergencyButtonLift);
        fireCircleLift.setFill(Color.GRAY);
        emergencyButtonLift.setShape(new Circle(20));
        emergencyButtonLift.setPrefSize(40,40);
        emergencyButtonLift.setStyle("-fx-background-color:red");
        hboxEmergencyLineLift.setSpacing(20);
        hboxEmergencyLineLift.setAlignment(Pos.CENTER);

        ObservableList LiftRightSideList = vboxLiftRightSide.getChildren();
        LiftRightSideList.addAll(overloadLift, safeGettingOut, hboxDoorButtonsLift, hboxLabelsLift, hboxEmergencyLineLift);
        overloadLift.setMinWidth(150);
        overloadLift.setMinHeight(50);
        overloadLift.setAlignment(Pos.CENTER);
        overloadLift.setTextAlignment(TextAlignment.CENTER);
        overloadLift.setStyle("-fx-border-color:black; -fx-background-color:darkseagreen");
        safeGettingOut.setMinWidth(150);
        safeGettingOut.setMinHeight(50);
        safeGettingOut.setAlignment(Pos.CENTER);
        safeGettingOut.setTextAlignment(TextAlignment.CENTER);
        safeGettingOut.setStyle("-fx-border-color:black; -fx-background-color:lightgray");
        vboxLiftRightSide.setSpacing(15);
        vboxLiftRightSide.setAlignment(Pos.BOTTOM_CENTER);


        ObservableList liftList = hboxLift.getChildren();
        liftList.addAll(vBoxliftButtons, vboxLiftArrows, vboxLiftRightSide);
        vBoxliftButtons.setAlignment(Pos.CENTER);
        vboxLiftArrows.setAlignment(Pos.CENTER);
        hboxLift.setSpacing(20);
        hboxLift.setPadding(new Insets(20, 0, 0, 0));
        hboxLift.setAlignment(Pos.CENTER);
        ObservableList liftList2 = vboxLift.getChildren();
        liftList2.addAll(new Label("Lift kabin kezelő gombok"), hboxLift);

        //Emeletek és lift panel egymás mellett:
        ObservableList FL = hboxFL.getChildren();
        FL.addAll(vboxF2, vboxF1, vboxF0, vboxCellar, vboxGarage, vboxLift);
        hboxFL.setSpacing(10);
        vboxF2.setSpacing(10);
        vboxF2.setPadding(new Insets(10, 20, 10, 10));
        vboxF2.setAlignment(Pos.TOP_CENTER);
        vboxF2.setStyle("-fx-border-color:black");
        vboxF1.setSpacing(10);
        vboxF1.setPadding(new Insets(10, 20, 10, 10));
        vboxF1.setAlignment(Pos.TOP_CENTER);
        vboxF1.setStyle("-fx-border-color:black");
        vboxF0.setSpacing(10);
        vboxF0.setPadding(new Insets(10, 20, 10, 10));
        vboxF0.setAlignment(Pos.TOP_CENTER);
        vboxF0.setStyle("-fx-border-color:black");
        vboxCellar.setSpacing(10);
        vboxCellar.setPadding(new Insets(10, 20, 10, 10));
        vboxCellar.setAlignment(Pos.TOP_CENTER);
        vboxCellar.setStyle("-fx-border-color:black");
        vboxGarage.setSpacing(10);
        vboxGarage.setPadding(new Insets(10, 20, 10, 10));
        vboxGarage.setAlignment(Pos.TOP_CENTER);
        vboxGarage.setStyle("-fx-border-color:black");
        vboxLift.setPadding(new Insets(10, 20, 10, 10));
        vboxLift.setStyle("-fx-border-color:black");



        //Teszt panel:



        //Teljes scene:
        ObservableList all = vbox.getChildren();
        all.addAll(hboxS, hboxFL);
        vbox.setSpacing(20);
        vbox.setPadding(new Insets(20, 20, 20, 20));

        primaryStage.show();


    }
}


