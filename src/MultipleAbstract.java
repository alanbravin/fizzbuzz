public abstract class MultipleAbstract implements IMultiple {
    private IMultiple nextMultiple;
    private Number number;
    private int divisor;
    private String out;

    public MultipleAbstract(Number number, int divisor, String out) {
        this.number = number;
        this.divisor = divisor;
        this.out = out;
    }

    public String print(Number number, String outline) {
        if (number.getValue() % divisor == 0) {
            outline += out;
        }

        return nextMultiple.print(number, outline);
    }

    public void setNextMultiple(IMultiple nextMultiple) {
        this.nextMultiple = nextMultiple;
    }
}
