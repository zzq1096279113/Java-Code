package Class;

public class ArrayTest2 {
	public static void main(String[] args) {
		int[] arr1, arr2;
		
		arr1 = new int[] {2,3,7,9,11,13,17,19};
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "\t");
		}
		
		arr2 = new int[arr1.length];//不能称作数组的赋值，只是地址值相同
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = arr1[i];
		}
		
		for(int i = 0; i < arr2.length; i++) {
			if(i % 2 == 0) {
				arr2[i] = i;
			}
		}
		System.out.println();
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + "\t");
		}
		System.out.println();
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "\t");
		}
	}
}
