class PrimeNumberTest1 {
	public static void main(String[] args){
		
		long start = System.currentTimeMillis();
		int count = 0;

		for(int i = 2; i <= 100000; i++){
			boolean isFlag = true;
			for(int j = 2; j <= Math.sqrt(i); j++){//�Ż������Ա�������������Ȼ����Ч 0.5��
				if(i % j == 0){
					isFlag = false;
					break;//�Ż�һ��ֻ�Ա������������Ȼ������	2��
				}
			}
			if(isFlag){
				//System.out.print(i + " ");
				count++;
			}
		}

		long end = System.currentTimeMillis();
		System.out.println("����Ϊ��" + count);
		System.out.println("�����ѵ�ʱ���ǣ�" + (end - start));//δ�Ż���24.0��

	}
}
