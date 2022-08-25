package base;

import java.util.Scanner;

public class MyMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" please enter two numbers " );

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        MyMain myMain = new MyMain();

        try{
         int sum =  myMain.addition(num1,num2);
            System.out.println("sum = " + sum);
        }catch (MyFirstExcepion e){
            System.out.println("e = " + e);
        }

    }

    public int addition(int num1,int num2) throws MyFirstExcepion{

        int sum = num1 + num2;
        if (sum < 150){
            throw new MyFirstExcepion("Custom Exception Occured");
        }

        return sum;
    }
}
