import java.text.DecimalFormat;
import java.util.Scanner;

public class bollsimulation {
    private static double bally = 10;
    private static double ballweight = 1;
    private static double gravitation = 9.82;
    private static double time = 0;
    private static double acceleration = 0;
    private static double velocity = 0;
    private static boolean isballmoving = true;

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
        int x = 100;
        while(isballmoving == true){
            DecimalFormat threedec = new DecimalFormat("#0.000");
            DecimalFormat twodec = new DecimalFormat("#0.00");

            time += 0.01;
            System.out.println(twodec.format(time));

            velocity = time * gravitation;
            System.out.print("velocity is ");
            System.out.print(threedec.format(velocity));
            System.out.println(" m/s");

            bally = bally - 0.5 * (gravitation * time) * (gravitation * time);
            System.out.print("height is ");
            System.out.print(threedec.format(bally));
            System.out.println(" m above ground");
            x--;
            if(x == 0) {
                isballmoving = false;
            }
            }
        }
    }

