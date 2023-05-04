/*
Question : Given an array of n integers and a target value x. Print whether x exists in the array or not.
__________________________________________________________________________________________________________
Constraints : 0 <= n <= 10^8, -10^8 <= x <=a[i] <= 10^8
___________________________________________________________
I/O = n = 8, x = 14, array = [4,12,54,14,3,8,6,1]
O/P = Yes
_____________________________________________________
I/O = n = 1, x = 9, array = [2]
O/P = No
_____________________________________
Linear Search :
 */
import java.util.Scanner;
public class Main {
    static boolean FindTargetValue(int[] array,int target,int index){
        if (index >= array.length) return false ;
        if (array[index] == target) return true;
        return FindTargetValue(array,target,index + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int initialization,Array,FindingNumber,index = 0;
        System.out.println("Enter the length of array :");
        Array = sc.nextInt();
        int[] array = new int[Array];
        System.out.println("Enter the element of array :");
        for (initialization = 0; initialization < array.length; initialization++){
            array[initialization] = sc.nextInt();
        }
        System.out.println("Enter the element you want find in array :");
        FindingNumber = sc.nextInt();
        System.out.println("Printing the result without using recursion :");
        for (initialization = 0; initialization < array.length; initialization++){
            if (FindingNumber == array[initialization]){
                System.out.println("Yes");
                break;
            }
        }
        if (initialization == Array){
            System.out.println("No");
        }

        System.out.println("Printing the result by help of recursion :");
        if (FindTargetValue(array,FindingNumber,index)){
            System.out.println("Yes");
        }else
            System.out.println("No");
    }
}