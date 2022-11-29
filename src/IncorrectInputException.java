public class IncorrectInputException extends NumberFormatException {

    public IncorrectInputException(String text) {
        super("Âû ââåëè òåêñò " + "'" + text + "'" + " ,à íóæíî öèôðîâûå çíà÷åíèÿ");
    }
}