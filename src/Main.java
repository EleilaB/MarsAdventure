import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("'Alright', cadet. It's a long way to Mars, so make sure you're comfortable. What color space suit do you want?'");

        String suitColor = input.nextLine();
        System.out.println("'Got it. One " + suitColor.toLowerCase() + " suit coming up.'");

        System.out.println("The next week, your suit and shuttle are ready. It's time to board.");
        System.out.println("The cockpit is smaller than the simulator, but you quickly gather your bearings. Only a few complications arise during takeoff, and you handle them easily.");
        System.out.println("Once the autopilot is on, you head to sleep. The new sublight engine will have to planetside in days.");
        System.out.println("The voyage is uneventful, but your excitement rises as the shuttle begins to land. You manage the landing gear, seal your suit, and step onto the sandy rock that makes up Mars's surface.");
        System.out.println("You see a crater and a cave. Which do you go toward?");

        String location = input.nextLine();
        System.out.println("You move toward the " + location + ", and find a small, round stone.");
        System.out.println("As you lift it, you get the sensation that it is hollow, but filled. An egg?");
        System.out.println("It begins to rattle in your hand. The movement of picking it up seems to have woken it - it's going to hatch!");
        System.out.println("A small, proboscus like mouth pokes out of the cracking stone. It stabs through your glove and into your hand, and your vision fades to black.");
        System.out.println("You have died.");
    }
}