import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.println("Please enter your weight : ");

        Scanner scanner = new Scanner(System.in);

        double weight;
        double heigh;

        weight = scanner.nextDouble();

        System.out.println("Enter your heigh : ");

        heigh = scanner.nextDouble();


        System.out.println("Your weight is : " + weight + " kg");
        System.out.println("Yout heigh is : " + heigh + " cm");

        double bmiCalculator = (weight / ((heigh / 100) * (heigh / 100)));

        System.out.println("Your BMI is : " + bmiCalculator);

        if(bmiCalculator < 18.5 ){
            System.out.println("Underweight");
        }
        if(bmiCalculator >= 18.6 && bmiCalculator <= 24.9){
            System.out.println("Correct weight");
        }
        if(bmiCalculator >= 25 && bmiCalculator <= 29.9){
            System.out.println("Overweight");
        }
        if(bmiCalculator > 30.0){
            System.out.println("Obesity");
        }


    }




}
