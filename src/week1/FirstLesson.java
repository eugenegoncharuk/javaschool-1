package week1;
import java.util.Scanner;

public class FirstLesson {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your cm number to convert: ");
        double mynumber = scanner.nextDouble();
        System.out.println("converted inch : " + mynumber*2.54);

        /*
        comments: You may write it slightly simplier, like the following in one line:
        System.out.println(mynumber + (mynumber % 2 == 0 ? " is even" : "not even"));
        */
        if (mynumber % 2 == 0)
        {
            System.out.println(mynumber + " is even");
        } else  {
            if (mynumber % 2 !=0) {

                System.out.println(mynumber + " not even");
            } else
                System.out.println("something else");

        }
        
        /*
        that's only getting a power by 1/3, but you need to check whether this nunmer is cubic:
           read here: A cubic number is a figurate number of the form n^3 with n a positive integer. The first few are 1, 8, 27, 64, 125, 216, 343,
        */
        
        double pow=3;
        System.out.println("3x " + Math.pow(mynumber, 1 / pow));
        //System.out.println("Enter number to convert");
        //String input = System.console().readLine();
        //    String name;
        /*    if (args.length==0) {
                name="World";
            } else  {
                name=args[0];
            }
            System.out.printf("Hello, %s!\n", name);*/


    }
}
