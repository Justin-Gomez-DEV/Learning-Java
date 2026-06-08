package Codedex;

public class EarthsMoon {
    public static void main(String[] args) {
        earthMoonWeight("Justin", 54, "kg");
    }

    public static double earthMoonWeight(String name, int weight, String unit) {
        double moonWeight = weight * (1.62 / 9.81);

        System.out.println("Hi " + name + "! Your weight on Earth is " + weight + unit +" and your weight on the moon would be about " + moonWeight + unit + ".");

        return moonWeight;
    }
}