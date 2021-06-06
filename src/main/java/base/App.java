package base;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //instances
        App myApp = new App();
        BMI myBMI = new BMI();

        //input
        myApp.input(myBMI);

        //calculate bmi
        myBMI.calcBMI();

        //output
        myApp.output(myBMI);
    }

    public void input(BMI bmi)
    {
        //height
        System.out.print("What is your height in inches? ");
        bmi.setHeight(input.nextInt());

        //weight
        System.out.print("What is your weight in pounds? ");
        bmi.setWeight(input.nextInt());
    }

    public void output(BMI bmi)
    {
        DecimalFormat df = new DecimalFormat("0.0");
        StringBuilder b = new StringBuilder("Your BMI is " + df.format(bmi.bmi) +".\n");
        if(bmi.getBmi() < 25 && bmi.getBmi() > 18.5)
            b.append("You are within the ideal weight range.");//normal weight
        else
        {
            //nested loop
            if (bmi.getBmi() <=18.5)
                b.append("You are underweight. You should see your doctor.");

            else
                b.append("You are overweight. You should see your doctor.");
        }
        System.out.println(b);
    }
}
