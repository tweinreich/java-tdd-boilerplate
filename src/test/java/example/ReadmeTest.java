/**
 * Created by thorweinreich on 12.11.16.
 */
package example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ReadmeTest {


    @Test
    public void it_can_get_the_headline_of_the_readme() {
        String expectedHeadline = "* Welcome to the Java-TDD-Boilerplate! * * *";
        Readme readme = new Readme();
        assertEquals(expectedHeadline, readme.getHeadline());
    }

    @Test
    public void it_can_get_the_intro_text() {
        String expectedText =   "\n1. Create your tests in /src/test/java/\n" +
                                "2. Create your classes in /src/main/java/\n" +
                                "3. Look at this examples to get an idea how to do this";
        Readme readme = new Readme();
        assertEquals(expectedText, readme.getIntroText());
    }

    @Test
    public void it_can_get_ressource_from_external_provider() {
        Readme readme = new Readme();
        String expectedResource = "This is an example for an external ressource that could be mocked";
        ExternalProvider externalProviderMock = mock(ExternalProvider.class);
        externalProviderMock.setResource(expectedResource);
        verify(externalProviderMock).setResource(expectedResource);
        when(externalProviderMock.getRessource()).thenReturn(expectedResource);
        readme.setExternalRessource(externalProviderMock.getRessource());
        assertEquals(expectedResource, readme.getExternalRessource());
    }
}
