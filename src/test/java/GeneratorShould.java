import com.leanmind.ciscoadiz.bizzbuzz.FizzBuzz;
import com.leanmind.ciscoadiz.bizzbuzz.Generator;
import com.leanmind.ciscoadiz.bizzbuzz.Text;
import org.junit.Assert;
import org.junit.Test;


public class GeneratorShould {
    @Test
    public void buildFizzBuzzFirstPlaceShouldBeOne() {
        Text expected = new Text("1");
        var generator = new Generator();
        Assert.assertEquals(expected, generator.make(1));
    }

    @Test
    public void buildFizzBuzzThirdPlaceShouldBeFizz() {
        Text expected = new Text("Fizz");
        var generator = new Generator();
        Assert.assertEquals(expected, generator.make(3));
    }

    @Test
    public void buildFizzBuzzFifthPlaceShouldBeBuzz() {
        Text expected = new Text("Buzz");
        var generator = new Generator();
        Assert.assertEquals(expected, generator.make(5));
    }

    @Test
    public void buildFizzBuzzFifteenthPlaceShouldBeFizzBuzz() {
        Text expected = new Text("FizzBuzz");
        var generator = new Generator();

        Assert.assertEquals(expected, generator.make(15));
    }
}
