package homework.bank.model;

public class Application {
        String name;
        String version;
        String developer;

    public Application(String name, String version, String developer) {
        this.name = name;
        this.version = version;
        this.developer = developer;
    }

    public Application() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }
}
