package fizzbuzz;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 * Created by lii5a on 24/11/15.
 */
public class Sisinsusin extends Application {
    Stage mangulaud;
    static int arv = (int)(Math.random()*10);
    static int liidetav = (int)(Math.random()*10);


    @Override
    public void start(Stage primaryStage) throws Exception {
        mangulaud = primaryStage;
        mangulaud.setOnCloseRequest((WindowEvent event) -> {System.exit(0); });

        primaryStage.setTitle("Sisin-Susin");
        seadistamangulaud();
    }

    private void tagasisideTubli() { //siin meetodis kasutatud dialoogiakent õppisin tegema siin: http://code.makery.ch/blog/javafx-dialogs-official/

       Alert tubli = new Alert(Alert.AlertType.INFORMATION);
        tubli.setTitle("Pasunad ja lilled!");
        tubli.setHeaderText("Õige vastus! Said ühe punkti juurde!");
        tubli.showAndWait();
    }

  /*  private int skoor() { //proovin siin skoori käima saada.
        int skoor = 0;
        if (tagasisideTubli()) {
            skoor = skoor + 1;
        }
        return skoor;
    }*/

    private void seadistamangulaud() {
        //mangulaud.setResizable(false); //kui see käiku lasta, ei saa akent suure(ma)ks teha.
        GridPane kastid = new GridPane(); //teen uue layouti - kastid, sest seal on hea koordinaate määrata, kujundada
        kastid.setAlignment(Pos.CENTER); //kastivärk on akna keskel
        kastid.setVgap(10); //kastide vahel on nats ruumi

        Scene fbStseen = new Scene(kastid, 350,600); //loon uue stseeni fbStseen, mille layout on kastid (gridPane)
        mangulaud.setScene(fbStseen);
        mangulaud.show();

        // edasi tulevad tekstid ja numbrid ja nupud

        Label genereerinumber = new Label((arvStringiks()));
        genereerinumber.setFont(new Font("Helvetica", 300));
        genereerinumber.setTextFill(Color.web("#FF0000"));
        genereerinumber.setTranslateX(50); //viiskend pikslit paremale

        Label kasJagub = new Label("JAGUB KOLME VÕI VIIEGA?");
        kasJagub.setFont(new Font("Helvetica", 20));
        kasJagub.setTranslateY(-50);

        Button jagubMolemaga = new Button ("Mõlemaga");
        jagubMolemaga.setOnMouseClicked(event -> {
                        if (arv%15==0) {
            tagasisideTubli(); //todo tulevikus: uus number lihtsalt ja kuhugi skoor tiksuma, pole vahevärki vaja näidata.
                        }
                    else {
                            tagasisideVale();
                        }

        }
        ); //siin lõppeb nupu "Mõlemaga" sündmus ära.

        Button viiega = new Button ("Viiega");
        viiega.setTranslateX(110);
        viiega.setOnMouseClicked(event -> {
                    if (arv%5==0) {
                        tagasisideTubli();
                    }
                    else {
                        tagasisideVale();
                    }

                }
        );


        Button kolmega = new Button ("Kolmega");
        kolmega.setTranslateX(195);

        kolmega.setOnMouseClicked  (event -> {
                    if (arv%3==0) {
                        tagasisideTubli();
                    }
                    else {
                        tagasisideVale();
                    }

                }
        );

        Label mittekummagagi = new Label ("MITTE KUMMAGAGI? SIIS LIIDA TALLE " +liidetav+":");
        mittekummagagi.setFont(Font.font("Helvetica",FontWeight.BOLD,14));

        TextField tekstikoht = new TextField();
        tekstikoht.setPromptText("VASTUS");
        tekstikoht.setMaxWidth(70);
        tekstikoht.setTranslateX(95);

        Button OK = new Button("OK");
        OK.setTranslateX(110);


       OK.setOnMouseClicked(event -> { //todo: kuidas teha nii, et käraks nii enter kui ka klikk-okei? kui see lisada, siis kood ei tööta. OK.setOnMouseClicked (event -> equals(KeyCode.ENTER));

                   double d = Double.parseDouble(tekstikoht.getText()); //selle häki googeldasin siit: http://stackoverflow.com/questions/4753339/convert-textfield-value-to-int
                   int i = (int)d;


                       if (i==arv+liidetav) {
                           tagasisideTubli();
                       }
                       else {
                           tagasisideVale();
                       }

               }
        );

        kastid.add(genereerinumber, 2, 1); //veerg, rida
        kastid.add(kasJagub, 2, 2);
        kastid.add(jagubMolemaga, 2,2);
        kastid.add(viiega, 2,2);
        kastid.add(kolmega, 2,2);
        kastid.add(mittekummagagi, 2,3);
        kastid.add(tekstikoht, 2,4);
        kastid.add(OK, 2,5);

    }

    private void tagasisideVale() {
        Alert paha = new Alert(Alert.AlertType.INFORMATION);
        paha.setTitle("Pahasti!");
        paha.setHeaderText("See läks nüüd vähe mööda. Kaotasid ühe punkti :(");
        paha.showAndWait();
    }

    public String arvStringiks() {
        return String.valueOf(arv); //selle koha üle olen päris uhke. guugeldasin silm krõllis, Stackoverflow ei aidanud. IDE aitas.
    }
}


/*todo:
mäng tsüklisse
mäng objektorienteerituks
skoori pidada ja näidata
püüa error kinni, et ikka numbreid sisestaks

nicetohave:
nupud ütlevad "sisista" ja "susista" ja "sissussista" + hääl
võiks ajapiirangu panna
võiks anda leveleid valida. et kas 10, 100 või 1000 piires. viia üle järgmisele levelile.
*/

//HEUREKAD
//leidsin siit soovituse stackide kui kaartide näitamise/peitmisega mitte jamada, vaid ilmutada/kustutada kraami üldse stseenis
// http://www.javacodegeeks.com/2014/08/javafx-tip-14-stackpane-children-hidden-but-not-gone.html