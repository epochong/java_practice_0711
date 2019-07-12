import java.util.Scanner;

import static java.lang.Math.pow;

/**
 * @author epochong
 * @date 2019/7/11 17:59
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class 二的个数 {
    public static int SmallerThan2(int num,int index)
    {
        int res = (int) (num / pow(10, index + 1));
        res= (int) (res*pow(10, index));
        return res;
    }

    public static int BiggererThan2(int num, int index)
    {
        int res = (int) (num / pow(10, index + 1) + 1);
        res= (int) (res*pow(10, index));
        return res;
    }

    public static int Equal2(int num, int index)
    {
        int res = (int) (num / pow(10, index + 1));
        res = (int) (res*pow(10, index));
        int tmp = (int) (num / pow(10, index ));
        tmp = (int) (num - tmp*pow(10, index )+1);

        return res+tmp;
    }

    public static int NumberOf2InRange(int num)
    {
        if (num < 2) {
            return 0;
        }
        int count = 0;
        for (int index = 0, cur = num; cur > 0; index++, cur /= 10)
        {
            int temp = (int) pow(10, index + 1);
            int n = (num - num / temp*temp) / (temp / 10);//num第index位的数字为n
            if (n < 2)
            {
                count += SmallerThan2(num, index);
            }
            else if (n > 2)
            {
                count += BiggererThan2(num, index);
            }
            else
            {
                count += Equal2(num, index);
            }

        }
        return count;
    }
    public static int count(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 10 == 2) {
                count++;
            }
            n /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    /*    while (input.hasNextInt()) {
            int n = input.nextInt();
            int count = 0;
            for (int i = 0; i < n; i++) {
                count += count(i);
            }
            System.out.println(count);
        }*/
        System.out.println(NumberOf2InRange(2147483647));
    }


}
