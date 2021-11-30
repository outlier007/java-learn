package com.lmclearn.smallchange.opp;

/*
 *项目名: SmallChange
 *文件名: SmallChangeOpp
 *创建者: LMC
 *创建时间:2021/11/29 22:05
 *描述:
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSysOpp {
    boolean loop=true;//用于判断是否退出系统

    Scanner scanner = new Scanner(System.in);

    //零钱明细
    //1、可以保存到数组 2、使用对象 3、String拼接
    String details="----------零钱明细----------";


    //收益入账
    double money=0;//每次入账的钱
    double balance=0;//余额
    Date date=null;//时间
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HH:mm");//时间格式转换


    //消费支出
    String note=null;//消费原因

    //退出
    String isexit="";//退出选择

    public void mainMenu() {
        //显示菜单
        do {
            System.out.println("\n----------零钱通系统(oop)----------");
            System.out.println("\t\t\t1 零钱明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费支出");
            System.out.println("\t\t\t4 退出系统");
            System.out.print("请选择(1~4):");
            int choice =scanner.nextInt();//菜单选择

            switch(choice){
                case 1:
                    this.detail();
                    break;
                case 2:
                    this.income();
                    break;
                case 3:
                    this.pay();
                    break;
                case 4:
                    this.exit();
                    break;
                default:
                    System.out.println("你的选着有误！！！请重新选择:");
            }
        }while (loop);

    }


    //零钱明细
    public void detail() {
        System.out.println(details);
    }

    //收益入账
    public void income() {
        System.out.println("收益入账金额:");
        money=scanner.nextDouble();
        //money值校验
        if(money<=0) {
            System.out.println("收入金额不能为负值！");
            return;
        }
        balance+=money;//余额增加
        date=new Date();//获取入账时间
        details+="\n收益入账:"+money+"\t"+simpleDateFormat.format(date)+"\t余额:"+balance;
    }

    //消费支出
    public void pay() {
        System.out.println("消费支出金额:");
        money=scanner.nextDouble();
        //money值校验
        if(money<=0||money>balance) {
            System.out.println("消费金额范围是0~"+balance);
            return ;
        }
        System.out.println("消费原因:");
        note=scanner.next();
        balance-=money;//余额减少
        date=new Date();//获取消费时间
        details+="\n"+note+"\t-"+money+"\t"+simpleDateFormat.format(date)+"\t余额:"+balance;
    }

    //退出系统
    public void exit() {
        //退出系统判断，输入y退出，输入取消退出，输入其他无效，循环提示是否退出
        while(true) {
            System.out.println("是否退出系统:(y 退出 n 取消)");
            isexit=scanner.next();

            if(isexit.equals("y")||isexit.equals("n")) {
                break;
            }
        }
        if(isexit.equals("y")) {
            loop=false;
        }
    }


}
