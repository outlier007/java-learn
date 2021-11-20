public class YangHuiTriangle {
	public static void main(String[] args) {
		int[][] yanghui=new int[10][];//用二维数组实现
		for(int i=0;i<10;i++) {
			yanghui[i]=new int[i];//二维数组中的每一行都要new个一维数组
			for(int j=0;j<=i-1;j++) {
				if(j==0||j==i-1) {
					yanghui[i][j]=1;//每行的第一个数和最后一个数是1
				}else {
					yanghui[i][j]=yanghui[i-1][j-1]+yanghui[i-1][j];
				}
			}
		}
		//打印二维数组
		for(int i=0;i<yanghui.length;i++) {
			for(int j=0;j<yanghui[i].length;j++) {
				System.out.print(yanghui[i][j]+" ");
			}
			System.out.println();
		}
	}
}