package fizzbuzz;

/**
 * Created by lii5a on 05/01/16.
 */
public class Random {

    static int arv = (int)(Math.random()*10);
    static int liidetav = (int)(Math.random()*10);

    public String arvStringiks() {
        return String.valueOf(arv); //selle koha üle olen päris uhke. guugeldasin silm krõllis, Stackoverflow ei aidanud. IDE aitas.
    }
}
