import java.util.Scanner;

public class SalaryFrequencies {
    static Scanner scanner = new Scanner(System.in);
    static int[] array = {42, 56, 34, 27, 72, 12, 98, 85, 33, 67};

    static int minValue = 0;
    static int maxValue = 0;
    static int sum = 0;

    public static int search(int [] arr, int key){

        for (int i = 0; i < array.length; i++){
            if(key == array[i]){
                return i;
            }
        }

     return 0;
    }

    public static void main(String[] args) {
        System.out.println("The contents of the mumbers array (using a for loop):");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        System.out.println("\n\nThe contents of the mumbers array (using an enhanced for loop):");
        for(int num : array){
            System.out.print(num + " ");
        }

        for (int i = 0; i < array.length; i++){
            if(maxValue < array[i]){
                maxValue = array[i];
            }

            if(minValue == 0 && i==0){
                minValue = array[0];
            }else {
                if(minValue > array[i]){
                    minValue = array[i];
                }
            }

            sum += array[i];
        }

        System.out.println("\n\nThe total of the array is " + sum);
        System.out.println("The minimum of the array is " + minValue);
        System.out.println("The maximum of the array is "+ maxValue);


        System.out.print("\nEnter the value you wish to search for: ");
        int key = scanner.nextInt();
        int index = search(array,key);

        if(index  != 0){
            System.out.printf("\nThe number %d is found at index %d", key,index);
        }else{
            System.out.println("This value dose not exsit!");
        }
    }
}
