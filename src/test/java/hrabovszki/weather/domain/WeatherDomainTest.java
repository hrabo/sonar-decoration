package hrabovszki.weather.domain;

import org.junit.jupiter.api.Test;

import static java.math.BigDecimal.ONE;
import static java.math.BigDecimal.TEN;
import static org.assertj.core.api.Assertions.assertThat;

class WeatherDomainTest {

    @Test
    void shouldPass() {
        Weather weather = new Weather("Szeged", TEN);
        assertThat(weather.city()).isEqualTo("Szeged");
        assertThat(weather.temperature()).isEqualTo(TEN);
    }

    @Test
    void shouldFormatWeather() {
        Weather weather = new Weather("Szeged", TEN);
        assertThat(weather.formatted()).isEqualTo("city: Szeged,temperature: 10");
    }

    @Test
    void shouldBeEqual() {
        Weather szeged = new Weather("Szeged", TEN);
        Weather szeged2 = new Weather("Szeged", TEN);
        assertThat(szeged.equals(szeged)).isTrue();
        assertThat(szeged.equals(szeged2)).isTrue();
    }

    @Test
    void shouldNotBeEqual() {
        Weather szeged = new Weather("Szeged", TEN);
        Weather szeged2 = new Weather("Szeged", ONE);
        assertThat(szeged.equals(szeged2)).isTrue();
    }
}
