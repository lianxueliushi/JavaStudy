import java.util.Scanner;
public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String pwd1="0";
		String pwd2="1";
		do{
			System.out.println("请输入密码:");
			pwd1=sc.nextLine();
			System.out.println("请再次输入密码:");
			pwd2=sc.nextLine();
			if(!pwd1.equals(pwd2)){
				System.out.println("两次密码不一致！");
			}else{
				System.out.println("密码设置成功！");
			}
		}while(!pwd1.equals(pwd2));
	}

}
