package fizzbuzz;

import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 * Created by lii5a on 05/01/16.
 * selle klassi viksisin enamjaolt Kristeri pealt maha (viimase praksi GUI-seadistus)
 * https://github.com/KristerV/javaHarjutused/blob/lahendused/src/teema3/SQL_Login/LoginScreen.java
 */
public class Laud {
    Stage mangulaud = new Stage();
    static TextField tekstikoht = new TextField();
    static boolean molemad = false;


    Arvutused arvutused = new Arvutused();
    Tagasiside tagasiside = new Tagasiside();

    Laud() {
        setupScene();
    }

 public static void exit() {
     Platform.exit();
     System.exit(0);
    }

    public void setupScene() {
        mangulaud.setOnCloseRequest((WindowEvent event) -> {System.exit(0); });
        mangulaud.setTitle("Sisin-susin");


        GridPane kastid = new GridPane(); //teen uue layouti - kastid, sest seal on hea koordinaate määrata, kujundada
        kastid.setAlignment(Pos.CENTER); //kastivärk on akna keskel
        kastid.setVgap(10); //kastide vahel on nats ruumi
        Scene fbStseen = new Scene(kastid, 350,600);
        mangulaud.setScene(fbStseen);
        mangulaud.show();
        //mangulaud.setResizable(false); //kui see käiku lasta, ei saa akent suure(ma)ks teha.


        // edasi tulevad tekstid ja numbrid ja nupud
        Label genereerinumber = new Label((Random.arvStringiks()));
        genereerinumber.setFont(new Font("Helvetica", 200));
        genereerinumber.setTextFill(Color.web("#FF0000"));
        genereerinumber.setTranslateX(15); //niimitu pikslit paremale

        Label kasJagub = new Label("JAGUB KOLME VÕI VIIEGA?");
        kasJagub.setFont(new Font("Helvetica", 20));
        kasJagub.setTranslateY(-50);

        Button jagubMolemaga = new Button ("Mõlemaga");
        jagubMolemaga.setOnMouseClicked(event -> {
                    arvutused.jagubMolemaga();
                    molemad = true;


                }
        );

        Button viiega = new Button ("Viiega");
        viiega.setTranslateX(110);
        viiega.setOnMouseClicked(event -> {
                    arvutused.jagubViiega();
                }
        );


        Button kolmega = new Button ("Kolmega");
        kolmega.setTranslateX(195);

        kolmega.setOnMouseClicked  (event -> {
                    arvutused.jagubKolmega();

                }
        );

        Label mittekummagagi = new Label ("MITTE KUMMAGAGI? SIIS LIIDA TALLE " + Random.liidetavStringiks() +":");
        mittekummagagi.setFont(Font.font("Helvetica", FontWeight.BOLD,14));

        tekstikoht.setPromptText("VASTUS");
        tekstikoht.setMaxWidth(70);
        tekstikoht.setTranslateX(95);

        Button OK = new Button("OK");
        OK.setTranslateX(110);

        OK.setOnMouseClicked(event ->  {arvutused.okei();});

        kastid.add(genereerinumber, 2, 1); //veerg, rida
        kastid.add(kasJagub, 2, 2);
        kastid.add(jagubMolemaga, 2,2);
        kastid.add(viiega, 2,2);
        kastid.add(kolmega, 2,2);
        kastid.add(mittekummagagi, 2,3);
        kastid.add(tekstikoht, 2,4);
        kastid.add(OK, 2,5);
        OK.setDefaultButton(true); //pärast pikka pusimist sain siit 133 realt idee, kuidas ok-nuppu ühildada enteriga/spacega. macijama. https://gist.github.com/jewelsea/3081826

    }

}
