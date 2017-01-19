package BaseClass;

/**
 * Created by Cavan on 2017/1/18.
 */
public class MainClass {
    public static void main(String args[]) {
        System.out.println("Hello, world!");

        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle.x +"\n"+ vehicle.y);
        vehicle.calculate();

        //求和
        int number = vehicle.getSum(10, 20, 30, 40, 50);
        System.out.println(number);

        //求最大公约数
        Operation operate = new Operation();
        int num = operate.getFDivision(12, 25);
        System.out.println("最大公约数:" + num);

        //求最小公倍数
        int lcmNum = operate.getLcmDivision(6, 8);
        System.out.println("最小公倍数:" + lcmNum);
    }
}
