import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            int unitCount = 1;
            int largest = Integer.MIN_VALUE;


            while (unitCount <= 10){
                System.out.print("Enter number of each units sold: ");
                int unitNumber= input.nextInt();
                unitCount += 1;
                if (unitNumber > largest){
                    largest = unitNumber;
                }
            }
        System.out.printf("Largest is: %d%n", largest);



    }
}
