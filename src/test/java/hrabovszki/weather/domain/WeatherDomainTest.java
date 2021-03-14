package hrabovszki.weather.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeatherDomainTest {

    @Test
    public void shouldPass() {
        Weather weather = new Weather("Szeged");

        Assertions.assertThat(weather.city()).isEqualTo("Szeged");
    }
}
