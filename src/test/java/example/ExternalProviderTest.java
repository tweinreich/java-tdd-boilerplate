
/**
 * Created by thorweinreich on 13.11.16.
 */
package example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExternalProviderTest {

    @Test
    public void it_can_have_a_source_to_provide() {
        ExternalProvider externalProvider = new ExternalProvider();
        String expectedReturn = "This is an example for an external ressource that could be mocked";
        assertEquals(expectedReturn, externalProvider.getRessource());
    }
}
