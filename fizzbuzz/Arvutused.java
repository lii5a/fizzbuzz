package fizzbuzz;

/**
 * Created by lii5a on 04/01/16.
 */
public class Arvutused {
    static int arv = (int)(Math.random()*10);
    static int liidetav = (int)(Math.random()*10);

    Tagasiside tagasiside = new Tagasiside();
    //Main main = new Main();

    public void jagubMolemaga() {
        if (arv%15==0) {
            tagasiside.tubli();
        }
        else {
            tagasiside.pahasti();
        }
    }

    public void jagubViiega() {

        if (arv%5==0) {
            tagasiside.tubli();
        }
        else {
            tagasiside.pahasti();
        }


    }

    public void jagubKolmega() {
        if (arv%3==0) {
            tagasiside.tubli();
        }
        else {
            tagasiside.pahasti();
        }

    }

   /* public void arvutusevastus() {

        if (main.sisestus==arv+liidetav) {
            tagasiside.tubli();
        }
        else {
            tagasiside.pahasti();
        }
    }*/

    public String arvStringiks() {
        return String.valueOf(arv); //selle koha üle olen päris uhke. guugeldasin silm krõllis, Stackoverflow ei aidanud. IDE aitas.
    }
}


