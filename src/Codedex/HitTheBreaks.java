package Codedex;

public class HitTheBreaks {
    static void main(String[] args) {
        for (int num = 1; num <= 11; num++) {
            System.out.println("num = " + num);
            if (num % 2  == 0 && num % 3 == 0) {
                System.out.println("Break at " + num);
                break;
            }
        }
    }
}
