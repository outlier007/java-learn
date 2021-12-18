package com.lmclearn.houserent.view;

/*
 *项目名: HouseRentManage
 *文件名: HouseView
 *创建者: LMC
 *创建时间:2021/12/7 17:45
 *描述:显示信息
 */

import com.lmclearn.houserent.domain.House;
import com.lmclearn.houserent.service.HouseService;
import com.lmclearn.houserent.utils.Utility;

public class HouseView {
    private  boolean loop=true;//退出菜单
    private char key=' ';//菜单选择
    //显示房屋信息
    private HouseService houseService=new HouseService(10);
    public void list() {
        System.out.println("======房屋出租房源信息======");
        System.out.println("编号\t\t\t房主\t\t\t电话\t\t\t\t地址\t\t\t\t\t月租\t\t\t状态");
        for (int i = 0; i <houseService.list().length ; i++) {
            if(houseService.list()[i]==null) {
                break;
            }
            System.out.println(houseService.list()[i]);
        }
    }


    //查找
    public void findHouse() {
        System.out.println("======查找房源信息======");
        System.out.print("请输入要查找的ID:");
        int findID=Utility.readInt();
        House house = houseService.findById(findID);
        if(house!=null) {
            System.out.println(house);
        }
    }



    //删除
    public void delHouse() {
        System.out.println("======删除房源信息======");
        System.out.print("请输入要删除的房屋编号(-1退出)：");
        int delId=Utility.readInt();
        if(delId==-1) {
            System.out.println("放弃删除！");
            return;
        }
        System.out.println("你真的要删除此房源吗？");
        if('Y'==Utility.readConfirmSelection()) {
            houseService.del(delId);
        }else {
            System.out.println("放弃删除！");
            return;
        }

    }




    //修改
    public void change() {
        System.out.println("======修改房源信息======");
        System.out.print("请输入要修改的编号(-1退出)：");
        int changeId=Utility.readInt();
        if(changeId==-1) {
            System.out.println("放弃修改！");
            return;
        }
        if(houseService.change(changeId)) {
            System.out.println("修改成功。");
        }else{
            System.out.println("修改失败！！！");
        }
    }


    //退出
    public void exit() {
        System.out.println("你确定要退出系统吗？");
        if('Y'== Utility.readConfirmSelection()) {
            loop=false;
        }
    }


    //添加房屋信息
    public void addHouse() {
        System.out.println("======添加房源信息======");
        System.out.print("房主：");
        String name = Utility.readString(6);
        System.out.print("电话：");
        String phone=Utility.readString(11);
        System.out.print("地址：");
        String address = Utility.readString(30);
        System.out.print("月租：");
        int rent = Utility.readInt();
        System.out.print("状态：");
        String state=Utility.readString(3);
        House newHouse = new House(0,name,phone,address,rent,state);
        houseService.add(newHouse);
    }

    //显示菜单
    public void mainMenu() {
        do{
            System.out.println("======房屋出租管理系统菜单======");
            System.out.println("\t\t1、新 增 房 屋");
            System.out.println("\t\t2、修 改 房 屋 信 息");
            System.out.println("\t\t3、删 除 房 屋 信 息");
            System.out.println("\t\t4、查 找 房 屋");
            System.out.println("\t\t5、房 屋 列 表");
            System.out.println("\t\t6、退      出");
            System.out.print("请选择（1-6）:");
            key= Utility.readChar();
            switch(key) {
                case '1':
                    this.addHouse();
                    break;
                case '2':
                    this.change();
                    break;
                case '3':
                    this.delHouse();
                    break;
                case '4':
                    this.findHouse();
                    break;
                case '5':
                    this.list();
                    break;
                case '6':
                    this.exit();
                    break;
            }
        }while(loop);
    }
}
