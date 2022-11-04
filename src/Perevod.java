import java.util.Arrays;

public class Perevod {
    String[] oRome = {"I", "V", "X", "L", "C", "D", "M"};

    public static int resArab(String[] myRome) {
        int resArab = 0;
        int[] arab = new int[myRome.length];
        for (int j = 0; j < myRome.length; j++) {
            if (myRome[j].equals("I")) arab[j] = 1;
            if (myRome[j].equals("V")) arab[j] = 5;
            if (myRome[j].equals("X")) arab[j] = 10;
            if (myRome[j].equals("L")) arab[j] = 50;
            if (myRome[j].equals("C")) arab[j] = 100;
            if (myRome[j].equals("D")) arab[j] = 500;
            if (myRome[j].equals("M")) arab[j] = 1000;
        }
        if (arab.length == 1) {
            resArab = arab[0];
        } else if (arab.length > 1) {
            for (int i = 0; i < arab.length; i++) {
                if (i == arab.length - 1) resArab += arab[i];
                else if (arab[i] < arab[i + 1]) {
                    resArab += arab[i + 1] - arab[i];
                    i++;
                } else if (arab[i] >= arab[i + 1]) {
                    resArab += arab[i];
                }
            }
        }
        return resArab;
    }

    public static StringBuilder aRome(int arab) {
        StringBuilder aRome = new StringBuilder();
        while (arab >= 1000) {
            arab = arab - 1000;
            aRome.append("M");
        }while (arab >= 900) {
            arab = arab - 900;
            aRome.append("CM");
        }while (arab >= 500) {
            arab = arab - 500;
            aRome.append("D");
        }while (arab >= 400) {
            arab = arab - 400;
            aRome.append("CD");
        }while (arab >= 100) {
            arab = arab - 100;
            aRome.append("C");
        }while (arab >= 90) {
            arab = arab - 90;
            aRome.append("XC");
        }while (arab >= 50) {
            arab = arab - 50;
            aRome.append("L");
        }while (arab >= 40) {
            arab = arab - 40;
            aRome.append("XL");
        }while (arab >= 10) {
            arab = arab - 10;
            aRome.append("X");
        }while (arab >= 9) {
            arab = arab - 9;
            aRome.append("IX");
        }while (arab >= 5) {
            arab = arab - 5;
            aRome.append("V");
        }while (arab >= 4) {
            arab = arab - 4;
            aRome.append("IV");
        }while (arab >= 1) {
            arab = arab - 1;
            aRome.append("I");
        }
        return aRome;

    }
}




