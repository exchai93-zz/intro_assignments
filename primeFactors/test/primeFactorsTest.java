import com.sun.javafx.collections.ImmutableObservableList;
import jdk.nashorn.internal.ir.annotations.Immutable;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;

public class primeFactorsTest {

    @Test
    public void generate_1isNone() {
        assertThat(primeFactors.generate(1), is(ImmutableList.generate()));
    }

    @Test
    public void generate_2is2() {
        assertThat(primeFactors.generate(2), is(ImmutableList.generate(2)));
    }

}