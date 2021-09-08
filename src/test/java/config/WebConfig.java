package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:${remote}.properties"})

public interface WebConfig extends Config {

    @Key("browser.name")
    @DefaultValue("firefox")
    String browserName();

    @Key("browser.version")
    @DefaultValue("89.0")
    String browserVersion();

    @Key("is_remote")
    boolean isRemote();

}
