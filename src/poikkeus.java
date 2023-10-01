import java.util.Scanner;

public class poikkeus {
    //introduction to exception handling in java
    public static void main(String[] args) {
        int[] taulukko = new int[5];
        try {
            taulukko[5] = 5;
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
        System.out.println("Ohjelma jatkuu");
    }
}

//finally
class Finally {

    public static void main(String[] args) {
        try {
            System.out.println("Ohjelma alkaa");
            throw new Exception("Virhe");
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        } finally {
            System.out.println("Ohjelma loppuu");
        }
    }
}

//luodaan oma exception
class OmaException extends Exception {

    public OmaException(String viesti) {
        super(viesti+ " ja lisää tietoa");
    }
}

//käytetään omaa exceptionia
class OmaExceptionKaytto {

    public static void main(String[] args) {
        try {
            throw new OmaException("Oma virheviesti");
        } catch (OmaException e) {
            System.out.println("Virhe: " + e.getMessage());
        }
    }
}




//try with resources
class TryWithResources {

    public static void main(String[] args) {
        try (Scanner lukija = new Scanner(System.in)) {
            System.out.println("Anna luku");
            int luku = lukija.nextInt();
            System.out.println("Annoit luvun " + luku);
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
    }
}

//try catch ketjutus
class TryCatchKetjutus {

    public static void main(String[] args) {
        try {
            System.out.println("Ohjelma alkaa");
            throw new Exception("Virhe");
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
            try {
                throw new Exception("Virhe2");
            } catch (Exception e2) {
                System.out.println("Virhe2: " + e2.getMessage());
            }
        } finally {
            System.out.println("Ohjelma loppuu");
        }
    }
}