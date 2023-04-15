public class StatisticsDisplay implements Display {
    private float temperatureMin = Float.MAX_VALUE;
    private float temperatureMax = Float.MIN_VALUE;
    private float tempRunningTotal = 0.0f;
    private int numReadings = 0;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        // Update temperature statistics
        if (temperature < temperatureMin) {
            temperatureMin = temperature;
        }
        if (temperature > temperatureMax) {
            temperatureMax = temperature;
        }
        tempRunningTotal += temperature;
        numReadings++;
    }

    @Override
    public void update() {

    }

    @Override
    public void display() {
        float averageTemperature = tempRunningTotal / numReadings;
        System.out.println("Temperature: ");
        System.out.println(" - Min: " + temperatureMin);
        System.out.println(" - Max: " + temperatureMax);
        System.out.println(" - Average: " + averageTemperature);
    }
}