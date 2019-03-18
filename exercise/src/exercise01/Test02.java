package exercise01;

//ц╟ещеепР
public class Test02 {

	public static void main(String[] args) {
		int[] arr = {20,60,80,50,10};
		int temp;
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for(int a : arr) {
			System.out.println(a);
		}
	}
}
