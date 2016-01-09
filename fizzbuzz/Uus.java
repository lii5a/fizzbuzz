package fizzbuzz;

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
            Laud.exit();
        }
    }
}
