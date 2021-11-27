

/*
 *项目名: ObjectOriented
 *文件名: Manager
 *创建者: LMC
 *创建时间:2021/11/27 17:18
 *描述:经理
 */

public class Manager extends Employee {

    private double bonus;//奖金

    public Manager(String name, double monthlySalary, double bonus) {
        super(name, monthlySalary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void manager() {
        System.out.println("经理 "+super.getName()+" 正在管理员工！");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual()+this.bonus;
    }
}
