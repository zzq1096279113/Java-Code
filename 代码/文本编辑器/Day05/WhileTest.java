class  WhileTest{
	public static void main(String[] args) {
		
		//����100���ڵ�����ż��
		int i = 1;
		while(i <= 100){
			
			if(i % 2 == 0){
				System.out.print(i + " ");
			}
			i++;
		}
		//����whileѭ���Ժ�i�Կ��Ե��á�
		System.out.println(i);//101
	}
}
