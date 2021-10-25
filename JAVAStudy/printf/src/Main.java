public class Main {

    public static void main(String[] args){
//        System.out.printf("%d This is a format string", 123);

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = -1000;

        System.out.printf("%b\n",myBoolean);
        System.out.printf("%c\n",myChar);
        System.out.printf("%s\n",myString);
        System.out.printf("%d\n",myInt);
        System.out.printf("%f\n",myDouble);

        System.out.printf("Hello %10s!\n",myString);   // 10자리 오른쪽 정렬
        System.out.printf("Hello %-10s!\n",myString);  // 10자리 왼쪽 정렬


        System.out.printf("%f\n",myDouble);
        System.out.printf("%.1f\n",myDouble);

        // [flags]
        // adds an effect to output based on the flag added to format specifier
        // - : left-justify
        // + : output a plus(+) or minus(-) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000
        System.out.printf("%-10f\n",myDouble);
        System.out.printf("%+f\n",myDouble);
        System.out.printf("%020f\n",myDouble);
        System.out.printf("%,f\n",myDouble);
    }
}
