package BaseClass;

/**
 * Created by Cavan on 2017/1/18.
 */
//类的声明
public class Vehicle {
    double speed;
    int power;
    void speedUp(int s) {
        speed += s;
    }
    void speedDown(int d) {
        speed -= d;
    }
    void setPower(int p) {
        power = p;
    }
    int getPower() {
        return power;
    }
    double getSpeed() {
        return speed;
    }

    int x = 10, y;
    //如果成员变量和局部变量的名字相同, 则局部变量的被隐藏, 若想使用被隐藏的关键字, 使用this关键字
    void calculate(){
        int x = 20;
        y = 2 * this.x;
        System.out.println(x + " " + y);
    }

    //计算和
    //多个参数, 用..., 第几个参数用x[参数的位置]
    int getSum(int...x) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return sum;
    }
}


