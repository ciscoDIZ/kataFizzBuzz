import com.leanmind.ciscoadiz.bizzbuzz.FizzBuzz;
import com.leanmind.ciscoadiz.bizzbuzz.Text;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FizzBuzzShould {
    @Test
    public void get_success_list() {
        List<Text> expected = buildList();
        Assert.assertEquals(expected, new FizzBuzz().buildFizzBuzz());
    }

    private List<Text> buildList() {
        var expected = List.of(new Text(1),
                new Text(2), new Text("Fizz"), new Text(4), new Text("Buzz"),
                new Text("Fizz"), new Text( 7), new Text( 8), new Text("Fizz"),
                new Text("Buzz"), new Text( 11), new Text("Fizz"), new Text( 13),
                new Text( 14), new Text( "FizzBuzz"), new Text( 16), new Text( 17),
                new Text("Fizz"), new Text( 19), new Text("Buzz"), new Text("Fizz"),
                new Text( 22), new Text( 23), new Text("Fizz"), new Text("Buzz"),
                new Text( 26), new Text("Fizz"), new Text( 28), new Text( 29),
                new Text( "FizzBuzz"), new Text( 31), new Text( 32), new Text("Fizz"),
                new Text( 34), new Text("Buzz"), new Text("Fizz"), new Text( 37),
                new Text( 38), new Text("Fizz"), new Text("Buzz"), new Text( 41),
                new Text("Fizz"), new Text( 43), new Text( 44), new Text( "FizzBuzz"),
                new Text( 46), new Text( 47), new Text("Fizz"), new Text( 49),
                new Text("Buzz"), new Text("Fizz"), new Text( 52), new Text( 53),
                new Text("Fizz"), new Text("Buzz"), new Text( 56), new Text("Fizz"),
                new Text( 58), new Text( 59), new Text( "FizzBuzz"), new Text( 61),
                new Text( 62), new Text("Fizz"), new Text( 64), new Text("Buzz"),
                new Text("Fizz"), new Text( 67), new Text( 68), new Text("Fizz"),
                new Text("Buzz"), new Text( 71), new Text("Fizz"), new Text( 73),
                new Text( 74), new Text( "FizzBuzz"), new Text( 76), new Text( 77),
                new Text("Fizz"), new Text( 79), new Text("Buzz"), new Text("Fizz"),
                new Text( 82), new Text( 83), new Text("Fizz"), new Text("Buzz"),
                new Text( 86), new Text("Fizz"), new Text( 88), new Text( 89),
                new Text( "FizzBuzz"), new Text( 91), new Text( 92), new Text("Fizz"),
                new Text( 94), new Text("Buzz"), new Text("Fizz"), new Text( 97),
                new Text( 98), new Text("Fizz"), new Text( "Buzz"));
        return expected;
    }
}
