package seedu.penus.ui;

public class Ui {
    public static final String LOGO = "\n"
        + "\t___   ____  _      _     __  \n"
        + "\t| |_) | |_  | |\\ | | | | ( (`\n"
        + "\t|_|   |_|__ |_| \\| \\_\\_/ _)_)\n";



    public static void printDivider() {
        System.out.println("\t____________________________________");
    }

    public static void printWelcome() {
        printDivider();
        System.out.println(LOGO);
        System.out.println("\tWelcome to PENUS!\n"
                + "\tWhat can I do for you?");
        printDivider();
    }

    public static void printExit() {
        printDivider();
        System.out.println("\tBye see you again!");
        printDivider();
    }

    /**
     * Prints the message passed as an array onto the terminal line by line
     * {@code @input} messages string array
     */
    public static void printMessage(String[] messages) {
        printDivider();
        for (String message : messages) {
            System.out.println(message);
        }
        printDivider();
    }
}