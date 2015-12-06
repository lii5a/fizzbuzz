package fizzbuzz;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.Scanner;

/**
 * Created by lii5a on 24/11/15.
 */
public class Sisinsusin extends Application {
    Stage mangulaud;
    StackPane levelid;
    GridPane kastid;
    static int arv = (int)(Math.random()*10);;


    @Override
    public void start(Stage primaryStage) throws Exception {
        mangulaud = primaryStage;
        primaryStage.setTitle("Sisin-Susin");
        seadistamangulaud();
        //kysisisendit();
    }

    private void seadistamangulaud() {
        //mangulaud.setResizable(false); //kui see käiku lasta, ei saa akent suure(ma)ks teha.
        levelid = new StackPane(); //määran levelite layoutiks stackpane
        kastid = new GridPane(); //teen uue layouti kastid
        levelid.getChildren().add(kastid); //panen kastid levelite sisse
        //kastid.setGridLinesVisible(true);
        kastid.setAlignment(Pos.CENTER); //kastivärk on akna keskel
        kastid.setVgap(10);

        Scene fbStseen = new Scene(levelid, 350,600); //loon uue stseeni fbStseen, mille layout on levelid (stackpane)
        mangulaud.setScene(fbStseen);
        mangulaud.show();
        mangulaud.setOnCloseRequest(event -> {System.exit(0); });


        Label genereerinumber = new Label((arvStringiks()));
        genereerinumber.setFont(new Font("Helvetica", 300));
        genereerinumber.setTextFill(Color.web("#FF0000"));
        genereerinumber.setTranslateX(50); //viiskend pikslit paremale
        //genereerinumber.setTranslateY(-50); //sada pikslit üles

        Label kasJagub = new Label("JAGUB KOLME VÕI VIIEGA?");
        kasJagub.setFont(new Font("Helvetica", 20));
        kasJagub.setTranslateY(-50);
        //kasJagub.setTranslateX(-0);

        Button jagubMolemaga = new Button ("Mõlemaga");
        //jagubMolemaga.setTranslateY(-30);
        //jagubMolemaga.setTranslateX(-100);

        Button viiega = new Button ("Viiega");
        viiega.setTranslateX(110);


        Button kolmega = new Button ("Kolmega");
        kolmega.setTranslateX(195);

        Label mittekummagagi = new Label ("MITTE KUMMAGAGI? AGA LIIDA TALLE 8.");

        TextField tekstikoht = new TextField();
        tekstikoht.setPromptText("Kirjuta vastus siia ja vajuta enter/OK");

        Button OK = new Button("OK");
        OK.setTranslateX(110);


        kastid.add(genereerinumber, 2, 1); //veerg, rida
        kastid.add(kasJagub, 2, 2);
        kastid.add(jagubMolemaga, 2,2);
        kastid.add(viiega, 2,2);
        kastid.add(kolmega, 2,2);
        kastid.add(mittekummagagi, 2,3);
        //kastid.add(vastuslabel, 2,4);
        kastid.add(tekstikoht, 2,4);
        kastid.add(OK, 2,5);

    }

    private static void kysisisendit() {

        int liidetav = (int)(Math.random()*10);
        int tulemus = (arv +liidetav);
        System.out.println(); //see ja järgmised kuus rida on lihtsalt arendamise eesmärgil. pärast kustutan ära.
        System.out.println();
        System.out.println("arv on " + arv);
        System.out.println("liidetav on " + liidetav);
        System.out.println("tulemus on " + tulemus);
        System.out.println();

        System.out.println("Kui see arv jagub viiega, ütle 0. Kui kolmega, ütle 1. Kui mõlemaga, ütle 2. Kui ei jagu kummagagi, liida talle " + liidetav);

        try {
            Scanner kysimus = new Scanner(System.in);
            int vastus = kysimus.nextInt();

            if ((arv%15==0) && (vastus==2)){
                System.out.println("Õige! See arv jagus nii kolme kui ka viiega");
            }
            else if ((arv%5==0)&&(vastus==0)){
                System.out.println("Õige! See arv jagus viiega.");
                kysisisendit();
            }

            else if ((arv%3==0) && (vastus==1)){
                System.out.println("Õige! See arv jagus kolmega.");
                kysisisendit();
            }

            else if (((arv%5!=0) && (arv%3!=0)) && (vastus == tulemus)) {
                System.out.println("Tubli! Oskad hästi liita!");
                kysisisendit();
            }

            else {
                System.out.println("vale vastus");
            }
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Kuule ära sisesta mingit jama. Sisesta ikka seda, mida küsitud.");
            kysisisendit();
        }

        /*else if ((arv%5==0)&&(vastus!=0)){
            System.out.println("Läks nihu! See arv jagus ju viiega!");
            genereerinumbreid(arv);
            kysisisendit();
        }


        else if ((arv%3==0) && (vastus!=1)){
            System.out.println("Läks nihu! Jagus ju kolmega!");
            genereerinumbreid(arv);
            kysisisendit();
        }


        else if ((arv%5!=0) || (arv%3!=0) && (vastus != arv+liidetav)) {
            System.out.println("Peaksid liitmist veel nats harjutama");
        }*/

    }


    public String arvStringiks() {
        return String.valueOf(arv); //selle koha üle olen päris uhke. guugeldasin silm krõllis, Stackoverflow ei aidanud. IDE aitas.
    }
}


//todo: võiks skoori pidada
// nupud ütlevad "sisista" ja "susista" ja "sissussista"
//võiks ajapiirangu panna
// võiks anda leveleid valida. et kas 10, 100 või 1000 piires.
//püüa error kinni, et ikka numbreid sisestaks
