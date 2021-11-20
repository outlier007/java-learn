public class AddOrderedArray {
	public static void main(String[] args) {
		int[] arr={10,15,26,40};
		int value=23;//要插入到数组中的数值
		int index=arr.length-1;//插入的位置
		for(int i=0;i<arr.length;i++) {
			if(value<=arr[i]) {
				index=i;//寻找插入的位置
				break;
			}
		}
		//数组扩容和插入数据
		int j=0;
		int[] arrtmp=new int[arr.length+1];
		for(int i=0;i<arr.length+1;i++) {		
			if(i!=index) {
				arrtmp[i]=arr[j];
				j++;
			}else {
				arrtmp[i]=value;
			}
		}
		arr=arrtmp;
		//打印数组
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}