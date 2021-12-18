package com.lmclearn.houserent.service;

/*
 *项目名: HouseRentManage
 *文件名: HouseService
 *创建者: LMC
 *创建时间:2021/12/8 8:43
 *描述:用于房屋出租系统的各种业务操作
 */

import com.lmclearn.houserent.domain.House;
import com.lmclearn.houserent.utils.Utility;

public class HouseService {
    private House[] houses;
    private int houseNums=1;//房源个数
    private int idCounter=1;//id号

    public HouseService(int size) {
       houses=new House[size];//建立一个size大小的数组，存放房屋信息。

        //用于测试初始化一个房屋
        houses[0]=new House(1,"天才林","10086112689","江西赣州章贡区",24000,"未出租");
    }
    
    public House[] list() {
        return houses;
    }


    //添加房源
    public boolean add(House newHouse) {
        if(houseNums<=houses.length) {
            houses[houseNums++]=newHouse;
            System.out.println("添加房源成功！");
        }else {
            System.out.println("数组已满！添加失败！！！");
            return false;
        }
        newHouse.setId(++idCounter);//重新设置id
        return true;
    }


    //删除房源信息
    public boolean del(int delId) {
        int index=-1;
        for (int i = 0; i <houseNums-1 ; i++) {
            if(houses[i].getId()==delId) {
                index=i;
            }
        }
         if(index==-1){
            System.out.println("要删除的房源不存在，请确认信息是否正确。");
            return false;
        }
        for (int i = index; i <houseNums-1 ; i++) {
            houses[i]=houses[i+1];
        }
        houses[--houseNums]=null;
        System.out.println("删除成功！！！");
        return true;
    }


    //用ID查找房源信息
    public House findById(int findID) {
        for (int i = 0; i <houseNums ; i++) {
            if(houses[i].getId()==findID) {
                return houses[i];
            }
        }
        System.out.println("查找失败！请确认ID是否正确。");
        return null;
    }



    //修改房源信息
    public boolean change(int changeId) {
        House changeHouse = this.findById(changeId);
        if(null==changeHouse) {
            return false;
        }
        System.out.print("请输入要修改的房主("+changeHouse.getName()+")：");
        String name=Utility.readString(6,"");
        if(!"".equals(name)) {
            changeHouse.setName(name);
        }
        System.out.print("请输入要修改的电话("+changeHouse.getPhone()+")：");
        String phone=Utility.readString(11,"");
        if(!"".equals(phone)) {
            changeHouse.setPhone(phone);
        }
        System.out.print("请输入要修改的地址("+changeHouse.getAddress()+")：");
        String address = Utility.readString(30,"");
        if(!"".equals(address)) {
            changeHouse.setAddress(address);
        }
        System.out.print("请输入要修改的月租("+changeHouse.getRent()+")：");
        int rent = Utility.readInt(-1);
        if(rent!=-1) {
            changeHouse.setRent(rent);
        }
        System.out.print("请输入要修改的状态("+changeHouse.getState()+")：");
        String state=Utility.readString(3,"");
        if(!"".equals(state)) {
            changeHouse.setState(state);
        }
        return true;
    }


}
