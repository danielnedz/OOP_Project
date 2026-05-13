package bg.tu_varna.sit.f24621853.project11.command;

/**
 * Изброим тип, който съдържа всички поддържани команди в системата.
 * <p>
 * Всяка команда има текстово име, което потребителят въвежда в конзолата.
 */
public enum CommandType {
    OPEN("open"),
    CLOSE("close"),
    SAVE("save"),
    SAVE_AS("saveas"),
    HELP("help"),
    EXIT("exit"),

    ADD_EVENT("addevent"),
    FREE_SEATS("freeseats"),
    BOOK("book"),
    UNBOOK("unbook"),
    BUY("buy"),
    BOOKINGS("bookings"),
    CHECK("check"),
    REPORT("report");

    /**
     * Текстово име на командата.
     */
    private final String commandName;

    /**
     * Създава нов тип команда с конкретно текстово име.
     *
     * @param commandName текстово име на командата
     */
    CommandType(String commandName) {
        this.commandName = commandName;
    }

    /**
     * Връща текстовото име на командата.
     *
     * @return име на командата
     */
    public String getCommandName() {
        return commandName;
    }

    /**
     * Намира тип команда по въведено текстово име.
     * <p>
     * Сравнението не зависи от малки и главни букви.
     * Например "help", "Help" и "HELP" се приемат като една и съща команда.
     *
     * @param commandName име на команда, въведено от потребителя
     * @return съответният CommandType или null, ако командата не съществува
     */
    public static CommandType fromString(String commandName) {
        for (CommandType commandType : CommandType.values()) {
            if (commandType.commandName.equalsIgnoreCase(commandName)) {
                return commandType;
            }
        }

        return null;
    }
}
