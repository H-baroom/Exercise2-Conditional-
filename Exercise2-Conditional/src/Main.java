import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner input = new Scanner(System.in);

        /*
1.Write a program that checks the role of the user
If the role is admin print "welcome admin"
If the role is superuser print "welcome superuser"
If the role is user print "welcome user" (tip:
use if else)
         */
        System.out.println("please enter your role : ");
        String role = input.nextLine();
        if(role.equalsIgnoreCase("admin")){
            System.out.println("welcome admin");
        }else if(role.equalsIgnoreCase("superuser")){
            System.out.println("welcome superuser");
        }else{
            System.out.println("welcome user");
        }
        /*
2.Take three numbers from the user and print the greatest number. Test Data
Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87
Expected Output : The
greatest: 87
         */
        System.out.println("please enter the 1st number : ");
        int number1 = input.nextInt();
        System.out.println("please enter the 2nd number : ");
        int number2 = input.nextInt();
        System.out.println("please enter the 3rd number : ");
        int number3 = input.nextInt();

        if(number1 > number2 && number1 > number3){
            System.out.println("the first number is the greatest number : "+ number1);
        }else if (number2 > number1 && number2 > number3){
            System.out.println("the second number is the greatest number : "+ number2);
        }else{
            System.out.println("the third number is the greatest number : "+ number3);
        }
        /*
3.Write a Java program that generates an integer between 1 and 7
and displays the name of the weekday.
Test Data
number: 4
Expected Output:
Wednesday
         */
        Random rand = new Random();
        int random_number = rand.nextInt(7)+1;
        switch (random_number) {
            case 1:
                System.out.println("The number is : " + random_number + "\nThe day is Saturday");
                break;
            case 2:
                System.out.println("The number is : " + random_number + "\nThe day is Sunday");
                break;
            case 3:
                System.out.println("The number is : " + random_number + "\nThe day is Monday");
                break;
            case 4:
                System.out.println("The number is : " + random_number + "\nThe day is Tuesday");
                break;
            case 5:
                System.out.println("The number is : " + random_number + "\nThe day is Wednesday");
                break;
            case 6:
                System.out.println("The number is : " + random_number + "\nThe day is Thursday");
                break;
            default:
                System.out.println("The number is : " + random_number + "\nThe day is Friday");
                break;
        }

                /*
4. Write a program that takes a numeric score as input and prints
the corresponding letter grade using the following grading scale:
A: 90-100
B: 80-89
C: 70-79
D: 60-69 F:
0-59
Enter your numeric score: 85
Numeric Score: 85
Letter Grade: B
                 */
        System.out.println("Please enter your score : ");
        int score = input.nextInt();
        if (score >= 90 && score <= 100){
            System.out.println("Numeric Score : "+score+"\nLetter Grade : A");
        } else if (score >= 80 && score < 90) {
            System.out.println("Numeric Score : "+score+"\nLetter Grade : B");
        } else if (score >= 70 && score < 80) {
            System.out.println("Numeric Score : "+score+"\nLetter Grade : C");
        } else if (score >= 60 && score < 70) {
            System.out.println("Numeric Score : "+score+"\nLetter Grade : D");
        } else if (score >= 0 && score < 60) {
            System.out.println("Numeric Score : "+score+"\nLetter Grade : F");
        }else {
            System.out.println("Please write valid score (0-100)");
        }
/*
5. Write a Java program that takes a person's age as input and
categorizes them into one of three age categories: "Child,"
"Teenager," or "Adult" using an if statement.
use an if statement to categorize the age based on the following criteria:
• If the age is less than 13, categorize them as a "Child."
• If the age is between 13 and 19 (inclusive), categorize them as a
"Teenager."
• If the age is 20 or older, categorize them as an "Adult."
Sample Output:
Enter your age: 25
You are an Adult.
 */
        System.out.println("Please enter your age : ");
        int age = input.nextInt();
        if (age >=20 ){
            System.out.println("You are an Adult.");
        } else if (age >=13 && age <= 19) {
            System.out.println("You are an Teenager.");
        } else if (age <13 && age >=0) {
            System.out.println("You are an Child.");
        }else{
            System.out.println("Please enter valid age");
        }
    }
}