
public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * һֻ����5��
		 * һֻĸ��3��
		 * 3ֻС��1��
		 * 100��Ǯ��һ��ֻ�����ֱ���ô��
		 */
		int coke,hen,chicke;
		for(coke=1;coke<20;coke++){
			for(hen=1;hen<=33;hen++){
				for(chicke=3;chicke<=99;chicke+=3){
					if(coke+hen+chicke==100 && coke*5+hen*3+chicke/3*1==100){
						System.out.println("����:"+coke+" ĸ����"+hen+" С����"+chicke);
					}
				}
			}
		}
	}

}
