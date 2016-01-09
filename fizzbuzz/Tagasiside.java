package fizzbuzz;

import javafx.scene.control.Alert;
import javafx.stage.Stage;

/**
 * Created by lii5a on 04/01/16.
 */
public class Tagasiside {

    static boolean kaivitus = false;
    static int skoor = 0;
    int punkt;

    public void tubli (){
        Alert tubli = new Alert(Alert.AlertType.INFORMATION);
        tubli.setTitle("Pasunad ja lilled!");
        tubli.setHeaderText("Õige vastus! Said ühe punkti juurde!");
        tubli.showAndWait();
        kaivitus = true;
        punkt=1;

        auhinnad();
        new Uus();

        //Laud.exit(); //kogu kupatus läeb kinni ja enam ei avane.
    }

    public void pahasti() {
        Alert paha = new Alert(Alert.AlertType.INFORMATION);
        paha.setTitle("Pahasti!");
        paha.setHeaderText("See läks nüüd vähe mööda. Kaotasid ühe punkti :(");
        paha.showAndWait();
        kaivitus = true;
        punkt=2;
        new Uus();
    }

    public void auhinnad () {


        if (punkt == 1) {
            skoor = skoor + 1;
            System.out.println(skoor);
        }

        else if (punkt == 2){
            skoor = skoor - 1;
            System.out.println(skoor);
        }



    }


}
