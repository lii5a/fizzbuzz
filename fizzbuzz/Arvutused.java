package fizzbuzz;

/**
 * Created by lii5a on 04/01/16.
 * Klass, kus kontrollitakse kasutaja vastuseid.
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


        if ((Random.arv % 3!=0)&&(Random.arv%5!=0)&&(i == Random.arv + Random.liidetav)) {
            tagasiside.tubli();
        } else {
            tagasiside.pahasti();
        }

    }

}



