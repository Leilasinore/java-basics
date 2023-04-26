import java.awt.*;
import java.text.NumberFormat;
import java.util.Scanner;

 interface Animal{
    //All methods within an interface class have to be empty, ie without a body
      public void animalSound();
     public void feeding();

}
class Cow implements Animal{
    //The subclass in this case class Cow has to override all the methods from its parent class animal
     public void  animalSound(){
        System.out.println("a cow mows mows");
    }
    public void feeding(){
        System.out.println("a cow eats grass");
    }
}

class Human{
    private int age;
    private String name;

    public void setAge(int a){
        age=a;
    }
    public void setName(String n){
        name=n;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

}

class Calculator {
    public int add(int number1, int number2){
        System.out.println("We are adding numbers");
        int r =number1 + number2;
        System.out.println(r);
        return r;
    }
    public int sub(int number3, int number4){
        System.out.println("We are subtracting numbers");
        int r2=number3-number4;
        System.out.println(r2);
        return r2;
    }
}

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

        //task
        //building a mortgage calculator
//        Scanner principalInput= new Scanner(System.in);
//        System.out.print("Principal : ");
//        double principal=principalInput.nextDouble();


//        //get annual interest rate from user
//        Scanner interestRateInput=new Scanner(System.in);
//        System.out.print("Annual Interest Rate : ");
//        double interest=interestRateInput.nextDouble();
//        //get period in years
//        Scanner period=new Scanner(System.in);
//        System.out.println("Period : ");
//        double periodInYears=period.nextDouble();

//        //convert interest rate to monthly
//        double monthlyRate= interest/1200;
//        double numberOfPayments= periodInYears *12 ;
////        double result1cal= (1+monthlyRate);
//        double mortgage= ((Math.pow((1+monthlyRate),numberOfPayments) *monthlyRate)/((Math.pow((1+monthlyRate),numberOfPayments))-1))*principal;


//        //format output
//        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
//        System.out.println(mortgageFormatted);

        //conditional statements:if statements
        int temperature=32;

        if (temperature==32){
            System.out.println("It is a hot day drink plenty of water");
        } else if (temperature<32) {
            System.out.println("It is a cold day please keep warm");
        } else System.out.println("it is a lukwarm day");

        //ternary operator
        int income = 100_000;
        String className= income > 10_000 ? "first": "Economy";
        System.out.println(className);

        //switch statements
        String role ="admin";
        switch (role){
            case "admin":
                System.out.println("you are an admin");
                int num5=456;
                break;
            case "moderator":
                System.out.println("you are a moderator");
                break;
            default:
                System.out.println("you are a guest");
        }


        //FizzBuzz Exercise
//        Scanner randomInput = new Scanner(System.in);
//        int userInput=randomInput.nextByte();
//        int modResult= userInput % 5;
//        int modResult2= userInput % 3;
//
//        if (modResult2==0 && modResult==0) {
//            System.out.println("FizzBuzz");
//        }
//        else if(modResult==0){
//            System.out.println("Fizz");
//        }
//        else if (modResult2==0) {
//            System.out.println("Buzz");
//        }
//        else System.out.println(userInput);
//
//        //loops;for loop
//        for(int i=0;i<5;i++){
//            System.out.println("You are on number" + i);
//        }
//        //while loop
//       int j=0;
//        while(j<5){
//            System.out.println("Number" + j);
//            j++;
//        }
//        //for each loop...used to iterate over an array of items
//        String [] names= {"Leila","Sinore","Wuantai"};
//        for ( String k : names)
//            System.out.println(k);

        //improved mortgage calculator with user input validation features
//        Scanner scanner5= new Scanner(System.in);
//        System.out.print("Principal : ");
//        double principal=scanner5.nextDouble();
//        while(principal>1000 && principal< 1000000){
//            System.out.print("Interest Rate : ");
//            float interestRate=scanner5.nextFloat();
//            while(interestRate>0 && interestRate<30){
//                System.out.print("Period: ");
//                int loanPeriod=scanner5.nextInt();
//                while(loanPeriod>0&& loanPeriod<=30){
//                    //convert interest rate to monthly
//                    double monthlyRate= interestRate/1200;
//                    double numberOfPayments= loanPeriod *12 ;
//                    double mortgage= ((Math.pow((1+monthlyRate),numberOfPayments) *monthlyRate)/((Math.pow((1+monthlyRate),numberOfPayments))-1))*principal;
//                    //format output
//                    String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
//                    System.out.println(mortgageFormatted);
//                    if(mortgage!=0){
//                        System.out.println("That is your mortgage");
//                        break;
//                    }
//
//                }
//                System.out.println("Enter number between 1 and 30");
//            }
//            System.out.println("Enter a number between 0 and 30");
//        }
//
//        System.out.println("Enter a number between 1,000 and 1000000");
//        Calculator calc= new Calculator();
//        int resultanwer= calc.add(2,3);
//
//        Demoagain obj =new Demoagain();
//        public void Demoagain(){
//            Calculator calc =new Calculator();
//            int resultofadd=calc.add(7,8);
//            System.out.println(resultofadd);
//
//            int resultofsub=calc.sub(12,6);
//            System.out.println(resultofadd +" "+ resultofsub);
//
//            public int add(int number1, int number2){
//                System.out.println("We are adding numbers");
//                int r =number1 + number2;
//                System.out.println(r);
//                return r;
//            }
//        Demoagain addupagain =new Demoagain();
//        addupagain.addnum(28,32);
//
//
        Demoagaincalc obj2=new Demoagaincalc();
        obj2.divideagain(20,10);
        obj2.multiplyagain(20,4);
        obj2.addnum(28,32);
        obj2.subnum(80,10);

        Human obj3= new Human();
        obj3.setAge(22);
        obj3.setName("Entito");
        System.out.println(obj3.getAge()+ " " + obj3.getName());

        Car newcar= new Car();
        newcar.drive();

        Cow myCow =new Cow();
        myCow.feeding();
        myCow.animalSound();


  }
}