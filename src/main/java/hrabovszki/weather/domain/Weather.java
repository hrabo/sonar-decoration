package hrabovszki.weather.domain;

import java.math.BigDecimal;

public record Weather(String city, BigDecimal temperature) {

    public String formatted() {
        return """
        city: $city
        temperature: $temperature
        """.replace("$city", city).replace("$temperature", temperature.toString());
    }

}
