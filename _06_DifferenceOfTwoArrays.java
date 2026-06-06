import java.util.Scanner;

public class _06_DifferenceOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for(int i = 0; i<arr1.length; i++){
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for(int i = 0; i<arr2.length; i++){
            arr2[i] = sc.nextInt();
        }
        int[] diff = new int[n1]; // n1 is greater than n2
        int borrow = 0;
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = diff.length - 1;
        while(k>=0){
            int d = borrow;
            if(i>=0){
                d += arr1[i];
            }
            if(j>=0){
                d -= arr2[j];
            }
            if(d<0){
                d += 10;
                borrow = -1; // next iteration ke liye borrow nikala
            } else {
                borrow = 0;
            }
            diff[k] = d; //diff ke k index par d store kar diya
            i--; // hum right se left me subtract kar rahe hai
            j--;
            k--;
        }
        for(int val : diff){
            System.out.print(val);
        }
    }
}
