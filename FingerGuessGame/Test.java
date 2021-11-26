package FingerGuessGame;

/*
 
 *描述:
编写一个猜拳的游戏
有个人 Tom，设计他的成员变量. 成员方法, 可以电脑猜拳. 电脑每次都会随机生成 0, 1, 2
0 表示 石头 1 表示剪刀 2 表示 布
*/


import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Guess GG = new Guess();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <GG.count ; i++) {
            System.out.println("你可以出石头(0)、剪刀(1)、布(2):");
            GG.player = scanner.nextInt();//输入你要出的拳
			
			//判断出拳是否正确
			if (GG.player > 2 || GG.player < 0) { 
				//抛出一个异常
				throw new IllegalArgumentException("数字输入错误");                                             
			}  

            GG.randomNumber();//电脑产生随机数

            String winner=GG.game();
            //显示输赢情况
            System.out.println("=================================");
            System.out.println("玩家出拳"+"\t"+"电脑出拳"+"\t"+"输赢情况");
            System.out.printf("%4s\t%4s\t%4s\n",GG.showFinger(GG.player),GG.showFinger(GG.compute),winner);
            System.out.println("=================================");

            GG.winCount(winner);
        }
        //记录赢的次数

        System.out.println("你一共赢了"+GG.winCount+"次");

    }

}
