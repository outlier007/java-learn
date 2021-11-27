

/*
 *项目名: ObjectOriented
 *文件名: Employee
 *创建者: LMC
 *创建时间:2021/11/27 17:17
 *描述:员工
 */

public class Employee {

    private String name;//名字
    private double monthlySalary;//月薪

    public Employee(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    //计算年薪
    public double getAnnual() {
        return this.monthlySalary*12;
    }
}
