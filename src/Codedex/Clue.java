package Codedex;

import java.util.Arrays;

public class Clue {
    public static void main(String[] args) {
        String[] password = {"ASDFDFA", "34958234985234820934", "243082304920394", "ASDFAFMMMMMMMMM99999999", "12212112", "23094230482"};
        String[] sortedPassword = new String[3];

        String passphrase = "";

        Arrays.sort(password);

        sortedPassword[0] = password[0];
        sortedPassword[1] = password[1];
        sortedPassword[2] = password[2];

        for (int i = 0; i < sortedPassword.length; i++) {
            passphrase += sortedPassword[i];
        }

        System.out.println(passphrase);
    }
}
