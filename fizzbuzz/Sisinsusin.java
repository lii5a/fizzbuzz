package fizzbuzz;

import java.util.Scanner;

/**
 * Created by lii5a on 24/11/15.
 */
public class Sisinsusin {

	public static void main(String[] args) {
		kysisisendit();
	}

	private static void kysisisendit() {
		int arv = (int)(Math.random()*10);
		int liidetav = (int)(Math.random()*10);
		int tulemus = (arv +liidetav);
		System.out.println("arv on " + arv);
		System.out.println("liidetav on " + liidetav);
		System.out.println("tulemus on " + tulemus);
		System.out.println();

		System.out.println("Kui see arv jagub viiega, ütle 0. Kui kolmega, ütle 1. Kui mõlemaga, ütle 2. Kui ei jagu kummagagi, liida talle " + liidetav);
		Scanner kysimus = new Scanner(System.in);
		int vastus = kysimus.nextInt();

		if ((arv%15==0) && (vastus==2)){
			System.out.println("Õige! See arv jagus nii kolme kui ka viiega");
		}
		else if ((arv%5==0)&&(vastus==0)){
			System.out.println("Õige! See arv jagus viiega.");
			kysisisendit();
		}

		else if ((arv%3==0) && (vastus==1)){
			System.out.println("Õige! See arv jagus kolmega.");
			kysisisendit();
		}

		else if (((arv%5!=0) && (arv%3!=0)) && (vastus == tulemus)) {
			System.out.println("Tubli! Oskad hästi liita!");
			kysisisendit();
		}

		else {
			System.out.println("vale vastus");
		}

        /*else if ((arv%5==0)&&(vastus!=0)){
            System.out.println("Läks nihu! See arv jagus ju viiega!");
            genereerinumbreid(arv);
            kysisisendit();
        }


        else if ((arv%3==0) && (vastus!=1)){
            System.out.println("Läks nihu! Jagus ju kolmega!");
            genereerinumbreid(arv);
            kysisisendit();
        }


        else if ((arv%5!=0) || (arv%3!=0) && (vastus != arv+liidetav)) {
            System.out.println("Peaksid liitmist veel nats harjutama");
        }*/
	}


}


//todo: võiks skoori pidada
//võiks ajapiirangu panna
// võiks anda leveleid valida. et kas 10, 100 või 1000 piires.
//püüa error kinni, et ikka numbreid sisestaks
// nupud ütlevad "sisista" ja "susista" ja "sissussista"