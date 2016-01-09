package fizzbuzz;

import javafx.scene.control.Alert;

/**
 * Created by lii5a on 09/01/16.
 */
public class Uus {

    public Uus() {

        if (Tagasiside.skoor < 5) {
            Laud.tekstikoht.setText("");
            Random.teeArv();
            Random.teeLiidetav();
        } else {
            Alert gameover = new Alert(Alert.AlertType.INFORMATION);
            gameover.setTitle("Mäng läbi!");
            gameover.setHeaderText("Tubli mäng, jõudsid lõpuni!");
            gameover.showAndWait();

            Laud.exit();
        }
    }
}
