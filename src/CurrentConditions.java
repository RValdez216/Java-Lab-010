public class CurrentConditions implements Display {
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherStation weatherStation;

    public CurrentConditions(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {

    }

    public void update() {
        temperature = weatherStation.getTemperature();
        humidity = weatherStation.getHumidity();
        pressure = weatherStation.getPressure();
        display();
    }

    public void display() {
        System.out.printf("Temperature: %.1fF, Humidity: %.1f%%, Pressure: %.2f in.\n", temperature, humidity, pressure);
    }
}