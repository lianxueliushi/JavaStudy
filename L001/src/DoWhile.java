import java.util.Scanner;
public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String pwd1="0";
		String pwd2="1";
		do{
			System.out.println("����������:");
			pwd1=sc.nextLine();
			System.out.println("���ٴ���������:");
			pwd2=sc.nextLine();
			if(!pwd1.equals(pwd2)){
				System.out.println("�������벻һ�£�");
			}else{
				System.out.println("�������óɹ���");
			}
		}while(!pwd1.equals(pwd2));
	}

}
