package com.example.liftproject;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class GUI extends Application {

/**
 * az egész scene egy 3 hboxból álló vbox egy scrollpane-be téve, hogy legyen scrollbar
 */
    VBox vbox = new VBox();
    ScrollPane scrollpane = new ScrollPane();

    //hboxS a szervizpanel, fő oszlopai: vboxS1, vboxS2, főkapcsoló label + gomb és ajtó vésznyitó gomb
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
    Label fireCircleSLabel = new Label("Tűzérzékelő");
    Circle fireCircleS = new Circle(20);
    Label emergencyCircleSLabel = new Label("Segélyhívó");
    Circle emergencyCircleS = new Circle(20);
    Label overloadCircleSLabel = new Label("Túlsúly");
    Circle overloadSCircle = new Circle(20);

    VBox vboxS2 = new VBox();
    Label doorStateS = new Label("Lift ajtó állapot jelző");
    Label doorOpenInProgS = new Label("Ajtó nyitás folyamatban");
    Label doorOpenedS = new Label("Ajtó nyitva");
    Label doorCloseInProgS = new Label("Ajtó zárás folyamatban");
    Label doorClosedS = new Label("Ajtó zárva");

    Label mainSwitchLabel = new Label("Főkapcsoló ON");
    Button mainSwitch = new Button("OFF");
    Button doorEmergencyOpener = new Button("Ajtó vésznyitó");

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

    //hboxTB-ben (TB: Test Block) van a tesztpanel
    HBox hboxTB = new HBox();
    VBox vboxTB1 = new VBox();
    HBox simgombok1 = new HBox();
    Button startSimTB = new Button("Start");
    Button stopSimTB = new Button("Stop");
    HBox simgombok2 = new HBox();
    TextField intervalSimTB = new TextField("");
    HBox simgombok3 = new HBox();
    Button stepForwardSimTB = new Button("Lépés előre");
    Button stepBackSimTB = new Button("Lépés Vissza");

    VBox vboxTB2 = new VBox();
    Button doorObstacleTB = new Button("Ajtó útjában akadály");
    Button liftOverloadTB = new Button("Túlsúly");
    Button fireAlarmTB = new Button("Tűzjelzés");
    Button motorShutdownTB = new Button("Felvonómotor leállás");
    Button powerOutageTB = new Button("Áramszünet");

    VBox vboxTB3 = new VBox();
    Label liftPositionF2_TB = new Label("2. emelet");
    Label liftPositionF12_TB = new Label("Köztes pozíció");
    Label liftPositionF1_TB = new Label("0. emelet");
    Label liftPositionF01_TB = new Label("Köztes pozíció");
    Label liftPositionF0_TB = new Label("Földszint");
    Label liftPositionCF0_TB = new Label("Köztes pozíció");
    Label liftPositionCellar_TB = new Label("Pince");
    Label liftPositionCG_TB = new Label("Köztes pozíció");
    Label liftPositionGarage_TB = new Label("Garázs");

    VBox vboxTB4 = new VBox();
    Label liftArrowUp_TB = new Label("⇧");
    Label liftPositionNo_TB = new Label("--");
    Label liftArrowDown_TB = new Label("⇩");

    VBox vboxTB5 = new VBox();
    ScrollPane logPanelTB = new ScrollPane();

    Scene scene = new Scene(scrollpane);

/**
 * GUI OSZTÁLY BEMENETEI:
 */
    private short intervalSim = 1;
    private Text logPanelText = new Text("");

    public void setIntervalSim(short intervalSim) {
        this.intervalSim = intervalSim;
    }
    public void setLogPanelText(Text logPanelText) {
        this.logPanelText = logPanelText;
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Lift simulation");
        primaryStage.setScene(scene);

    /**
     * Szervízpanel
     */
        f2_SCircle.setFill(Color.LIGHTGRAY);
        f1_SCircle.setFill(Color.LIGHTGRAY);
        f0_SCircle.setFill(Color.LIGHTGRAY);
        cellar_SCircle.setFill(Color.LIGHTGRAY);
        garage_SCircle.setFill(Color.LIGHTGRAY);
        fireCircleS.setFill(Color.LIGHTGRAY);
        emergencyCircleS.setFill(Color.LIGHTGRAY);
        overloadSCircle.setFill(Color.LIGHTGRAY);
        mainSwitch.setStyle("-fx-background-color: INDIANRED");

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
        S121.addAll(fireCircleSLabel, fireCircleS);
        ObservableList S122 = vboxS122.getChildren();
        S122.addAll(emergencyCircleSLabel, emergencyCircleS);
        ObservableList S123 = vboxS123.getChildren();
        S123.addAll(overloadCircleSLabel, overloadSCircle);

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
        S1.addAll(new Label("LIFT SZERVÍZ PANEL"), hboxS11, hboxS12);
        vboxS1.setSpacing(10);
        vboxS1.setPadding(new Insets(20, 20, 20, 20));

        ObservableList S2 = vboxS2.getChildren();
        S2.addAll(doorStateS, doorOpenInProgS, doorOpenedS, doorCloseInProgS, doorClosedS);
        vboxS2.setAlignment(Pos.BOTTOM_CENTER);
        vboxS2.setSpacing(10);
        vboxS2.setPadding(new Insets(20, 20, 20, 20));
        doorOpenInProgS.setStyle("-fx-border-color: BLACK");
        doorOpenInProgS.setPrefSize(140, 25);
        doorOpenInProgS.setAlignment(Pos.CENTER);
        doorOpenedS.setStyle("-fx-border-color: BLACK");
        doorOpenedS.setPrefSize(140, 25);
        doorOpenedS.setAlignment(Pos.CENTER);
        doorCloseInProgS.setStyle("-fx-border-color: BLACK");
        doorCloseInProgS.setPrefSize(140, 25);
        doorCloseInProgS.setAlignment(Pos.CENTER);
        doorClosedS.setStyle("-fx-border-color: BLACK");
        doorClosedS.setPrefSize(140, 25);
        doorClosedS.setAlignment(Pos.CENTER);

        ObservableList S = hboxS.getChildren();
        S.addAll(vboxS1, vboxS2, new Label("                "), doorEmergencyOpener, mainSwitchLabel, mainSwitch);
        mainSwitchLabel.setPadding(new Insets(20, 5, 20, 50));
        mainSwitchLabel.setPrefWidth(140);
        mainSwitch.setPrefWidth(45);
        hboxS.setAlignment(Pos.CENTER_LEFT);
        hboxS.setStyle("-fx-border-color: BLACK");

    /**
     * Emeletek paneljai és a lift kabin kezelő gombok vboxF2
     */
        ObservableList FL_F2 = vboxF2.getChildren();
        FL_F2.addAll(new Label("2. EMELET\n "), new Label("Foglalt-Mozgásban"), movingCircleF2, new Label("Üzemen kívül"), outOfServiceF2, new Label(" "), liftPositionNoF2, new Label(" "), callLiftDownF2);
        movingCircleF2.setFill(Color.GRAY);
        outOfServiceF2.setFill(Color.GRAY);
        liftPositionNoF2.setMinSize(50, 50);
        liftPositionNoF2.setAlignment(Pos.CENTER);
        liftPositionNoF2.setStyle("-fx-border-color: BLACK");
        callLiftDownF2.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: GRAY;");

        ObservableList FL_F1 = vboxF1.getChildren();
        FL_F1.addAll(new Label("1. EMELET\n "), new Label("Foglalt-Mozgásban"), movingCircleF1, new Label("Üzemen kívül"), outOfServiceF1, new Label(" "), liftPositionNoF1, callLiftUpF1, callLiftDownF1);
        movingCircleF1.setFill(Color.GRAY);
        outOfServiceF1.setFill(Color.GRAY);
        liftPositionNoF1.setMinSize(50, 50);
        liftPositionNoF1.setAlignment(Pos.CENTER);
        liftPositionNoF1.setStyle("-fx-border-color: BLACK");
        callLiftUpF1.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: GRAY;");
        callLiftDownF1.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: GRAY;");

        ObservableList FL_F0 = vboxF0.getChildren();
        FL_F0.addAll(new Label("FÖLDSZINT\n "), new Label("Foglalt-Mozgásban"), movingCircleF0, new Label("Üzemen kívül"), outOfServiceF0, new Label(" "), liftPositionNoF0, callLiftUpF0, callLiftDownF0);
        movingCircleF0.setFill(Color.GRAY);
        outOfServiceF0.setFill(Color.GRAY);
        liftPositionNoF0.setMinSize(50, 50);
        liftPositionNoF0.setAlignment(Pos.CENTER);
        liftPositionNoF0.setStyle("-fx-border-color: BLACK");
        callLiftUpF0.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: GRAY;");
        callLiftDownF0.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: GRAY;");

        ObservableList FL_Cellar = vboxCellar.getChildren();
        FL_Cellar.addAll(new Label("PINCE\n "), new Label("Foglalt-Mozgásban"), movingCircleCellar, new Label("Üzemen kívül"), outOfServiceCellar, new Label(" "), liftPositionNoCellar, callLiftUpCellar, callLiftDownCellar);
        movingCircleCellar.setFill(Color.GRAY);
        outOfServiceCellar.setFill(Color.GRAY);
        liftPositionNoCellar.setMinSize(50, 50);
        liftPositionNoCellar.setAlignment(Pos.CENTER);
        liftPositionNoCellar.setStyle("-fx-border-color: BLACK");
        callLiftUpCellar.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: GRAY;");
        callLiftDownCellar.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: GRAY;");

        ObservableList FL_Garage = vboxGarage.getChildren();
        FL_Garage.addAll(new Label("GARÁZS\n "), new Label("Foglalt-Mozgásban"), movingCircleGarage, new Label("Üzemen kívül"), outOfServiceGarage, new Label(" "), liftPositionNoGarage, callLiftUpGarage);
        movingCircleGarage.setFill(Color.GRAY);
        outOfServiceGarage.setFill(Color.GRAY);
        liftPositionNoGarage.setMinSize(50, 50);
        liftPositionNoGarage.setAlignment(Pos.CENTER);
        liftPositionNoGarage.setStyle("-fx-border-color: BLACK");
        callLiftUpGarage.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: GRAY;");

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
        liftPositionNoLift.setMinSize(30, 30);
        liftPositionNoLift.setAlignment(Pos.CENTER);
        liftPositionNoLift.setStyle("-fx-border-color: BLACK");
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
        emergencyButtonLift.setStyle("-fx-background-color: INDIANRED");
        hboxEmergencyLineLift.setSpacing(20);
        hboxEmergencyLineLift.setAlignment(Pos.CENTER);

        ObservableList LiftRightSideList = vboxLiftRightSide.getChildren();
        LiftRightSideList.addAll(overloadLift, safeGettingOut, hboxDoorButtonsLift, hboxLabelsLift, hboxEmergencyLineLift);
        overloadLift.setMinSize(120, 50);
        overloadLift.setAlignment(Pos.CENTER);
        overloadLift.setTextAlignment(TextAlignment.CENTER);
        overloadLift.setStyle("-fx-border-color: BLACK; -fx-background-color: DARKSEAGREEN");
        safeGettingOut.setMinSize(120, 50);
        safeGettingOut.setAlignment(Pos.CENTER);
        safeGettingOut.setTextAlignment(TextAlignment.CENTER);
        safeGettingOut.setStyle("-fx-border-color: BLACK; -fx-background-color: LIGHTGRAY");
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
        vboxF2.setStyle("-fx-border-color: BLACK");
        vboxF1.setSpacing(10);
        vboxF1.setPadding(new Insets(10, 20, 10, 10));
        vboxF1.setAlignment(Pos.TOP_CENTER);
        vboxF1.setStyle("-fx-border-color: BLACK");
        vboxF0.setSpacing(10);
        vboxF0.setPadding(new Insets(10, 20, 10, 10));
        vboxF0.setAlignment(Pos.TOP_CENTER);
        vboxF0.setStyle("-fx-border-color: BLACK");
        vboxCellar.setSpacing(10);
        vboxCellar.setPadding(new Insets(10, 20, 10, 10));
        vboxCellar.setAlignment(Pos.TOP_CENTER);
        vboxCellar.setStyle("-fx-border-color: BLACK");
        vboxGarage.setSpacing(10);
        vboxGarage.setPadding(new Insets(10, 20, 10, 10));
        vboxGarage.setAlignment(Pos.TOP_CENTER);
        vboxGarage.setStyle("-fx-border-color: BLACK");
        vboxLift.setPadding(new Insets(10, 20, 10, 10));
        vboxLift.setStyle("-fx-border-color: BLACK");

    /**
     * Teszt panel:
     */
        ObservableList simgombok1list = simgombok1.getChildren();
        simgombok1list.addAll(startSimTB, stopSimTB);
        simgombok1.setSpacing(10);
        startSimTB.setPrefWidth(90);
        startSimTB.setAlignment(Pos.CENTER);
        stopSimTB.setPrefWidth(90);
        stopSimTB.setAlignment(Pos.CENTER);

        ObservableList simgombok2list = simgombok2.getChildren();
        simgombok2list.addAll(new Label("Lépések közti szünet (s): "), intervalSimTB);
        simgombok2.setSpacing(5);
        intervalSimTB.setPrefWidth(52);

        ObservableList simgombok3list = simgombok3.getChildren();
        simgombok3list.addAll(stepForwardSimTB, stepBackSimTB);
        simgombok3.setSpacing(10);
        stepForwardSimTB.setPrefWidth(90);
        stepForwardSimTB.setAlignment(Pos.CENTER);
        stepBackSimTB.setPrefWidth(90);
        stepBackSimTB.setAlignment(Pos.CENTER);

        ObservableList TB1list = vboxTB1.getChildren();
        TB1list.addAll(new Label("TESZT PANEL\n "), new Label("Szimuláció vezérlő"), simgombok1, simgombok2, simgombok3);
        vboxTB1.setSpacing(10);

        ObservableList TB2list = vboxTB2.getChildren();
        TB2list.addAll(new Label("Teszteset szimulációs \ngombok"), doorObstacleTB, liftOverloadTB, fireAlarmTB, motorShutdownTB, powerOutageTB);
        vboxTB2.setSpacing(10);
        doorObstacleTB.setPrefWidth(130);
        doorObstacleTB.setAlignment(Pos.CENTER);
        liftOverloadTB.setPrefWidth(130);
        liftOverloadTB.setAlignment(Pos.CENTER);
        fireAlarmTB.setPrefWidth(130);
        fireAlarmTB.setAlignment(Pos.CENTER);
        motorShutdownTB.setPrefWidth(130);
        motorShutdownTB.setAlignment(Pos.CENTER);
        powerOutageTB.setPrefWidth(130);
        powerOutageTB.setAlignment(Pos.CENTER);

        ObservableList TB3list = vboxTB3.getChildren();
        TB3list.addAll(new Label("Lift pozíció"), liftPositionF2_TB, liftPositionF12_TB, liftPositionF1_TB, liftPositionF01_TB, liftPositionF0_TB, liftPositionCF0_TB, liftPositionCellar_TB, liftPositionCG_TB, liftPositionGarage_TB);
        vboxTB3.setSpacing(10);
        liftPositionF2_TB.setStyle("-fx-border-color: BLACK");
        liftPositionF2_TB.setPrefSize(100, 25);
        liftPositionF2_TB.setAlignment(Pos.CENTER);
        liftPositionF12_TB.setStyle("-fx-border-color: BLACK");
        liftPositionF12_TB.setPrefSize(100, 25);
        liftPositionF12_TB.setAlignment(Pos.CENTER);
        liftPositionF1_TB.setStyle("-fx-border-color: BLACK");
        liftPositionF1_TB.setPrefSize(100, 25);
        liftPositionF1_TB.setAlignment(Pos.CENTER);
        liftPositionF01_TB.setStyle("-fx-border-color: BLACK");
        liftPositionF01_TB.setPrefSize(100, 25);
        liftPositionF01_TB.setAlignment(Pos.CENTER);
        liftPositionF0_TB.setStyle("-fx-border-color: BLACK");
        liftPositionF0_TB.setPrefSize(100, 25);
        liftPositionF0_TB.setAlignment(Pos.CENTER);
        liftPositionCF0_TB.setStyle("-fx-border-color: BLACK");
        liftPositionCF0_TB.setPrefSize(100, 25);
        liftPositionCF0_TB.setAlignment(Pos.CENTER);
        liftPositionCellar_TB.setStyle("-fx-border-color: BLACK");
        liftPositionCellar_TB.setPrefSize(100, 25);
        liftPositionCellar_TB.setAlignment(Pos.CENTER);
        liftPositionCG_TB.setStyle("-fx-border-color: BLACK");
        liftPositionCG_TB.setPrefSize(100, 25);
        liftPositionCG_TB.setAlignment(Pos.CENTER);
        liftPositionGarage_TB.setStyle("-fx-border-color: BLACK");
        liftPositionGarage_TB.setPrefSize(100, 25);
        liftPositionGarage_TB.setAlignment(Pos.CENTER);

        ObservableList TB4list = vboxTB4.getChildren();
        TB4list.addAll(liftArrowUp_TB, liftPositionNo_TB, liftArrowDown_TB);
        vboxTB4.setSpacing(10);
        liftArrowUp_TB.setFont(new Font("Arial", 50));
        liftArrowDown_TB.setFont(new Font("Arial", 50));
        liftPositionNo_TB.setMinSize(30, 30);
        liftPositionNo_TB.setAlignment(Pos.CENTER);
        liftPositionNo_TB.setStyle("-fx-border-color: BLACK");
        vboxTB4.setAlignment(Pos.CENTER);

        ObservableList TB5list = vboxTB5.getChildren();
        TB5list.addAll(new Label("Log panel"), logPanelTB);
        vboxTB5.setSpacing(10);
        logPanelTB.setFitToWidth(true);
        logPanelTB.setPrefSize(370, 305);
        logPanelTB.setPadding(new Insets(8, 8, 8, 8));
        logPanelTB.setStyle("-fx-border-color: BLACK");
        logPanelTB.setContent(logPanelText);

        ObservableList TBlist = hboxTB.getChildren();
        TBlist.addAll(vboxTB1, vboxTB2, vboxTB3, vboxTB4, vboxTB5);
        hboxTB.setSpacing(30);
        hboxTB.setPadding(new Insets(20, 20, 20, 20));
        hboxTB.setStyle("-fx-border-color: BLACK");

    /**
     * Teljes scene:
     */
        ObservableList all = vbox.getChildren();
        all.addAll(hboxS, hboxFL, hboxTB);
        vbox.setSpacing(20);
        vbox.setPadding(new Insets(20, 20, 20, 20));
        scrollpane.setContent(vbox);
        scrollpane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);

        primaryStage.show();

        mainSwitch.setOnAction(event);
        doorEmergencyOpener.setOnAction(event);
        callLiftDownF2.setOnAction(event);
        callLiftUpF1.setOnAction(event);
        callLiftDownF1.setOnAction(event);
        callLiftUpF0.setOnAction(event);
        callLiftDownF0.setOnAction(event);
        callLiftUpCellar.setOnAction(event);
        callLiftDownCellar.setOnAction(event);
        callLiftUpGarage.setOnAction(event);
        liftButtonF2.setOnAction(event);
        liftButtonF1.setOnAction(event);
        liftButtonF0.setOnAction(event);
        liftButtonCellar.setOnAction(event);
        liftButtonGarage.setOnAction(event);
        openDoor.setOnAction(event);
        closeDoor.setOnAction(event);
        emergencyButtonLift.setOnAction(event);
        startSimTB.setOnAction(event);
        stopSimTB.setOnAction(event);
        stepForwardSimTB.setOnAction(event);
        stepBackSimTB.setOnAction(event);
        doorObstacleTB.setOnAction(event);
        liftOverloadTB.setOnAction(event);
        fireAlarmTB.setOnAction(event);
        motorShutdownTB.setOnAction(event);
        powerOutageTB.setOnAction(event);
    }

    EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {
        /**
         * Lift szervíz panel gombjainak megnyomása
         */
            if (actionEvent.getSource() == mainSwitch) {
                if (mainSwitchLabel.getText().equals("Főkapcsoló ON")) {
                    mainSwitchLabel.setText("Főkapcsoló OFF");
                    mainSwitch.setText("ON");
                    mainSwitch.setStyle("-fx-background-color: DARKSEAGREEN");
                } else {
                    mainSwitchLabel.setText("Főkapcsoló ON");
                    mainSwitch.setText("OFF");
                    mainSwitch.setStyle("-fx-background-color: INDIANRED");
                }
            }

            if (actionEvent.getSource() == doorEmergencyOpener) {
            }

        /**
         * Emeleti hívó gombok megnyomása
         */
            if (actionEvent.getSource() == callLiftDownF2) {
                callLiftDownF2.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: GOLD;");
                callLiftUpF1.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: GRAY;");
                callLiftDownF1.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: GRAY;");
                callLiftUpF0.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: GRAY;");
                callLiftDownF0.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: GRAY;");
                callLiftUpCellar.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: GRAY;");
                callLiftDownCellar.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: GRAY;");
                callLiftUpGarage.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: GRAY;");
            }
            if (actionEvent.getSource() == callLiftUpF1) {
                callLiftUpF1.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: GOLD;");
                callLiftDownF2.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: GRAY;");
                callLiftDownF1.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: GRAY;");
                callLiftUpF0.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: GRAY;");
                callLiftDownF0.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: GRAY;");
                callLiftUpCellar.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: GRAY;");
                callLiftDownCellar.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: GRAY;");
                callLiftUpGarage.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: GRAY;");
            }
            if (actionEvent.getSource() == callLiftDownF1) {
                callLiftDownF1.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: GOLD;");
                callLiftDownF2.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: GRAY;");
                callLiftUpF1.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: GRAY;");
                callLiftUpF0.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: GRAY;");
                callLiftDownF0.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: GRAY;");
                callLiftUpCellar.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: GRAY;");
                callLiftDownCellar.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: GRAY;");
                callLiftUpGarage.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: GRAY;");
            }
            if (actionEvent.getSource() == callLiftUpF0) {
                callLiftUpF0.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: GOLD;");
                callLiftDownF2.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: GRAY;");
                callLiftUpF1.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: GRAY;");
                callLiftDownF1.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: GRAY;");
                callLiftDownF0.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: GRAY;");
                callLiftUpCellar.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: GRAY;");
                callLiftDownCellar.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: GRAY;");
                callLiftUpGarage.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: GRAY;");
            }
            if (actionEvent.getSource() == callLiftDownF0) {
                callLiftDownF0.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: GOLD;");
                callLiftDownF2.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: GRAY;");
                callLiftUpF1.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: GRAY;");
                callLiftDownF1.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: GRAY;");
                callLiftUpF0.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: GRAY;");
                callLiftUpCellar.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: GRAY;");
                callLiftDownCellar.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: GRAY;");
                callLiftUpGarage.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: GRAY;");
            }
            if (actionEvent.getSource() == callLiftUpCellar) {
                callLiftUpCellar.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: GOLD;");
                callLiftDownF2.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: GRAY;");
                callLiftUpF1.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: GRAY;");
                callLiftDownF1.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: GRAY;");
                callLiftUpF0.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: GRAY;");
                callLiftDownF0.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: GRAY;");
                callLiftDownCellar.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: GRAY;");
                callLiftUpGarage.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: GRAY;");
            }
            if (actionEvent.getSource() == callLiftDownCellar) {
                callLiftDownCellar.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: GOLD;");
                callLiftDownF2.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: GRAY;");
                callLiftUpF1.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: GRAY;");
                callLiftDownF1.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: GRAY;");
                callLiftUpF0.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: GRAY;");
                callLiftDownF0.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: GRAY;");
                callLiftUpCellar.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: GRAY;");
                callLiftUpGarage.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: GRAY;");
            }
            if (actionEvent.getSource() == callLiftUpGarage) {
                callLiftUpGarage.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: GOLD;");
                callLiftDownF2.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: GRAY;");
                callLiftUpF1.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: GRAY;");
                callLiftDownF1.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: GRAY;");
                callLiftUpF0.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: GRAY;");
                callLiftDownF0.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: GRAY;");
                callLiftUpCellar.setStyle("-fx-shape: 'M 50 0 100 20 0 20 z'; -fx-background-color: GRAY;");
                callLiftDownCellar.setStyle("-fx-shape: 'M 0 0 100 0 50 100 z'; -fx-background-color: GRAY;");
            }

        /**
         * Lift gombjainak megnyomása:
         */
            // Lift emeletjelző gombok megnyomása
            if (actionEvent.getSource() == liftButtonF2) {
                liftButtonF2.setStyle("-fx-background-color: GOLD");
            }
            if (actionEvent.getSource() == liftButtonF1) {
                liftButtonF1.setStyle("-fx-background-color: GOLD");
            }
            if (actionEvent.getSource() == liftButtonF0) {
                liftButtonF0.setStyle("-fx-background-color: GOLD");
            }
            if (actionEvent.getSource() == liftButtonCellar) {
                liftButtonCellar.setStyle("-fx-background-color: GOLD");
            }
            if (actionEvent.getSource() == liftButtonGarage) {
                liftButtonGarage.setStyle("-fx-background-color: GOLD");
            }

            // Liftben ajtó nyitó és záró gombok megnyomása
            if (actionEvent.getSource() == openDoor) {
                openDoor.setStyle("-fx-border-color: GOLD; -fx-border-width: 4");
                closeDoor.setStyle("");
            }
            if (actionEvent.getSource() == closeDoor) {
                closeDoor.setStyle("-fx-border-color: GOLD; -fx-border-width: 4");
                openDoor.setStyle("");
            }

            //Liftben vészjelző:
            if (actionEvent.getSource() == emergencyButtonLift) {
                if ( emergencyButtonLift.getStyle() == "-fx-background-color: INDIANRED" ) {
                    emergencyButtonLift.setStyle("-fx-background-color: INDIANRED; -fx-border-color: RED; -fx-border-width: 4");
                    emergencyCircleS.setFill(Color.INDIANRED);
                } else {
                    emergencyButtonLift.setStyle("-fx-background-color: INDIANRED");
                    emergencyCircleS.setFill(Color.LIGHTGRAY);
                }
            }

        /**
         * Teszt panel gombjainak megnyomása
         */
            if (actionEvent.getSource() == startSimTB) {
                stopSimTB.setStyle("");
            }
            if (actionEvent.getSource() == stopSimTB) {
                stopSimTB.setStyle("-fx-background-color: INDIANRED");
            }
            if (actionEvent.getSource() == stepForwardSimTB) {
            }
            if (actionEvent.getSource() == stepBackSimTB) {
            }
            if (actionEvent.getSource() == doorObstacleTB) {
            }
            if (actionEvent.getSource() == liftOverloadTB) {
                if ( liftOverloadTB.getStyle() == "" ) {
                    overloadSCircle.setFill(Color.INDIANRED);
                    overloadLift.setStyle("-fx-border-color: BLACK; -fx-background-color: INDIANRED");
                    liftOverloadTB.setStyle("-fx-background-color: INDIANRED");
                } else {
                    overloadSCircle.setFill(Color.LIGHTGRAY);
                    overloadLift.setStyle("-fx-border-color: BLACK; -fx-background-color: DARKSEAGREEN");
                    liftOverloadTB.setStyle("");
                }
            }

            if (actionEvent.getSource() == fireAlarmTB) {
                if ( fireAlarmTB.getStyle() == "" ) {
                    fireCircleS.setFill(Color.INDIANRED);
                    fireCircleLift.setFill(Color.INDIANRED);
                    fireAlarmTB.setStyle("-fx-background-color: INDIANRED");
                } else {
                    fireCircleS.setFill(Color.LIGHTGRAY);
                    fireCircleLift.setFill(Color.GRAY);
                    fireAlarmTB.setStyle("");
                }
            }

            if (actionEvent.getSource() == motorShutdownTB) {
            }
            if (actionEvent.getSource() == powerOutageTB) {
            }


        }
    };
}