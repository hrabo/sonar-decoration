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

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Weather) obj;
        return Objects.equals(this.city, that.city) &&
                Objects.equals(this.temperature, that.temperature);
    }

}
