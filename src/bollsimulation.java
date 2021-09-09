import java.text.DecimalFormat;
import java.util.Scanner;

public class bollsimulation {
    private static double bally = 100;
    private static double deltaT = 0.01;
    private static double gravitation = 9.8;
    private static double time = 0;
    private static double velocity = 0;
    private static boolean isballmoving = true;
    private static char ballbounce = 0;

    public static void main(String[] args) {

        //Checkar om du skriver start i consolen och startar simulationen om du gör det.
        Scanner scanner = new Scanner(System.in);
        String starttext = scanner.nextLine();

        if (starttext.equals("start") || starttext.equals("Start")) {
            System.out.println(bally);
            runsimulation();
            System.out.println(bally);
        }
    }

    public static void runsimulation() {
        int x = 470;
        while (isballmoving == true) {
            DecimalFormat threedec = new DecimalFormat("#0.000");
            DecimalFormat twodec = new DecimalFormat("#0.00");

            time += deltaT;
            PrintValues(twodec, "Time is ", time, " s");

            if(ballbounce == 0) {
                velocity = gravitation * (time * time);
                bally = 100 - ((gravitation * time * time) / 2);
                if(bally <= 0) {
                    ballbounce = 1;
                }
            }
            if(ballbounce == 1){
                velocity = gravitation * (time * time);
                bally = 100 - ((gravitation * time * time) / 2);
                if(bally <= 0) {
                    ballbounce = 1;
                }
            }

            PrintValues(threedec, "velocity is ", velocity, " m/s");
            PrintValues(threedec, "height is ", bally, " m above ground");

            x--;
            if (x == 0) {
                isballmoving = false;
            }
        }
    }




    private static void PrintValues(DecimalFormat threedec, String s, double velocity, String s2) {
        System.out.print(s);
        System.out.print(threedec.format(velocity));
        System.out.println(s2);
    }
}

