class AriTest {
	public static void main(String[] args) {
		
		//���ţ�/
		int num1 = 12;
		int num2 = 5;
		System.out.println(num1 / num2);//2
		System.out.println(num1 / num2 * num2);//10
		System.out.println(num1 / num2 + 0.0);//2.0
		System.out.println(num1 / (num2 + 0.0));//2.4
		System.out.println((double)num1 / num2);//2.4
		System.out.println((double)(num1 / num2));//2.0		

		// %:ȡ������
		//����ķ����뱻ģ���ķ�����ͬ
		//�����У�����ʹ��%���ж��ܷ񱻳����������
		int m1 = 12;
		int n1 = 5;
		System.out.println("m1 % n1 = " + m1 % n1);//2

		int m2 = -12;
		int n2 = 5;
		System.out.println("m2 % n2 = " + m2 % n2);//-2

		int m3 = 12;
		int n3 = -5;
		System.out.println("m3 % n3 = " + m3 % n3);//2

		int m4 = -12;
		int n4 = -5;
		System.out.println("m4 % n4 = " + m4 % n4);//-2
		
		
		//(ǰ)++ :������1��������
		//(��)++ :�����㣬������1
		int a1 = 10;
		int b1 = ++a1;
		System.out.println("a1 = " + a1 + ",b1 = " + b1);//11,11
		
		int a2 = 10;
		int b2 = a2++;
		System.out.println("a2 = " + a2 + ",b2 = " + b2);//11,10
		
		int a3 = 10;
		++a3;//a3++;
		int b3 = a3;
		
		//ע�⣺
		short s1 = 10;
		//s1 = s1 + 1;//����ʧ��
		//s1 = (short)(s1 + 1);//��ȷ��
		s1++;//����1����ı䱾���������������
		System.out.println(s1);//11

		//���⣺
		byte bb1 =127;
		bb1++;
		System.out.println("bb1 = " + bb1);//-128

		//(ǰ)-- :���Լ�1��������
		//(��)-- :�����㣬���Լ�1
		
		int a4 = 10;
		int b4 = a4--;//int b4 = --a4;
		System.out.println("a4 = " + a4 + ",b4 = " + b4);//9,10

		int a5 = 10;
		int b5 = --a5;
		System.out.println("a5 = " + a5 + ",b5 = " + b5);//9,9

	}
}
