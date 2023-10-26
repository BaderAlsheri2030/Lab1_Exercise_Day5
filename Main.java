import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        //1
        System.out.println("Input first number");
        int num1 = input.nextInt();
        System.out.println("Input second number");
        int num2 = input.nextInt();
        int sum = num1+num2;
        System.out.println(num1+" + "+num2+" ="+ sum);
        int sub = num1-num2;
        System.out.println(num1+" - "+num2+" ="+ sub);
        int multiply = num1*num2;
        System.out.println(num1+" * "+num2+" ="+ multiply);
        int div = num1/num2;
        System.out.println(num1+" / "+num2+" ="+div);
        int mod = num1%num2;
        System.out.println(num1+" % "+num2+" ="+ mod);
        //





        //2

        System.out.println("input a number");
        int number = input.nextInt();
        int mult = 0;
        for (int i = 1; i <=10 ; i++) {
           mult = number*i;
            System.out.println(number+" x "+i+" = "+mult);
        }


        //3

        System.out.println("Enter the radius");
        double r = input.nextDouble();
        double pi = 3.14159265358979323;
        double area = pi*(r*r);
        double perimeter = 2*(pi*r);
        System.out.println("Perimeter = "+perimeter);
        System.out.println("Area = "+area);


        //4
        System.out.println("Enter the count of numbers");
        int count = input.nextInt();
        double num;
        double sum1 = 0;
        for (int i = 1; i<=count ; i++){
            System.out.println("Enter an integer ");
            num = input.nextDouble();
            sum1 +=num;


        }
        System.out.println("The average is: "+sum1/count);





        //5

        System.out.println("Input the first number");
        int num11 = input.nextInt();
        System.out.println("Input the second number");
        int num22 = input.nextInt();
        System.out.println("Input the third number");
        int num33 = input.nextInt();
        int sumTwoNumbers = num11+num22;

        if (sumTwoNumbers == num33){
            System.out.println("The result is: true");

        }
        else  System.out.println("The result is: false");





        //6

        System.out.println("Input a word:");
        String word = input.next();
        StringBuilder str = new StringBuilder(word);
        System.out.println("Reverse word: "+str.reverse());




        //7

        System.out.println("Enter a number");
        int num4 = input.nextInt();


            if (num4%2 == 0) {
                System.out.println("The number is even");
            }
            else System.out.println("The number is odd");



        //8
        System.out.println("Enter the temperature in Centigrade");
        double cent = input.nextInt();
        double F = (cent*9/5)+32;
        System.out.println("Temperature in Fahrenheit is: "+F);



        //9
        String str1 = input.nextLine();
        System.out.println("Input a string");
        str1 = input.nextLine();
        System.out.println("Input a number");
        int num44 = input.nextInt();
        System.out.println(str1.charAt(num44));





        //10

        System.out.println("Enter width");
        float width = input.nextFloat();
        System.out.println("Enter height");
        float height = input.nextFloat();
        float area1 = width*height;
        float perimeter1 = 2*(width+height);
        System.out.println("Area is "+width+"*"+height+" = "+area1);
        System.out.println("Perimeter is 2*("+width+"+"+height+") = "+perimeter1);





        // 11

        System.out.println("Input first integer ");
        int firstNum  = input.nextInt();
        System.out.println("Input second integer ");
        int secondNum = input.nextInt();

            if (firstNum != secondNum) {
                System.out.println(firstNum + " != " + secondNum);
            }
            if (firstNum < secondNum) {

                System.out.println(firstNum + " < " + secondNum);
            }
            if (firstNum <= secondNum) {
                System.out.println(firstNum + " <= " + secondNum);
            }
            if (firstNum > secondNum) {
                System.out.println(firstNum + " > " + secondNum);
            }
            if (firstNum >= secondNum) {
                System.out.println(firstNum + " >= " + secondNum);
            }
            if (firstNum == secondNum){
                System.out.println(firstNum+" == "+secondNum);
            }

            //12

        System.out.println("Enter seconds");
            double sec = input.nextDouble();
            double hours = sec/3600;
            int tempH = (int) hours;
            double tempMin  = tempH-hours;
            double min = Math.abs(tempMin);
            int tempS1 = (int)min;
            double seconds = Math.abs(tempS1 -min);
            min *= 60;
            seconds *=60;

        System.out.println((int)hours+":"+(int)min+":"+(int)seconds);


        //13

        System.out.println("Input first number");
        int n1 = input.nextInt();
        System.out.println("Input second number");
        int n2 = input.nextInt();
        System.out.println("Input third number");
        int n3 = input.nextInt();
        System.out.println("Input fourth number");
        int n4 = input.nextInt();

        if (n1 ==n2 && n1==n3 && n1==n4){
            System.out.println("Numbers are equal ");

        }
        else System.out.println("Numbers are not equal");


        //14

        System.out.println("Enter a number");
        int n = input.nextInt();
        if (n == 0){
            System.out.println("Number is zero");
        }
        if (n >0){
            System.out.println("Number is positive");
        }
        if (n < 0){
            System.out.println("Number is Negative");
        }



        // 15

        System.out.println("Enter the count of numbers you want");
        int counter = input.nextInt();
        int n15;
        int positive1 = 0;
        int negative1 = 0;
        int zero = 0;
        int c2 = 1;
        System.out.println("Enter The numbers, -1 to exit");
        n15 =input.nextInt();
        while(n15 != -1 && c2 <= counter ) {

            if (n15 > 0) {
                positive1++;
            } else if ((n15 < 0) && (n15 != -1)) {
                negative1++;
            } else if (n15 == 0) {
                zero++;
            } else if (n15 == -1) {
                break;
            }
            System.out.println("Enter The numbers, -1 to exit");
            n15 = input.nextInt();
        }

            System.out.println(positive1+" Positives");
            System.out.println(zero+" zeros");
            System.out.println(negative1+" Negatives");



            //16

            System.out.println("Enter numbers");
            int num16 = input.nextInt();
            String s16 = Integer.toString(num16);
            StringBuilder str16 = new StringBuilder(s16);
            System.out.println(str16.reverse());




            //17

            System.out.println("Enter the count of numbers");
            int count17 = input.nextInt();
            int num17;
            int smallestNum = 0;
            int largestNum = 0;
            int i = 0;
            while ( i< count17){
            System.out.println("Enter the number: ");
            num17 = input.nextInt();
            ++i;
            if (num17 > largestNum){
                largestNum = num17;

            }
             if (num17 < smallestNum){
                smallestNum = num17;


            }

        }
        System.out.println("The largest number = "+largestNum);
        System.out.println("The smallest number = "+smallestNum);




        //18
        String str18 = input.nextLine();
        System.out.println("Enter a string");
        str18 = input.nextLine();

        int count18 = 0;
        for (int j = 0; j < str18.length()-1 ; j++) {
            if (str18.contains("a") && 'a' == str18.charAt(j)){
                    count18++;
            }
        }

        System.out.println("The number of a's "+count18);














    }
}
