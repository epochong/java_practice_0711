import java.util.Scanner;

/**
 * @author epochong
 * @date 2019/7/11 17:11
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class 在霍格沃茨找零钱 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            String p = input.next();
            String a = input.next();
            String[] feeStrings = p.split("\\.");
            String[] payStrings = a.split("\\.");
            int fee1 = Integer.valueOf(feeStrings[0]) * 29 * 17;
            int fee2 = Integer.valueOf(feeStrings[1]) * 29;
            int fee3 = Integer.valueOf(feeStrings[2]);
            int fee = fee1 + fee2 + fee3;
            int pay1 = Integer.valueOf(payStrings[0]) * 29 * 17;
            int pay2 = Integer.valueOf(payStrings[1]) * 29;
            int pay3 = Integer.valueOf(payStrings[2]);
            int pay = pay1 + pay2 + pay3;
            int changes = pay - fee;
            int res1 = changes / (29 * 17);
            int res2 = (changes - res1 *(29 * 17)) / 29;
            int res3 = changes - res1 * (29 * 17) - res2 * 29;
            if (changes < 0) {
                System.out.println("-" + res1 + "." + res2 + "." + res3);

            } else {
                System.out.println(res1 + "." + res2 + "." + res3);

            }
        }
    }
}
