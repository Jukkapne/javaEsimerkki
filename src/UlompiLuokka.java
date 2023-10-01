public class UlompiLuokka {
    
    String viesti = "Hei, ulommasta luokasta!";

    public void print() {
        System.out.println(viesti);
    }

    public class SisempiLuokka {
        String x = "Hei, sisemmästä luokasta!";
        public void tulostaMoi() {
            System.out.println(x);
        }
    }

}
