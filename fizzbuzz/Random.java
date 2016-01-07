package fizzbuzz;

/**
 * Created by lii5a on 05/01/16.
 */
public class Random {

    public static int arv = teeArv();
    public static int liidetav = teeLiidetav();


    public static int teeArv() {
        arv = (int)(Math.random()*20);
        System.out.println("otse teearv meetodi seest! arv teearv meetodi sees on" + arv);
        return arv;
    }

    public static String arvStringiks() {
        System.out.println("arvstringiks saab aru, et arv on" + String.valueOf(arv));
        return String.valueOf(arv); //selle koha üle olen päris uhke. guugeldasin silm krõllis, Stackoverflow ei aidanud. IDE aitas.
    }

    public static int teeLiidetav() {
        liidetav = (int)(Math.random()*20);
        System.out.println("otse liidetav meetodi seest! liidetav on" + liidetav);
        return liidetav;
    }

    public static String liidetavStringiks() {
        System.out.println("liidetavstringiks saab aru, et liidetav on" + String.valueOf(liidetav));
        return String.valueOf(liidetav);
    }


}
