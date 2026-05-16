package bg.tu_varna.sit.f24621853.project11;

import bg.tu_varna.sit.f24621853.project11.command.CommandExecutor;

import java.util.Scanner;

/**
 * Главен клас на системата за билетна каса.
 * <p>
 * Този клас стартира конзолното приложение.
 * Чете команди от потребителя и ги подава към класа CommandExecutor,
 * който отговаря за тяхното изпълнение.
 */
public class Main {

    /**
     * Главен метод, от който започва изпълнението на програмата.
     *
     * @param args аргументи от командния ред, които не се използват в този проект
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CommandExecutor commandExecutor = new CommandExecutor();

        System.out.println("Ticket Office System");
        System.out.println("Type help to see all commands.");

        while (true) {
            System.out.print("> ");

            String input = scanner.nextLine();

            if (input.trim().isEmpty()) {
                continue;
            }

            commandExecutor.execute(input);
        }
    }
}
