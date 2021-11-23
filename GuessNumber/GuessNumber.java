import java.util.Scanner;
import java.util.Random;
public class GuessNumber {
	public static void main(String[] args) {
		//获取随机数字
		Random random = new Random();
		int tmp=random.nextInt(100);
		
		
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("请输入猜的数字:>");
			int trc=sc.nextInt();
			if(tmp<trc) {
				System.out.println("猜大了！");
				
			}else if (tmp>trc){
				System.out.println("猜小了！");
			}else {
				System.out.println("猜对了！！");
				break;
			}
		}
	}
}