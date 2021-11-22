class Tower {
		public void move(int num,char a,char b,char c) {
			if(num==1) {//一个圆盘直接从a移动到c
				System.out.println(a+"-->"+c);
			}else{
				//多个圆盘：
				//1、把num-1个圆盘放到b柱中，借助c柱
				//2、把a柱上最大的圆盘放到c柱
				//再把b柱上的num-1个元盘放到c柱，要借助a柱
				move(num-1,a,c,b);
				System.out.println(a+"-->"+c);
				move(num-1,b,a,c);
			}
		}
	}