

/*
 *项目名: ObjectOriented
 *文件名: Worker
 *创建者: LMC
 *创建时间:2021/11/27 17:19
 *描述:普通员工
 */

public class Worker extends Employee {

    public Worker(String name, double monthlySalary) {
        super(name, monthlySalary);
    }

    public void work() {
        System.out.println("普通员工 "+super.getName() +"正在工作！！");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
