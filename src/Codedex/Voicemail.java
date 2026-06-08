package Codedex;

public class Voicemail {
    public static void main(String[] args) {
        willCallBack("1234567890");
        willCallBack("8005551234");
        willCallBack("987654321");
        willCallBack("12345abcd1");
        willCallBack("4567890123");
    }

    public static void willCallBack(String phoneNum) {
        if (phoneNum.length() != 10) {
            System.out.println("Unfortunately, " + phoneNum + " is not a valid phone number.");
            return;
        }

        if (!phoneNum.matches("\\d+")) {
            System.out.println("You have invalid characters in " + phoneNum);
            return;
        }

        if (phoneNum.startsWith("800")) {
            System.out.println("The number " + phoneNum + " might be a spam call.");
            return;
        }

        System.out.println("There is one voicemail message from " + phoneNum + ".");
    }
}
