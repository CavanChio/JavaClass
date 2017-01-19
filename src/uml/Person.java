package uml;
import baseclass.Operation;
/**
 * Created by Cavan on 2017/1/19.
 */
public class Person {
    Teacher teacher;
    String name;
    String gender;
    int age;
    float height;
    int number;
    Student stu = new Student();
    Person person = new Person();
    void hello() {
        Operation operates = new Operation();
        operates.getLcmDivision(10,20);
    }

}
