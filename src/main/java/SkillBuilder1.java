import java.util.Scanner;

/**
 * Skill Builder 0
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("You're Jane's friend!");
        System.out.println("\"What's your name?\"");
        String name = input.nextLine();
        System.out.println("Enter a floating-point number:");
        double spice = input.nextDouble();
        double x = 4.0/3;
        double y=Math.pow(2,Math.sqrt(5)/Math.pow(spice,3));
        double exp = x*y;


        System.out.println("Well "+ name +", the spice value resulted in "+ exp);
        exp = Math.round(exp*100);
        exp = exp /100;
        System.out.println("And the converted value is "+ exp);





    }

    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);

        // define our named constants
        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        double wallHeight = input.nextDouble();
        System.out.println(wallHeight);

        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        double wallWidth = input.nextDouble();
        System.out.println(wallWidth);


        double paint=350;
        double wallArea=(wallHeight*wallWidth);
        System.out.println("Wall area: "+wallArea+" square feet");
        double paintNeeded=(wallArea/paint);
        System.out.printf("Paint needed: %.2f gallons\n", paintNeeded);



        System.out.println("Cans needed: "+(int)Math.ceil(paintNeeded) + "can(s)");

    }
}
