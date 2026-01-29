public class FrequenciesOfArray {
    public static void main(String[] args) {
        int arr[] = {23,46,34,47,32,25,65,23,23,56,23,88,46,47,65,56,90};
		int count = 0;
		int max = Integer.MAX_VALUE;
		int[] arr1 = new int[999999999];
		//int arr1[] = {0};
		System.out.println("Frequencies Of Element of Array are :");
		for(int i = 0;i < arr.length;i++) {
			if(arr1[arr[i]] == 0) {
				arr1[arr[i]] = 1;
				System.out.print(arr[i] + " :");
				for(int j = i;j < arr.length;j++) {
					if(arr[i] == arr[j]) {
						count++;
					}
				}
				System.out.println(count);
				count = 0;
			}
			
		}
    }
}
