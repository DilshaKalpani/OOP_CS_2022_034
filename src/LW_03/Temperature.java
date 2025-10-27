package LW_03;

public class Temperature {
    private double celsius;

    //constructor without arguments
    Temperature() {
        celsius = 0;
    }

    //constructor with arguments
    Temperature(double celsius) {
        this.celsius = celsius;
    }

    double toCelsius() {
        return celsius;
    }

    double toFahrenheit() {
        return celsius * 9 / 5 + 32;
    }

    void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    void setFahrenheit(double fahrenheit) {
        this.celsius = (fahrenheit - 32) * 5 / 9;
    }
}