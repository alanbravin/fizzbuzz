public class MultipleOfThree extends MultipleAbstract {
    public MultipleOfThree(Number number) {
        super(number, 3, "Fizz");
    }

    @Override
    public String print(Number number, String outline) {
        return super.print(number, outline);
    }

    @Override
    public void setNextMultiple(IMultiple nextMultiple) {
        super.setNextMultiple(nextMultiple);
    }
}
