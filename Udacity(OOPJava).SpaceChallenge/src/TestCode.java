import java.util.Random;
import java.util.Spliterator;

public class TestCode {
    public static void main(String[] args) {
        U1 testRocketU1 = new U1();
        U2 testRocketU2 = new U2();

        testRocketU1.cargoCarried = 8000;
        testRocketU2.cargoCarried = 11000;

        System.out.println("U1=============:");
        for (int i = 0; i<100; i++) {
            if (!testRocketU1.launch()) {
                System.out.println("U1 Exploded");
                System.out.println(i);
            }
        }

        for (int i = 0; i<100; i++) {
            if (!testRocketU1.land()) {
                System.out.println("U1 Crashed");
                System.out.println(i);
            }
        }

        System.out.println("U2=============:");

        for (int i = 0; i<100; i++) {
            if (!testRocketU2.launch()) {
                System.out.println("U2 Exploded");
                System.out.println(i);
            }
        }

        for (int i = 0; i<100; i++) {
            if (!testRocketU2.land()) {
                System.out.println("U2 Crashed");
                System.out.println(i);
            }
        }
    }
}
