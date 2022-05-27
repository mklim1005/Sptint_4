import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestAccountParam {

    private final String name;
    private final boolean expected;

    public TestAccountParam(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getData() {
        return new Object[][] {
                { "Marina Klimova", true},
                { "MarinaKlimova", true},
        };
    }

    @Test
    public void testName()  {
        Account account = new Account(name);
        boolean result = account.checkNameToEmboss();
        assertEquals(expected, result);
    }



}
