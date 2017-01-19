package BaseClass;

/**
 * Created by Cavan on 2017/1/18.
 */
public class Operation {
    //加法
    int getSum(int m, int n) {
        return m + n;
    }

    //减法
    int getSubtraction(int m, int n) {
        return m - n;
    }

    //乘法
    int getMultiplication(int m, int n) {
        return m * n;
    }

    //除法
    int getDivision(int m, int n) {
        return m / n;
    }

    //最大公约数
    int getFDivision(int m, int n) {
        if (m < n) {
            int c = m;
            m = n;
            n = c;
        }
        int r = m % n;
        while (r != 0) {
            m = n;
            n = r;
            r = m % n;
        }
        return n;
    }

    //最小公倍数
    int getLcmDivision(int m, int n) {
        int number = getFDivision(m, n);
        int num = m * n / number;
        return num;
    }

}