package FingerGuessGame;

/*
 *项目名: HomeWork
 *文件名: GuessGame
 *创建者: LMC
 *创建时间:2021/11/25 15:21
 *描述:
 */

import java.util.Random;

public class Guess {
    //0 石头 1 剪刀 2 布

    int player;//玩家出

    int compute;//电脑出

    int winCount;//玩家赢的次数

    int count=3;//比赛的次数

    //产生随机数
    public void randomNumber( ) {
        Random random=new Random();
        this.compute=random.nextInt(3);
    }


    //判断输赢
    public String game() {

        if(this.player==0&&this.compute==1) {
            return "玩家赢！";
        }else if(this.player==1&&this.compute==2) {
            return "玩家赢！";
        }else if(this.player==2&&this.compute==0) {
            return "玩家赢！";
        }else if(this.player==this.compute) {
            return "平手！";
        } else {
            return "电脑赢！";
        }


    }


    //记录赢的次数
    public int winCount(String winCount) {
        if(winCount.equals("玩家赢！")) {
            this.winCount++;
        }
        return this.winCount;
    }

    //显示出拳情况
    public  String showFinger(int finger) {
        switch(finger) {
            case 0:
                return "石头";
            case 1:
                return "剪刀";
            case 2:
                return "布";
        }
        return "输入错误";
    }




}
