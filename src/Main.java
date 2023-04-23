import java.awt.*;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //different types of variables in Java: primitive and Reference Types
        int num1= 2;
        float labValue= 12.5F;
        long numViews=1_123_124_123L;
        int x=5;
        int y=3;
        Point location= new Point(x=2,y=9);
        String name="Leila";
        int lengthOfName=name.length();
        Point location2= location;
        location.x=5;

        //arithmetic operations
        int result = 2+2;
        int result2 =(int)2.3 * (int)2.3;
        double result4= (double)2/ 2.3;
        System.out.println(result4);
        System.out.println(result + 2);

        //casting-this is where a data type is converted to another so that an operation can be performed
        //implicit casting--this is automatically done for java, and it is for data types that are compatible eg
        // byte> short > int > long >float >double
        double result6= (double)2/ 2.3;

        //explicit casting--when data types are not compatible eg adding a string and integer
        //In this case we use wrapper classes of the primitive data types eg Integer.parseInt() to convert the string to integer
        String d= "1";
        int result7= Integer.parseInt(d) + 9;
        System.out.println(result7);

        System.out.println(location2);
      System.out.println(numViews);
        System.out.println(name);



        //Math class;
        //Math class has a couple of methods for manipulating numbers
        int result8= Math.max(5,15);
        System.out.println(result8);

        //formating numbers--putting numbers in a format we want eg currency format
        //some clases in Java are abstract,we cannot use the new keyword to create an instance of them eg NumberFormat;
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result10= currency.format(10023.345);

        //getting user input using the Scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your age ");
        Byte age =scanner.nextByte();
        System.out.println("You are " + age + " years old");






    }
}