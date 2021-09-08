package tests;

import config.ApiConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ApiTest {

    @Test
    public void apiTest() {
        ApiConfig config = ConfigFactory.create(ApiConfig.class, System.getProperties());
        assertThat(config.baseUrl()).isEqualTo("https://google.by");
        assertThat(config.token()).isEqualTo("jd8921hjd921hdh");
    }
}
