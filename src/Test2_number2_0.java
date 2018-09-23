public class Test2_number2_0
{
    public static void main (String [] args) {
        int a = (int) (Math.random() * 9);
        if (a == 0 || a == 1) {
            System.out.println("Result = "+a);
        } else {
            System.out.println(a);
            int result = 1;
            for (int i = 1; i <= a; i++)
                result *= i;
            System.out.println("result = " + result);


        }
    }}


