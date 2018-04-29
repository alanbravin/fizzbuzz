import org.junit.Assert;
import org.junit.Test;

public class MainTeste {
    @Test
    public void testNumberMultipleOfFifteen() {
        Number numberMultipleOfFifteen = new Number(30);
        String expectedResultFizzBuzz = "FizzBuzz";

        Printer printer = new Printer();
        Assert.assertEquals(printer.print(numberMultipleOfFifteen), expectedResultFizzBuzz);
    }

    @Test
    public void testNumberMultipleOfThree() {
        Number numberMultipleOfThree = new Number(6);
        String expectedResultFizz = "Fizz";

        Printer printer = new Printer();
        Assert.assertEquals(printer.print(numberMultipleOfThree), expectedResultFizz);
    }

    @Test
    public void testNumberMultipleOfFive() {
        Number numberMultipleOfFive = new Number(10);
        String expectedResultBuzz = "Buzz";
        Printer printer = new Printer();

        Assert.assertEquals(printer.print(numberMultipleOfFive), expectedResultBuzz);
    }

    @Test
    public void testNumberNotMultipleOfThreeOrFive() {
        Number numberNotMultipleOfThreeOrFive = new Number(2);
        String expectedResultTwo = "2";

        Printer printer = new Printer();
        Assert.assertEquals(printer.print(numberNotMultipleOfThreeOrFive), expectedResultTwo);
    }
}
