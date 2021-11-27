

/*
 *项目名: ObjectOriented
 *文件名: PolyParameter
 *创建者: LMC
 *创建时间:2021/11/27 17:15
 *描述:
 定义员工类Employee，包含姓名和月工资[private]，以及计算年工资getAnnual的方法。
 普通员工和经理继承了员工,经理类多了奖金bonus属性和管理manage方法，普通员工类多了work方法，
 普通员工和经理类要求分别重写getAnnual方法
 测试类中添加一个方法showEmpAnnual(Employee e)，实现获取任何员工对象的年工资,并在main方法中调用该方法[e.getAnnual0]
 测试类中添加一个方法，testWork,如果是普通员工，则调用work方法，如果是经理,则调用manage方法1

 */

public class PolyParameter {

    public static void main(String[] args) {

        PolyParameter polyParameter = new PolyParameter();

        Worker worker1 = new Worker("张三", 3500);
        polyParameter.showEmpAnnual(worker1);
        polyParameter.testWork(worker1);

        Manager manager1 = new Manager("罗老师",30000,20000);
       polyParameter.showEmpAnnual(manager1);
       polyParameter.testWork(manager1);

    }

    //获取员工年薪
    public  void showEmpAnnual(Employee e) {
        System.out.println(e.getName()+" 的年薪 "+e.getAnnual());
    }


    public void testWork(Employee e) {
        if(e instanceof Worker) {
            ((Worker) e).work();//向下转型
        }else if(e instanceof Manager) {
            ((Manager)e).manager();
        }else {
            System.out.println("不做处理！");
        }
    }
}
