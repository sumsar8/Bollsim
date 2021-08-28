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
        int x = 10;
        while(isballmoving == true){

            time += 0.1;
            System.out.println(time);

            x--;
            if(x == 0) {
                isballmoving = false;
            }
            }
        }
    }

