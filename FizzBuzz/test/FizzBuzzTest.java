import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class FizzBuzzTest {

   @Test
    public void of_0is0() {
       assertThat(FizzBuzz.of(0), is("0"));
   }

   @Test
    public void of_1is1() {
       assertThat(FizzBuzz.of(1), is("1"));
   }

   @Test
    public void of_3isFizz() {
       assertThat(FizzBuzz.of(3), is("Fizz"));
   }

   @Test
    public void of_5isBuzz() {
       assertThat(FizzBuzz.of(5), is("Buzz"));
   }

   @Test
    public void of_6isFizz() {
       assertThat(FizzBuzz.of(6), is("Fizz"));
   }

   @Test
    public void of_10isBuzz() {
       assertThat(FizzBuzz.of(10), is("Buzz"));
   }

   @Test
    public void of_15isFizzBuzz() {
       assertThat(FizzBuzz.of(15), is("FizzBuzz"));
   }

}