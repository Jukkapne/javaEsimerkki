public class UlompiLuokka {
    static String viesti = "Terve";

    static void tulostaYlaluokanStaattinen(String viesti) {
        System.out.println("Viesti ulompi luokka staattisesta metodista: " + viesti);
    }
    void tulostaUlkoisen(String viesti) {
        System.out.println("Viesti ulompi luokka: " + viesti);
    }

    //sisäluokasta joka ei ole staattinen, voidaan luoda instanssi vain ulomman luokan instanssin kautta
    //sisäluokalla on näin pääsy ulomman luokan muuttujiin ja metodeihin (sekä staattisiin että ei staattisiin)
    public class SisempiLuokka {

        void tulostaSisaisen(String viesti) {
            System.out.println("Viesti sisempi luokka: " + viesti);
        }
    }
//staattisesta sisäluokasta ei voi viitata ulomman luokan muuttujiin tai metodeihin, koska ei ole instanssia. Voit kuitenkin viitata ulomman luokan staattisiin muuttujiin ja metodeihin.
//staattisesta luokasta voit luoda instanssin ilman että luot ulomman luokan instanssia
    public static class StaticSisempiLuokka {

        //kutsu yläluokan staattista metodia
        void tulostaYlaluokanStaattinen(String viesti) {
            UlompiLuokka.tulostaYlaluokanStaattinen(viesti);
        }


        void tulostaStaattisen(String viesti) {
            System.out.println("Viesti staattinen luokka: " + viesti);

        }
    }

}
