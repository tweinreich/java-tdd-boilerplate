/**
 * Created by thorweinreich on 12.11.16.
 */
public class Readme {


    private String headline = "* Welcome to the Java-TDD-Boilerplate! * * *";
    private String introText =  "\n1. Create your tests in /src/test/java/\n" +
                                "2. Create your classes in /src/main/java/\n" +
                                "3. Look at this examples to get an idea how to do this";
    private String externalRessource;

    public static void main(String[] args){
        Readme readme = new Readme();
        ExternalProvider externalProvider = new ExternalProvider();
        readme.setExternalRessource(externalProvider.getRessource());

        System.out.println("* * * * * * * * * * * * * * * * * * * * *");
        readme.getHeadline();
        System.out.println("* * * * * * * * * * * * * * * * * * * * *");
        System.out.println();
        readme.getIntroText();
    }

    public String getHeadline() {
        System.out.println(headline);
        return headline;
    }

    public String getIntroText() {
        System.out.println(introText);
        return introText;
    }

    public String getExternalRessource() {
        return externalRessource;
    }

    public void setExternalRessource(String externalRessource) {
        this.externalRessource = externalRessource;
    }
}
