import com.intuit.karate.junit5.Karate;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
public class maintestingapplication {
    @Karate.Test
    Karate testAll() {
        return Karate.run().relativeTo(getClass());
    }
}

