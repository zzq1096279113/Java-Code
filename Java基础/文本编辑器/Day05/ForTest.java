import java.util.Scanner;

class ForTest{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("�������һ����������");
		int m = scan.nextInt();
		System.out.print("������ڶ�����������");
		int n = scan.nextInt();

		int min = (m < n)? m : n;//��ȡ��Сֵ
		int max = (m > n)? m : n;//��ȡ�ϴ�ֵ

		for(int i = min; i >= 1; i--){
			if(m % i == 0 && n % i == 0){
				System.out.println("���Լ��Ϊ��" + i);
				break;
			}
		}
		for(int i = max; i <= (m * n); i++){
			if(i % m == 0 && i % n == 0){
				System.out.println("��С������Ϊ��" + i);
				break;
			}
		}
	}
}