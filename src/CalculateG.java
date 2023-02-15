import java.util.Scanner;

class calculateG {
   public static double firstDigit;
    public static double secondDigit;
    public static double value;
    public static double firstNumber;
    public static double secondNumber;
    public static double multiplicationResult=multiplication();
    public static double squareResult=square();
    public static double summationResult=summation();



    public static double multiplication(){

        Scanner multiplicationInput=new Scanner(System.in);
        System.out.println("Enter the First Digit:");
        firstDigit =multiplicationInput.nextDouble();
        System.out.println("Enter the Second Digit:");
        secondDigit=multiplicationInput.nextDouble();
        return  firstDigit*secondDigit;
    }
    // method for square

    public static double square(){

        Scanner squareInput=new Scanner(System.in);
        System.out.println("Enter the Value:");
        value =squareInput.nextDouble();
        return Math.pow(value,2);
    }

    public static double summation(){
        Scanner summationInput=new Scanner(System.in);
        System.out.println("Enter the First Number:");
        firstNumber =summationInput.nextDouble();
        System.out.println("Enter the Second Number:");
        secondNumber=summationInput.nextDouble();
        return firstNumber+secondNumber;

    }
    public static double outline(String message,double result) {
        System.out.println(message + "" + result);
        return result;
    }

    public static void main(String[] arguments){
        double gravity =-9.81; // Earth's gravity in m/s^2
        int fallingTime = 30;
        double initialVelocity = 0.0;
        double finalVelocity ;
        double initialPosition = 0.0;
        double finalPosition ;
/*
a = gravity
t = fallingTime (in seconds)
v = finalVelocity
x = finalPosition
vi=initialVelocity
xi=initialPosition
𝑥(𝑡) = 0.5 ∗𝑎𝑡2 + 𝑣𝑖𝑡 + 𝑥𝑖
𝑣(𝑡) = 𝑎𝑡 + 𝑣𝑖
 */
        // Add the formulas for position and velocity
//finalPosition(fallingTime)=(0.5*gravity*(fallingTime*fallingTime))+initialVelocity*fallingTime+initialPosition
        finalPosition=((0.5*gravity*Math.pow(fallingTime,2))+initialVelocity*fallingTime+initialPosition)/fallingTime;
//finalVelocity(fallingTime)=gravity*fallingTime+initialVelocity
        finalVelocity=(gravity*fallingTime+initialVelocity)/fallingTime;


        System.out.println("The object's position after " + fallingTime + " seconds is "+ finalPosition +  "m.");
// Add output line for velocity (similar to position)
        System.out.println("The object's velocity after "+fallingTime+ "seconds is "+ finalVelocity +"m/s.");


        outline("Multiplication: ", multiplicationResult);
        outline("Summation: ", summationResult);
        outline("Square: ", squareResult);

    }
}
