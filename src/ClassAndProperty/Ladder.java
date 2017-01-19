package ClassAndProperty;

/**
 * Created by Cavan on 2017/1/19.
 */
public class Ladder {
    public double up;
    double height;//实例变量
    public static double dowm;//类变量
    public void setUp(double a) {
        up = a;
    }
    public void setDown(double b) {
        dowm = b;
    }
    double getUp() {
        return up;
    }
    public double getDowm() {
        return dowm;
    }
}
