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


}
