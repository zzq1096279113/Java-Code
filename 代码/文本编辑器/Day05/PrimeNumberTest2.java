class PrimeNumberTest2 {
	public static void main(String[] args) {
	
		int count = 0;//��¼�����ĸ���

		long start = System.currentTimeMillis();//��ȡ��ǰʱ��

		label:for(int i = 2;i <= 100000;i++){
			for(int j = 2;j <= Math.sqrt(i);j++){
				if(i % j == 0){
					continue label;
				}
			}
			count++;
		}

		long end = System.currentTimeMillis();//��ȡ��ǰʱ��
		System.out.println("�����ĸ���Ϊ��" + count);
		System.out.println("�����ѵ�ʱ��Ϊ��" + (end - start));

	}
}