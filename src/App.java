



public class App {
    public static void main(String[] args) {
        UlompiLuokka ulompi = new UlompiLuokka();
        UlompiLuokka.SisempiLuokka sisempi = ulompi.new SisempiLuokka();
        UlompiLuokka.StaticSisempiLuokka staticSisempi = new UlompiLuokka.StaticSisempiLuokka();

    
        ulompi.tulostaUlkoisen("moikka");
        sisempi.tulostaSisaisen("Terve");
        staticSisempi.tulostaStaattisen("hei");
        staticSisempi.tulostaYlaluokanStaattinen("hei2");
        
    }
}