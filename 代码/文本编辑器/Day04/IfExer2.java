import java.util.Scanner;

class IfExer2{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("������������:(cm)");
		int height = scan.nextInt();
		System.out.print("��������ĲƸ�:(ǧ��)");
		double wealth = scan.nextDouble();
		//System.out.print("���������Ƿ�˧:(true/false)");
		//boolean isHandsome = scan.nextBoolean();
		System.out.print("���������Ƿ�˧:(��/��)");
		String isHandsome = scan.next();

		if(height >= 180 &&	wealth >= 1 && isHandsome.equals("��")){
			System.out.println("��һ��Ҫ�޸�����");
		}else if(height >= 180 || wealth >= 1 || isHandsome.equals("��")){
			System.out.println("�ްɣ����ϲ����������");
		}else{
			System.out.println("����");
		}
	}
}