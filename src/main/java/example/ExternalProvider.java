/**
 * Created by thorweinreich on 13.11.16.
 */
package example;

class ExternalProvider {
    private String ressource = "This is an example for an external ressource that could be mocked";
    private String resource;

    public String getRessource() {
        return ressource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }
}
