class BitTest {
	public static void main(String[] args) {

		int i = 21;
		System.out.println("i << 2 :" + (i << 2));//-84 <- (-21 * 2^2)
		System.out.println("i << 3 :" + (i << 3));//-168 <- (-21 * 2^3)
		System.out.println("i << 27 :" + (i << 27));//-1476395008

		int m = 12;
		int n = 5;
		System.out.println("m & n :" + (m & n));//��	4
		System.out.println("m | n :" + (m | n));//��	13
		System.out.println("m ^ n :" + (m ^ n));//���	9

		//��ϰ����������������ֵ
		int num1 = 10;
		int num2 = 20;

		//��ʽһ��������ʱ�����ķ�ʽ
		//�Ƽ��ķ�ʽ
		int temp = num1;
		num1 = num2;
		num2 = temp;

		//��ʽ������������
		//�׶ˣ��� ��Ӳ������ܳ����洢��Χ �� �о����ԣ�ֻ����������ֵ����
		//num1 = num1 + num2;
		//num2 = num1 - num2;
		//num1 = num1 - num2;

		//��ʽ����ʹ��λ�����
		//�о����ԣ�ֻ����������ֵ����
		//num1 = num1 ^ num2;
		//num2 = num1 ^ num2;
		//num1 = num1 ^ num2;

		System.out.println("num1 = " + num1 + ",num2 = " + num2);

	}
}
