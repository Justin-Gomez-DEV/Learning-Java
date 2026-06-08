package Codedex;

public class ReturnBins {
    public static void main(String[] args) {
        String[] myItems = {"Apple Watch", "Size 9 Shoes", "Wallet", "Suitcase", "Laptop"};
        returnBin(myItems);
    }

    public static void returnBin(String[] myItems) {
        for (int i = 1; i <= myItems.length; i++) {
            System.out.println(i + " " + myItems[i - 1]);
        }
    }
}