import com.leanmind.ciscoadiz.bizzbuzz.FizzBuzz;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzShould {
    @Test
    public void buildFizzBuzzFirstPlaceShouldBeOne() {
        String expected = "1";
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals(expected, fizzBuzz.buildFizzBuzz().get(0));
    }

    @Test
    public void buildFizzBuzzThirdPlaceShouldBeFizz() {
        String expected = "Fizz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals(expected, fizzBuzz.buildFizzBuzz().get(2));
    }


}
