class SanYuanTest {
	public static void main(String[] args) {
		
		//��ȡ���������Ľϴ�ֵ
		int m = 12;
		int n = 5;

		int max = (m > n)? m : n;
		System.out.println(max);//12

		double num = (m > n)? 2 : 1.0;//����ɹ�

		//(m > n)? 2 : "n��";//�������

		n = 12;
		String maxStr = (m > n)? "m��" : ((m == n)? "���" : "n��");
		System.out.println(maxStr);


		//��ȡ�����������ֵ
		int n1 = 12;
		int n2 = 30;
		int n3 = -43;
		
		int max1 = (n1 > n2)? n1 : n2;
		int max2 = (max1 > n3)? max1 : n3;
		System.out.println("�������е����ֵΪ:" + max2);

		//int max3 = (((n1 > n2)? n1 : n2) > n3)? ((n1 > n2)? n1 : n2) : n3;//������
		//System.out.println("�������е����ֵΪ��" + max3);

		//д��if-else:
		if(m > n){
			System.out.println(m);
		}
		else{
			System.out.println(n);
		}
	}
}
