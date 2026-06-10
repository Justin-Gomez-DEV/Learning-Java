package Codedex;

public class Rocket {
    public static void main(String[] args) {
        double timeOne = 2.5;
        double timeTwo = 3.0;
        System.out.println("Rounded distance: " + launchCalculator(timeOne, timeTwo));
    }
    public static int launchCalculator(double timeOne, double timeTwo){
        double distanceTravelled = (timeOne * timeTwo);
        return (int) Math.round(distanceTravelled);
    }
}
