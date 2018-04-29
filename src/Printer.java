public class Printer {
    public String print(Number number) {
        IMultiple multipleOfThree = new MultipleOfThree(number);
        IMultiple multipleOfFive = new MultipleOfFive(number);
        IMultiple notMultipleOfNothing = new NotMultipleOfNothing();

        multipleOfThree.setNextMultiple(multipleOfFive);
        multipleOfFive.setNextMultiple(notMultipleOfNothing);

        return multipleOfThree.print(number, "");
    }
}
