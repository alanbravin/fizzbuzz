public class NotMultipleOfNothing implements IMultiple {

    @Override
    public String print(Number number, String outline) {
        if (outline.equals("")) {
            return "" + number.getValue();
        } else {
            return outline;
        }
    }

    @Override
    public void setNextMultiple(IMultiple nextMultiple) {

    }
}
