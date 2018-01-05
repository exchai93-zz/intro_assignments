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

}