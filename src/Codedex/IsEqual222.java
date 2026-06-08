package Codedex;

public class IsEqual222 {
    public static void main(String[] args) {
        System.out.println("The first method is " + isEqual222(47, 85, 90));
        System.out.println("The second method is " + isEqual222(90, 10, 47));
        System.out.println("The third method is " + isEqual222(30, 80, 82));
    }

    public static boolean isEqual222(int a, int b, int c) {
        if (a + b + c == 222) {
            return true;
        } else {
            return false;
        }
    }
}
