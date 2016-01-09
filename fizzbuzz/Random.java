package fizzbuzz;

/**
 * Created by lii5a on 05/01/16.
 */
public class Random {

    public static int arv = teeArv();
    public static int liidetav = teeLiidetav();


    public static int teeArv() {
        arv = (int)(Math.random()*20);
        //arv = 15; //see on siin testimiseks - mugavam on fikseeritud arvu kasutada
        return arv;
    }

    public static String arvStringiks() {
        return String.valueOf(arv); //selle koha üle olen päris uhke. guugeldasin silm krõllis, Stackoverflow ei aidanud. IDE aitas.
    }

    public static int teeLiidetav() {
        liidetav = (int)(Math.random()*20);
        return liidetav;
    }

    public static String liidetavStringiks() {
        return String.valueOf(liidetav);
    }


}
