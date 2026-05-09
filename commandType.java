package bg.tu_varna.sit.f24621853.project11.command;

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

    private final String commandName;

    CommandType(String commandName) {
        this.commandName = commandName;
    }

    public String getCommandName() {
        return commandName;
    }

    public static CommandType fromString(String commandName) {
        for (CommandType commandType : CommandType.values()) {
            if (commandType.commandName.equalsIgnoreCase(commandName)) {
                return commandType;
            }
        }

        return null;
    }
}
