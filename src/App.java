import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;



public class App {
    public static void main(String[] args) {
        UlompiLuokka ulompi = new UlompiLuokka();
        UlompiLuokka.SisempiLuokka sisempi = ulompi.new SisempiLuokka();
        sisempi.tulostaMoi();
        ulompi.print();
        
    }
}