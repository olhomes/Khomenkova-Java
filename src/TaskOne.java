import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int userInput = scanner.nextInt();
        if (userInput > 7) {
            System.out.println("Привет");
        }
        scanner.close();
    }
}
