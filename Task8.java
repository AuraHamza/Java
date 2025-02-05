package Weather;
public class WeatherMonitoringSystem {
    public static void adjustTemperatures(int[] temperatures){
        System.out.println("Original Temperatures: ");
        for (int temp : temperatures) {
            System.out.print(temp + " ");
        }

        System.out.println("\nModified Temperatures (After adding 2 degrees): ");
        for (int i = 0; i < temperatures.length; i++) {
            temperatures[i] += 2;  // Add 2 degrees to each value
            System.out.print(temperatures[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] dailyTemperatures = {30, 32, 31, 29, 28, 33, 34};

        adjustTemperatures(dailyTemperatures);
    }
}


