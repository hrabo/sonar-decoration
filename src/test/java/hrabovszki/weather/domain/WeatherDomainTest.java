package hrabovszki.weather.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.math.BigDecimal.TEN;

class WeatherDomainTest {

    @Test
    void shouldPass() {
        Weather weather = new Weather("Szeged", TEN);

        Assertions.assertThat(weather.city()).isEqualTo("Szeged", TEN);
    }

    @Test
    void shouldFormatWeather() {
        Weather weather = new Weather("Szeged", TEN);

        Assertions.assertThat(weather.formatted()).isEqualTo("""
                city: Szeged
                temperature: 10
                """);
    }
}
