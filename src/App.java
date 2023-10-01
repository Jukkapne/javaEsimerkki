



public class App {
    public static void main(String[] args) {
        UlompiLuokka ulompi = new UlompiLuokka();
        UlompiLuokka.SisempiLuokka sisempi = ulompi.new SisempiLuokka();
        UlompiLuokka.StaticSisempiLuokka staticSisempi = new UlompiLuokka.StaticSisempiLuokka();

       sisempi.tulostaSisaisen("Terve");
       ulompi.tulostaUlkoisen("moikka");
       staticSisempi.tulostaStaattisen("hei");
        staticSisempi.tulostaYlaluokanStaattinen("hei2");
        
    }
}