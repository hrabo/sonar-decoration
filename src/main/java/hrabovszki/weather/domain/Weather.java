package hrabovszki.weather.domain;

import java.math.BigDecimal;
import java.util.Objects;

public final class Weather {
    private final String city;
    private final BigDecimal temperature;

    public Weather(String city, BigDecimal temperature) {
        this.city = city;
        this.temperature = temperature;
    }

    public String formatted() {
        return String.format("city: %s,temperature: %s", city, temperature.toString());
    }

    public String city() {
        return city;
    }

    public BigDecimal temperature() {
        return temperature;
    }
}
