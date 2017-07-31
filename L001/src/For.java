
public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 一只公鸡5块
		 * 一只母鸡3块
		 * 3只小鸡1块
		 * 100块钱买一百只鸡，分别怎么买？
		 */
		int coke,hen,chicke;
		for(coke=1;coke<20;coke++){
			for(hen=1;hen<=33;hen++){
				for(chicke=3;chicke<=99;chicke+=3){
					if(coke+hen+chicke==100 && coke*5+hen*3+chicke/3*1==100){
						System.out.println("公鸡:"+coke+" 母鸡："+hen+" 小鸡："+chicke);
					}
				}
			}
		}
	}

}
