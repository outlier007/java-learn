/*
 *项目名: Maze
 *文件名: Map
 *创建者: LMC
 *创建时间:2021/11/21 17:23
 *描述:
 */


class Map {

    //用二维数组来创建地图
    //创建多个不同的地图
    public int[][] map1() {//地图一
        int[][] array=new int[8][7];

        //将第一行和最后一行建为墙（为1）
        for(int i=0;i<7;i++) {
            array[0][i]=1;
            array[7][i]=1;
        }

        //将第一列和最后一列建为墙（为1）
        for(int i=0;i<8;i++) {
            array[i][0]=1;
            array[i][6]=1;
        }

        array[3][1]=1;
        array[3][2]=1;

        //打印1一下地图
        for(int i=0;i<8;i++) {
            for(int j=0;j<7;j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        return array;
    }


    public int[][] map2() {//地图二
        int[][] array=new int[8][7];

        //将第一行和最后一行建为墙（为1）
        for(int i=0;i<7;i++) {
            array[0][i]=1;
            array[7][i]=1;
        }

        //将第一列和最后一列建为墙（为1）
        for(int i=0;i<8;i++) {
            array[i][0]=1;
            array[i][6]=1;
        }

        array[3][1]=1;
        array[3][2]=1;
        array[5][3]=1;
        array[5][4]=1;
        array[4][4]=1;

        //打印1一下地图
        for(int i=0;i<8;i++) {
            for(int j=0;j<7;j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        return array;
    }


    public int[][] map3() {//地图三
        int[][] array=new int[8][7];

        //将第一行和最后一行建为墙（为1）
        for(int i=0;i<7;i++) {
            array[0][i]=1;
            array[7][i]=1;
        }

        //将第一列和最后一列建为墙（为1）
        for(int i=0;i<8;i++) {
            array[i][0]=1;
            array[i][6]=1;
        }

        array[3][1]=1;
        array[3][2]=1;
        array[5][3]=1;
        array[5][4]=1;
        array[4][4]=1;
        array[2][2]=1;
        array[6][2]=1;

        //打印1一下地图
        for(int i=0;i<8;i++) {
            for(int j=0;j<7;j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        return array;
    }
}
