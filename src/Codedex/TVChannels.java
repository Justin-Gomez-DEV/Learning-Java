package Codedex;

public class TVChannels {
    public static void main(String[] args) {
        System.out.println("The result is " + multiply(new int[]{1, 2, 3, 4, 5}));
        System.out.println("The result is " + multiply(13, 8, 7));
        System.out.println("The result is " + multiply(7, 9, 3));
        System.out.println("The result is " + multiply(233.9, 0.09));
        System.out.println("The result is " + multiply(0.1, 0.1));
    }
    public static int multiply(int[] channelCodes) {
        int result = 1;
        for (int i = 0; i < channelCodes.length; i++) {
            result *= channelCodes[i];
        }
        return result;
    }
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }
    public static double multiply(double d, double e){
       return d * e;
    }
}
