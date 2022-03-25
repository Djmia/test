import java.util.Scanner;
class H_W_7_Odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number and check Even or Odd: ");
        int myNum = input.nextInt();
        myNum = myNum % 2;

        if (myNum > 0) {
            System.out.println("The number is: Odd (нечетно)");
        } else {
            System.out.println("Even (четно)");
        }

    }
}