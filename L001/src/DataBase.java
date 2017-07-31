
public class DataBase {

	//double 精度值太高  数值不准
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=2.1;
		float b=2.1f;
		System.out.println(Math.abs(a-b)<1e-6);
		System.out.println(a-b==0);
	}

}
