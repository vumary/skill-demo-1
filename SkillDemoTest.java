import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void multiply() {
        assertEquals(2, SkillDemo.mult(1, 3));
    }
}
