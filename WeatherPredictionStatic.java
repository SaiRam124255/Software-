public class WeatherPredictionStatic {
    public static void main(String[] args) {
        staticValues();
    }

    private static void staticValues() {
        double t = 25.0;
        double h = 70.0;
        double w = 10.0;

        processInput(t, h, w);
    }

    private static void processInput(double t, double h, double w) {
        double W = 0.5 * Math.pow(t, 2) - 0.2 * h - 0.1 * w - 15;
        System.out.println(W);

        if (W > 300) {
            System.out.println("Sunny");
        } else if (200 < W && W <= 300) {
            System.out.println("Cloudy");
        } else if (100 < W && W <= 200) {
            System.out.println("Rainy");
        } else {
            System.out.println("Stormy");
        }
    }
}