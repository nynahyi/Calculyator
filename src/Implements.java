public class Implements {
    public static String[] massivValue(String str) {
        String[] val = str.split(" ");
        return val;
    }
    public static  boolean flag(String s, String [] massiv){
        boolean x = false;
        for (int i = 0;i < massiv.length; i++){
            if(s.contains(massiv[i])){
                return x = true;
            }
        }
        return x;
    }
    public static int resArab(String znak, int a, int b){
       return switch (znak) {
           case ("+") -> a + b;
           case ("-") -> a - b;
           case ("*") -> a * b;
           case ("/") -> a / b;
           default -> 0;
       };
    }
}






