package fizzbuzz;

import javafx.scene.control.Alert;
import javafx.stage.Stage;

/**
 * Created by lii5a on 04/01/16.
 */
public class Tagasiside {

    public void tubli (){
        Alert tubli = new Alert(Alert.AlertType.INFORMATION);
        tubli.setTitle("Pasunad ja lilled!");
        tubli.setHeaderText("Õige vastus! Said ühe punkti juurde!");
        tubli.showAndWait();
        //Laud laud = new Laud(); //teeb olemasoleva laua peale samade andmetega laua.
        //laud.exit();
    }

    public void pahasti() {
        Alert paha = new Alert(Alert.AlertType.INFORMATION);
        paha.setTitle("Pahasti!");
        paha.setHeaderText("See läks nüüd vähe mööda. Kaotasid ühe punkti :(");
        paha.showAndWait();
    }


}
