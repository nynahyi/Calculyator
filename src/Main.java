import java.util.Arrays;
import java.util.Scanner;

public class Main extends Implements {
    public static void main(String[] args) {
        System.out.println("Введите выражение: ");
        Scanner sc = new Scanner(System.in);
        String[] oRome = {"I", "V", "X", "L", "C", "D", "M"};
        String value = sc.nextLine().toUpperCase();
        String[] value1 = Implements.massivValue(value);
        boolean bValue =Implements.flag(value,oRome);
        if (bValue) {
            String[] rome = value1[0].split("");
            String[] rome1 = value1[2].split("");
            String znak = value1[1];
            int num = Perevod.resArab(rome);
            int num2 = Perevod.resArab(rome1);
            int resArab1 = Implements.resArab(znak, num, num2);
            System.out.println("Результат в Арабскийх цифрах: " + resArab1);
            StringBuilder resRim1 = Perevod.aRome(resArab1);
            System.out.println("Результат в Римских цифрах: " + resRim1);
        }else{
            int aNum = Integer.parseInt(value1[0]);
            int aNum1 = Integer.parseInt(value1[2]);
            String zn = value1[1];
            int aRes = Implements.resArab(zn, aNum, aNum1);
            System.out.println("Результат в Арабских цифрах: " + aRes);
            StringBuilder resRim = Perevod.aRome(aRes);
            System.out.println("Результат в Римских цифрах: " + resRim);
        }

    }
}






