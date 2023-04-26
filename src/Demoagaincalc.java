public class Demoagaincalc extends Demoeasycalc{
//    public void Demoagain(){
//        Calculator calc =new Calculator();
//        int resultofadd=calc.add(7,8);
//        System.out.println(resultofadd);
//
//        int resultofsub=calc.sub(12,6);
//        System.out.println(resultofadd +" "+ resultofsub);
//
//        public int add(int number1, int number2){
//            System.out.println("We are adding numbers");
//            int r =number1 + number2;
//            System.out.println(r);
//            return r;
//        }
//        public int sub(int number3, int number4){
//            System.out.println("We are subtracting numbers");
//            int r2=number3-number4;
//            System.out.println(r2);
//            return r2;
//        }


    //let this be the advanced calculator that inherits or rather extends the functionality of the demo simple calculator
    //and also has more functionality of its own like multiply and divide

public int multiplyagain(int a,int b){
    int resultofmult= a * b;
    System.out.println(resultofmult);
    return resultofmult;
}
public int divideagain(int a,int b){
    int resultofdiv= a/b;
    System.out.println(resultofdiv);
    return resultofdiv;
}



}
