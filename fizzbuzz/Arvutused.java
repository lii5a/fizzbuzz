package fizzbuzz;

/**
 * Created by lii5a on 04/01/16.
 */
public class Arvutused {



    Tagasiside tagasiside = new Tagasiside();

    public void jagubMolemaga() {

        if ((Random.arv % 15 == 0)) {
            tagasiside.tubli();
        } else {
            tagasiside.pahasti();

        }
    }

    public void jagubViiega() {

        if ((Random.arv % 5 == 0)) {
            tagasiside.tubli();

        } else {
            tagasiside.pahasti();

        }


    }

    public void jagubKolmega() {
        if ((Random.arv % 3 == 0)) {
            tagasiside.tubli();

        } else {
            tagasiside.pahasti();
        }


    }

    public void okei() {
        double d = Double.parseDouble(Laud.tekstikoht.getText()); //selle häki googeldasin siit: http://stackoverflow.com/questions/4753339/convert-textfield-value-to-int
        int i = (int) d;


        if (i == Random.arv + Random.liidetav) {
            tagasiside.tubli();
        } else {
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