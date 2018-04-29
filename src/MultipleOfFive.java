public class MultipleOfFive extends MultipleAbstract implements IMultiple {
    public MultipleOfFive(Number number) {
        super(number, 5, "Buzz");
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
