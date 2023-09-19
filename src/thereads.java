import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class thereads {
    private static Random random = new Random();
    private static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Thread thread1 = new Thread(()->{
            list.add(random.nextInt());
        });
        Thread thread2 = new Thread(()->{
            System.out.println(" reading list "+list);
        });
    }
}
