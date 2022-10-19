import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("You are on an island surrounded by water.\nThere is a path to the woods to the north, the sea to the south, and a beach shack to the east. \nWhich way do you want to go (n,e,s,w)?");
        String command = scan.nextLine();

        if (command.equals("n"))
        {
            System.out.println("You enter the forest and hear some rustling.\nThere may be tigers here or maybe it's just monkeys.");
            /* add nested if statements for possible next actions! */

        }
        if (command.equals("e"))
        {
            System.out.println("You have entered the mountain and you see snow everywhere");
        }
        if (command.equals("e"))
        {
            System.out.println("You have entered the mountain and you see snow everywhere");
        }
        if (command.equals("e"))
        {
            System.out.println("You have entered the desert. The temperature is 100 degrees.");
        }
        else
        {
            System.out.println("You cannot enter this way");
        }

        // Add else-ifs for s, e, and an else for any other input. Be creative!




        System.out.println("End of adventure!");
    }
}
