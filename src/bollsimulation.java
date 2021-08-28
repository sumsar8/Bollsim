import java.util.Scanner;

public class bollsimulation {
    private static double bally = 10;
    private static double ballweight = 1;
    private static double gravitation = 9.82;
    private static double time;

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String starttext = scanner.nextLine();
        if(starttext .equals("start")||starttext .equals("Start")){

                runsimulation();
                System.out.println(bally);
        }
    }
    public static void runsimulation(){
        bally = bally - 1;
    }
}
