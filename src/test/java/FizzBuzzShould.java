import com.leanmind.ciscoadiz.bizzbuzz.FizzBuzz;
import com.leanmind.ciscoadiz.bizzbuzz.Text;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;


public class FizzBuzzShould {
    @Test
    public void buildFizzBuzzFirstPlaceShouldBeOne() {
        Text expected = new Text("1");
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals(expected, fizzBuzz.buildFizzBuzz().toArray()[0]);
    }

    @Test
    public void buildFizzBuzzThirdPlaceShouldBeFizz() {
        Text expected = new Text("Fizz");
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals(expected, fizzBuzz.buildFizzBuzz().toArray()[2]);
    }

    @Test
    public void buildFizzBuzzFifthPlaceShouldBeBuzz() {
        Text expected = new Text("Buzz");
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals(expected, fizzBuzz.buildFizzBuzz().toArray()[4]);
    }

    @Test
    public void buildFizzBuzzFifteenthPlaceShouldBeFizzBuzz() {
        Text expected = new Text("FizzBuzz");
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assert.assertEquals(expected, fizzBuzz.buildFizzBuzz().toArray()[14]);
    }
}
