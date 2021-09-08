package tests;

import config.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WebTest {

    @Test
    public void localWebTest() {
        System.setProperty("remote", "local");
        WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());
        assertThat(config.browserName()).isEqualTo("safari");
        assertThat(config.browserVersion()).isEqualTo("14");
        assertThat(config.isRemote()).isEqualTo(false);
    }

    @Test
    public void remoteWebTest() {
        System.setProperty("remote", "remote");
        WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());
        assertThat(config.browserName()).isEqualTo("chrome");
        assertThat(config.browserVersion()).isEqualTo("89");
        assertThat(config.isRemote()).isEqualTo(true);
    }
}
