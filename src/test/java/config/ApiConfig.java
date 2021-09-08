package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"file:/user/api.properties",
        "classpath:api.properties"})

public interface ApiConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://github.com")
    String baseUrl();

    @Key("token")
    String token();

}
