import java.util.Scanner;

class IfTest{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("������ѦС������ĩ�ɼ�(0-100):");
		int score = scan.nextInt();

		if(score == 100){
			System.out.println("����һ������");
		}
		else if(score > 80 && score <= 99){
			System.out.println("����һ̨iPhone");
		}
		else if(score >= 60 && score <= 80){
			System.out.println("����һ��iPad");
		}
		else{
			System.out.println("ʲôҲû��");
		}
	}
}