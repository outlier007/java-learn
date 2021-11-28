

/*
 *项目名: ObjectOriented
 *文件名: Person
 *创建者: LMC
 *创建时间:2021/11/28 9:44
 *描述:
 */

public class Person {

    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    //重写equals方法
    @Override
    public boolean equals(Object object) {
        //如果是同一个对象直接返回true
        if(this==object) {
            return true;
        }
        Person obj=(Person)object;
        if(this.name.equals(obj.name)&&this.age==obj.age&&this.gender==obj.gender) {
            return true;
        }
        return false;
    }
}
