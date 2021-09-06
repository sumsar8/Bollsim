import java.text.DecimalFormat;
import java.util.Scanner;

public class bollsimulation {
    private static double bally = 10;
    private static double ballweight = 1;
    private static double gravitation = 9.82;
    private static double time = 0;
    private static double acceleration = 0;
    private static double velocity = 0;
    private static double maxheight = bally;
    private static double bouncecoefficient = 0.3;
    private static double velocitytime = 0;
    private static double minimumvelocity = 0.1;
    private static boolean isballmoving = true;
    private static boolean down = true;

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



            velocity = gravitation * velocitytime * velocitytime;
            System.out.print("velocity is ");
            System.out.print(threedec.format(velocity));
            System.out.println(" m/s");

            if(down == true){
                velocitytime += 0.01;
                bally = bally - velocity;
            }
            if(down == false){
                if (velocity < minimumvelocity) {
                    down = true;
                    velocity = 0.1;
                    System.out.println("Switching fall vt = " +velocitytime);
                }
                velocitytime -= 0.01;
                bally = bally + velocity;
            }
            if(bally <= 0){
                down = false;
            }
            System.out.print("height is ");
            System.out.print(threedec.format(bally));
            System.out.println(" m above ground");

            x--;
            if(x == 0) {
                isballmoving = false;
                velocity *= bouncecoefficient;
            }
            }
        }
    }

