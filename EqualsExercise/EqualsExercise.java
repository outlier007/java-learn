

/*
 *项目名: ObjectOriented
 *文件名: EqualsExercise
 *创建者: LMC
 *创建时间:2021/11/28 9:43
 *描述:
 判断两个 Person 对象的内容是否相等，如果两个 Person 对象的各个属性值都一样，则返回 true，反之 false。
 */

public class EqualsExercise {
    public static void main(String[] args) {
        Person person1 = new Person("jack",23,'男');
        Person person2 = new Person("jack",23,'男');

        System.out.println(person1==person2);//比较的是对象的地址
        System.out.println(person1.equals(person2));//没有重写equals方法比较的是地址，重写后比较对象的属性
    }
}
