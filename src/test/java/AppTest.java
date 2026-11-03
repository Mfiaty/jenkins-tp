import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    void addition() {
        assertEquals(4, App.add(2, 2));
    }

    @Test
    void autreAddition() {
        assertEquals(11, App.add(7, 3));
    }
}
