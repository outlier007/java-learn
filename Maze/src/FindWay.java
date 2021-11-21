/*
 *项目名: Maze
 *文件名: FindWay
 *创建者: LMC
 *创建时间:2021/11/21 17:24
 *描述:
 */

public class FindWay {

    public boolean findWay(int[][] map,int i,int j) {
        //0可以走  1墙  2可以走  3已经走过了，走不通
        //查找路线的顺序: 向下--》向右--》向上--》向左

        if (map[6][5] == 2) {
            return true;//已经找到了出口
        }else {
            if(map[i][j]==0) {//为0可以走
                //假设可以走
                map[i][j]=2;
                if(findWay(map,i+1,j)) {//向下走
                    return true;
                }else if(findWay(map,i,j+1)) {//向右走
                    return  true;
                }else if(findWay(map, i-1, j)) {//向上
                    return true;
                }else if(findWay(map, i, j-1)) {//向左
                    return true;
                }else{//不能走
                    map[i][j]=3;
                    return false;
                }
            }else {//1,2,3
                return false;
            }
        }
    }
}
