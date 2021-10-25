import java.util.Locale;

public class Main {
    public static void main(String[] args){

        String name = "  Bro";
        boolean result = name.equalsIgnoreCase("bro");//대소문자를 구분하지 않고 비교
        boolean result2 = name.equals("bro");//대소문자를 구분하면서 비교
//        System.out.println("result : " + result + "result2 : " + result2);

        int intResult = name.length();
        char charResult = name.charAt(0);
        intResult = name.indexOf("o");
        result = name.isEmpty();
        String stringResult = name.toLowerCase();
        stringResult = name.toUpperCase();
        stringResult = name.trim();
        System.out.println(stringResult);
        stringResult = name.replace('o','a');
        System.out.println(stringResult);


    }
}
