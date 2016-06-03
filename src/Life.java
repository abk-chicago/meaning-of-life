import java.util.Scanner;
// Use reference for Scanner from
// https://examples.javacodegeeks.com/core-java/util/scanner/java-util-scanner-example/

public class Life {
    // starting point!

    public static void main(String[] args)
    {

        // Create an array
       /* String[] lifeArray = new String[]
         {"1. Platonism: learn more",
         "2. Aristotelianism: be good",
        "3. Cynicism: be self-sufficient",
        "4. Hedonism: have pleasure now",
        "5. Epicureanism: free yourself from pain",
        "6. Stoicism: be logical, don’t suffer");
        "7. Classical Liberalism: defend individual liberty",
        "8. Kantianism: do as you’d have others do (your duty)",
        "9. Nihilism: do anything (life has no meaning)",
        "10. Pragmatism: bring the most good to humans",
        "11. Theism: follow God’s will",
        "12. Existentialism: make decisions and be positive",
        "13. Absurdism: stop making sense of life, just live",
        "14. Humanism: act in self-interest and common good");
        "15. Logical Positivism: life has no meaning, until you give it one");
        "16. Natural Pantheism: care for nature");
        "17. Mohism: love people impartially");
        "18. Confucianism: live an ordinary life");
        "19. Legalism: learn practical things");}
        */

        // Output the Title and Choices the user can pick from.
        System.out.println("Welcome to The Meaning of Life (Not the Monty Python movie)");
        System.out.println("Choose one of the following Philosphies: ");
        System.out.println("[1] - Platonism");
        System.out.println("[2] - Aristotelianism");
        System.out.println("[3] - Cynicism");
        System.out.println("[4] - Hedonism");
        System.out.println("[5] - Epicureanism");
        System.out.println("[6] - Stoicism");
        System.out.println("[7] - Classical Liberalism");
        System.out.println("[8] - Kantianism");
        System.out.println("[9] - Nihilism");
        System.out.println("[10] - Pragmatism");
        System.out.println("[11] - Theism");
        System.out.println("[12] - Existentialism");
        System.out.println("[13] - Absurdism");
        System.out.println("[14] - Humanism");
        System.out.println("[15] - Logical Positivism");
        System.out.println("[16] - Natural Pantheism");
        System.out.println("[17] - Mohim");
        System.out.println("[18] - Confucianism");
        System.out.println("[19] - Legalism");

        // Wait for input from user and store in variable, n.
        System.out.println("-------------------------------");

        System.out.println("Enter choice between 1 thru 19: ");
        Scanner userInput = new Scanner(System.in); // Reading from System.in
        String n = userInput.next(); // Scans the next token of the input as an int

//        int n = userInput.nextInt(); // Scans the next token of the input as an int

        // Reference example from:
        //https://examples.javacodegeeks.com/java-basics/switch-statement/java-switch-case-example/

        //** Note: Saved the user input as a string.  Had issues declaring variable n as an integer
        //** which caused exception messages on the terminal when user entered a non-integer value.

        switch (n) {
            case "1":
                System.out.println("1. Platonism: learn more");
                break;
            case "2":
                System.out.println("2. Aristotelianism: be good");
                break;
            case "3":
                System.out.println("3. Cynicism: be self-sufficient");
                break;
            case "4":
                System.out.println("4. Hedonism: have pleasure now");
                break;
            case "5":
                System.out.println("5. Epicureanism: free yourself from pain");
                break;
            case "6":
                System.out.println("6. Stoicism: be logical, don’t suffer");
                break;
            case "7":
                System.out.println("7. Classical Liberalism: defend individual liberty");
                break;
            case "8":
                System.out.println("8. Kantianism: do as you’d have others do (your duty)");
                break;
            case "9":
                System.out.println("9. Nihilism: do anything (life has no meaning)");
                break;
            case "10":
                System.out.println("10. Pragmatism: bring the most good to humans");
                break;
            case "11":
                System.out.println("11. Theism: follow God’s will");
                break;
            case "12":
                System.out.println("12. Existentialism: make decisions and be positive");
                break;
            case "13":
                System.out.println("13. Absurdism: stop making sense of life, just live");
                break;
            case "14":
                System.out.println("14. Humanism: act in self-interest and common good");
                break;
            case "15":
                System.out.println("15. Logical Positivism: life has no meaning, until you give it one");
                break;
            case "16":
                System.out.println("16. Natural Pantheism: care for nature");
                break;
            case "17":
                System.out.println("17. Mohism: love people impartially");
                break;
            case "18":
                System.out.println("18. Confucianism: live an ordinary life");
                break;
            case "19":
                System.out.println("19. Legalism: learn practical things");
                break;
            default:
                System.out.println("Invalid Choice.");
                break;

        }

    }
}
