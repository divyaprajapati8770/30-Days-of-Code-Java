import java.util.ArrayList;
import java.util.List;

public class _05_AddToArrayForm {

    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int carry = 0;
        int i = num.length - 1;

        while(i >= 0 || k > 0 || carry > 0) {
            int sum = carry;

            if(i >= 0) {
                sum += num[i];
                i--;
            }

            sum += k % 10;
            k /= 10;

            carry = sum / 10;
            int digit = sum % 10;

            ans.add(0, digit);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 0, 0};
        int k = 34;

        System.out.println(new _05_AddToArrayForm().addToArrayForm(num, k));
    }
}