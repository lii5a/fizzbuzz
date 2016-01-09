package fizzbuzz;

import javafx.scene.control.Alert;
import javafx.stage.Stage;

/**
 * Created by lii5a on 04/01/16.
 */
public class Tagasiside {

    static boolean kaivitus = false;
    int skoor = 0;
    boolean punkt;

    public void tubli (){
        Alert tubli = new Alert(Alert.AlertType.INFORMATION);
        tubli.setTitle("Pasunad ja lilled!");
        tubli.setHeaderText("Õige vastus! Said ühe punkti juurde!");
        tubli.showAndWait();
        kaivitus = true;
        auhinnad();
        new Uus();

        //Laud.exit(); //kogu kupatus läeb kinni ja enam ei avane.
        //Laud laud = new Laud(); //teeb uue laua.
    }

    public void pahasti() {
        Alert paha = new Alert(Alert.AlertType.INFORMATION);
        paha.setTitle("Pahasti!");
        paha.setHeaderText("See läks nüüd vähe mööda. Kaotasid ühe punkti :(");
        paha.showAndWait();
        kaivitus = true;
        new Uus();

        //Laud laud = new Laud();
    }

    public void auhinnad () {

        if ((punkt == true) && (Laud.molemad == true)) {
            skoor = skoor + 3;
            System.out.println(skoor);

        }

        else if ((punkt == true) && (Laud.molemad == false)) {
            skoor = skoor + 1;
            System.out.println(skoor);
        }

        else if (punkt == false) {
            skoor = skoor-1;
            System.out.println(skoor);
        }



    }


}
