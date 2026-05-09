package bg.tu_varna.sit.f24621853.project11.command;

import java.util.HashMap;
import java.util.Map;

public class CommandExecutor {
    private final Map<CommandType, Command> commands;

    public CommandExecutor() {
        this.commands = new HashMap<>();

        commands.put(CommandType.HELP, new HelpCommand());
        commands.put(CommandType.EXIT, new ExitCommand());
    }

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
