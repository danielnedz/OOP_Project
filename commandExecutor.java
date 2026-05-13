package bg.tu_varna.sit.f24621853.project11.command;

import java.util.HashMap;
import java.util.Map;

/**
 * Клас, който отговаря за изпълнението на командите.
 * <p>
 * Получава пълния ред, въведен от потребителя, разделя го на име на команда
 * и аргументи, намира съответния обект-команда и извиква неговия метод execute.
 */
public class CommandExecutor {

    /**
     * Колекция, която свързва всеки тип команда с неговата реализация.
     */
    private final Map<CommandType, Command> commands;

    /**
     * Създава нов CommandExecutor и регистрира наличните команди.
     */
    public CommandExecutor() {
        this.commands = new HashMap<>();

        commands.put(CommandType.HELP, new HelpCommand());
        commands.put(CommandType.EXIT, new ExitCommand());
    }

    /**
     * Изпълнява команда, въведена от потребителя.
     * <p>
     * Първата дума от въведения текст се приема за име на командата.
     * Останалите думи се приемат за аргументи на командата.
     *
     * @param input пълен команден ред, въведен от потребителя
     */
    public void execute(String input) {
        String[] parts = input.trim().split("\\s+");

        String commandName = parts[0];
        String[] args = new String[parts.length - 1];

        for (int i = 1; i < parts.length; i++) {
            args[i - 1] = parts[i];
        }

        CommandType commandType = CommandType.fromString(commandName);

        if (commandType == null) {
            System.out.println("Unknown command. Type help to see all commands.");
            return;
        }

        Command command = commands.get(commandType);

        if (command == null) {
            System.out.println("This command is not implemented yet.");
            return;
        }

        command.execute(args);
    }
}
