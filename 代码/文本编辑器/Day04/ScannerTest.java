/*
��δӼ��̻�ȡ��ͬ���͵ı�������Ҫʹ��Scanner��

����ʵ�ֲ��裺
1.������import java.util.Scanner;
2.Scanner��ʵ����:Scanner scan = new Scanner(System.in);
3.����Scanner�����ط�����next() / nextXxx()��������ȡָ�����͵ı���

ע�⣺
��Ҫ������Ӧ�ķ�����������ָ�����͵�ֵ��������������������Ҫ������Ͳ�ƥ��ʱ��
�ᱨ�쳣��InputMisMatchException���³�����ֹ��
*/
import java.util.Scanner;//1.������import java.util.Scanner;

class ScannerTest{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);//2.Scanner��ʵ����

		System.out.print("���������������");
		String name = scan.next();//3.����Scanner�����ط���
		System.out.println();

		System.out.print("����������Ա𣺣���/Ů��");
		String gender = scan.next();
		System.out.println();

		System.out.print("������������䣺");
		int age = scan.nextInt();
		System.out.println();

		System.out.print("������������أ�");
		double weight = scan.nextDouble();
		System.out.println();

		System.out.print("���Ƿ��ң�true/false��");
		boolean isLove = scan.nextBoolean();
		System.out.println();

		System.out.println(name);
		System.out.println(gender);
		System.out.println(age);
		System.out.println(weight);
		System.out.print(isLove);

	}

}