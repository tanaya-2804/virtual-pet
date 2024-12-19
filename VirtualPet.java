import java.util.Scanner;

public class VirtualPet {
    static int hunger = 50;
    static int happiness = 50;
    static int energy = 50;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Pet Status: Hunger=" + hunger + ", Happiness=" + happiness + ", Energy=" + energy);
            System.out.println("Actions: feed, play, sleep, exit");
            String action = scanner.nextLine();

            switch (action) {
                case "feed": hunger = Math.max(0, hunger - 10); energy -= 5; break;
                case "play": happiness = Math.min(100, happiness + 10); energy -= 10; break;
                case "sleep": energy = Math.min(100, energy + 20); hunger += 10; break;
                case "exit": System.out.println("Goodbye!"); return;
                default: System.out.println("Invalid action.");
            }

            if (hunger >= 100 || energy <= 0) {
                System.out.println("Your pet didn't make it...");
                break;
            }
        }
        scanner.close();
    }
}
