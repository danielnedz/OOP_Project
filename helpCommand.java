package bg.tu_varna.sit.f24621853.project11.command;

/**
 * Команда, която извежда всички налични команди в приложението.
 */
public class HelpCommand implements Command {

    /**
     * Извежда информация за всички поддържани команди.
     *
     * @param args аргументи на командата, които тук не се използват
     */
    @Override
    public void execute(String[] args) {
        System.out.println("Available commands:");
        System.out.println("open <file>");
        System.out.println("close");
        System.out.println("save");
        System.out.println("saveas <file>");
        System.out.println("help");
        System.out.println("exit");
        System.out.println("addevent <date> <hall> <name>");
        System.out.println("freeseats <date> <name>");
        System.out.println("book <row> <seat> <date> <name> <note>");
        System.out.println("unbook <row> <seat> <date> <name>");
        System.out.println("buy <row> <seat> <date> <name>");
        System.out.println("bookings [<date>] [<name>]");
        System.out.println("check <code>");
        System.out.println("report <from> <to> [<hall>]");
    }
}
