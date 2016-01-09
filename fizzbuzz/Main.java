package fizzbuzz;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Created by lii5a on 24/11/15.
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
     new Laud();
    }

}


/*todo:
püüa error kinni, et ikka numbreid kasti sisestaks
ok-nupp võiks ka enteri (OSXis tühiku) peale reageerida (testi teises ossis)

nicetohave:
nupud ütlevad "sisista" ja "susista" ja "sissussista" + hääl
võiks ajapiirangu panna
võiks anda leveleid valida. et kas 10, 100 või 1000 piires. viia üle järgmisele levelile.
*/
