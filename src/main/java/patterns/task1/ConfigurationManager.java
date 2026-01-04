package patterns.task1;

public class ConfigurationManager {
    private static ConfigurationManager configurationManager;

    private String databaseURL = "database.com";

    private ConfigurationManager(){}

    public String getDatabaseURL(){
        return this.databaseURL;
    }

    public static ConfigurationManager getInstance(){
        if (configurationManager == null){
            configurationManager = new ConfigurationManager();
        }
        return configurationManager;
    }
}
