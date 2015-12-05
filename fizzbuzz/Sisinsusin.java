package fizzbuzz;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
    VBox kastid;
    static int arv = (int)(Math.random()*10);;


    @Override
    public void start(Stage primaryStage) throws Exception {
        mangulaud = primaryStage;
        seadistamangulaud();
        //kysisisendit();
    }

    private void seadistamangulaud() {
        levelid = new StackPane();
        kastid = new VBox();
        levelid.getChildren().add(kastid);

        Scene fbStseen = new Scene(levelid, 300,400);
        mangulaud.setScene(fbStseen);
        mangulaud.show();
        mangulaud.setOnCloseRequest(event -> {System.exit(0); });


        Label genereerinumber = new Label((arvStringiks()));
        genereerinumber.setFont(new Font("Helvetica", 300));
        genereerinumber.setTextFill(Color.web("#FF0000"));
        //genereerinumber.setTranslateX(50); //viiskend pikslit paremale
        genereerinumber.setTranslateY(-50); //sada pikslit üles

        Label kasJagub = new Label("JAGUB KOLME VÕI VIIEGA?");
        kasJagub.setFont(new Font("Helvetica", 10));
        kasJagub.setTranslateY(90);
        //kasJagub.setTranslateX(10);

        Button jagubMolemaga = new Button ("Mõlemaga");
        jagubMolemaga.setTranslateY(130);
        jagubMolemaga.setTranslateX(-100);

        Button viiega = new Button ("Viiega");
        jagubMolemaga.setTranslateY(20);
        jagubMolemaga.setTranslateX(200);

        Button kolmega = new Button ("Kolmega");
        jagubMolemaga.setTranslateY(130);
        jagubMolemaga.setTranslateX(100);

        levelid.getChildren().addAll(genereerinumber, kasJagub, jagubMolemaga,kolmega, viiega);

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
