package Lesson04;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab_4 {
    public static void main(String[] args) {
        boolean isContinuing = true;
        ArrayList<Integer> arrayListInt= new ArrayList<>();
        while (isContinuing){
            System.out.println("==========MENU=======");
            System.out.println("1. Add number into list");
            System.out.println("2. Print numbers");
            System.out.println("3. Get maximum number");
            System.out.println("4. Get minimum number");
            System.out.println("0. Exit");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Option number, please: ");
            int userInput = scanner.nextInt();
            if (userInput == 0) {
                isContinuing = false;
            } else{
                switch (userInput) {
                    case 1:
                        System.out.println("Adding numbers, please!");

                        int userValue = scanner.nextInt();
                        arrayListInt.add(userValue);
                        break;
                    case 2:
                        System.out.println("Print numbers");
                      //  for (Integer value : arrayListInt) {
                        //    System.out.println(value);
                       // }
                        for (int i = 0; i < arrayListInt.size(); i++) {
                            System.out.println(arrayListInt.get(i) + " ");
                        }
                        break;
                    case 3:
                        System.out.println("Get maximum number");
                        int maxNumber = arrayListInt.get(0);
                        for (int i = 0; i < arrayListInt.size(); i++) {
                            if (arrayListInt.get(i) > maxNumber) {
                                maxNumber = arrayListInt.get(i);
                            }
                        }
                        System.out.println("maxNumber: " + maxNumber);
                        break;
                    case 4:
                        int minNumber = arrayListInt.get(0);
                        for (int i = 0; i < arrayListInt.size(); i++) {
                            if (arrayListInt.get(i) < minNumber) {
                                minNumber = arrayListInt.get(0);
                            }
                        }
                        System.out.println("minNumber: " + minNumber);
                        break;
                        default:
                                System.out.println("Wrong option!");
                }
            }
        }
    }
}
