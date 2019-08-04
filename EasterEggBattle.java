import java.util.Scanner;

public class EasterEggBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countEggs1 = Integer.parseInt(scanner.nextLine());
        int countEggs2 = Integer.parseInt(scanner.nextLine());


        int points1 = 0;
        int points2 = 0;
        String winner = scanner.nextLine();

        while (!winner.equals("End of battle"))
        {
            if (winner.equals("one"))
            {
                countEggs2--;
            }
            else if (winner.equals("two"))
            {
                countEggs1--;
            }

            if (countEggs1 == 0)
            {
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.",countEggs2);
                break;
            }
            else if (countEggs2 == 0)
            {
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.",countEggs1);
                break;
            }

            winner = scanner.nextLine();
        }

        if (winner == "End of battle")
        {
            System.out.printf("Player one has %d eggs left.",countEggs1);
            System.out.printf("Player two has %d eggs left.", countEggs2);
        }
    }
}