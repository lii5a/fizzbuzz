package fizzbuzz;

import javafx.stage.Stage;

/**
 * Created by lii5a on 04/01/16.
 */
public class Arvutused {


    Tagasiside tagasiside = new Tagasiside();
    Randomid randomid = new Randomid();

    public void jagubMolemaga() {
        if (randomid.arv%15==0) {
            tagasiside.tubli();
        }
        else {
            tagasiside.pahasti();

        }
    }

    public void jagubViiega() {

        if ((randomid.arv)%5==0) {
            tagasiside.tubli();

        }
        else {
            tagasiside.pahasti();

        }


    }

    public void jagubKolmega() {
        if ((randomid.arv)%3==0) {
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


}



      /*  private int skoor() { //proovin siin skoori käima saada.
        int skoor = 0;
        if (tagasisideTubli()) {
            skoor = skoor + 1;
        }
        return skoor;
    }*/