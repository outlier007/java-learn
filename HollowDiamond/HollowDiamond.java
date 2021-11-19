public class HollowDiamond {
	public static void main(String[] args) {
		int value=11;//打印一个空心的菱形
		for(int i=1;i<=value;i++) {
			//打印上半部分
			if(i<=(value/2)+1) {
			for(int k=1;k<=(value/2)+1-i;k++) {
					System.out.print(" ");//打印空格
				}
			for(int j=1;j<=2*i-1;j++) {
				
				if(j==1||j==(2*i-1)) {
					System.out.print("*");//打印轮廓
				}else {
					System.out.print(" ");//打印中间空心部分
				}
			}
			System.out.println();
			}else {
				//打印下半部分
				for(int k=1;k<=i-1-value/2;k++) {
					System.out.print(" ");//打印空格
				}
			for(int j=1;j<=2*value-2*i+1;j++) {
				
				if(j==1||j==2*value-2*i+1) {
					System.out.print("*");//打印轮廓
				}else {
					System.out.print(" ");//打印中间空心部分
				}
			}
			System.out.println();
			}
		}
	}
}