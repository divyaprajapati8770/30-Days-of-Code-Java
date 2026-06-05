import java.util.Scanner;
public class _04_SumOfTwoArrays {
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
    int[] sum = new int[n1 > n2 ? n1 : n2]; //agar n1 n2 se bada hai to n1 milega warna n2 mil jayega
    int carry = 0;
    int i = arr1.length - 1;
    int j = arr2.length - 1;
    int k = sum.length - 1;
    while(k>=0){
        int d = carry;
        if(i>=0){
            d += arr1[i];
        }
        if(j>=0){
            d += arr2[j];
        }
        carry = d/10; // next iteration ke liye carry nikali
        d = d%10; //d me 1 digit bachi hai aur baaki carry me gayi
        sum[k] = d; //sum ke k index par d store kar diya
        i--; // hum right se left me add kar rahe hai
        j--;
        k--;
    }
    if(carry != 0){
        System.out.println(carry);
    }
    for(int val : sum){ // ye humko index nhi dega seedha value dega 
        System.out.print(val);
    }
}

}