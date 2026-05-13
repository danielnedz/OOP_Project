package bg.tu_varna.sit.f24621853.project11.command;

/**
 * Команда, която прекратява работата на системата.
 */
public class ExitCommand implements Command {

    /**
     * Спира изпълнението на програмата.
     *
     * @param args аргументи на командата, които тук не се използват
     */
    @Override
    public void execute(String[] args) {
        System.out.println("Exiting the program...");
        System.exit(0);
    }
}
