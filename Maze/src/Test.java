/*
 *项目名: Maze
 *文件名: Test
 *创建者: LMC
 *创建时间:2021/11/21 17:22
 *描述:
 */

public class Test {

    public static void main(String[] args) {
        Map maps=new Map();
        int[][] map=maps.map3();//获取地图

        FindWay findway=new FindWay();
        boolean way=findway.findWay(map,1,1);//找路线，起始位置为[1][1]

        System.out.println("==========================");
        //打印路线
        for (int i = 0; i <8 ; i++) {
            for (int j = 0; j <7 ; j++) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }

    }
}

