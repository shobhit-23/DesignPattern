package threading;

public class trapping {
	public static void main(String[] args) {

		int[] A = {5, 4, 1, 4, 3, 2, 7};

		
		int min = 0;

		int waterTrapped = 0;

		for (int i = 0; i < A.length; i++) {

		int right = A.length - 1;

		int left = 0;
		
		int rightMax = A[A.length-1];

		int leftMax = A[0];


		while(right>i){

		if (A[right] > rightMax) {

		rightMax = A[right];

		}

		right--;

		}

		while (left < i) {

		if (A[left] > leftMax) {

		leftMax = A[left];

		}

		left++;

		}

		min = Math.min(leftMax, rightMax);

		if (min > A[i])

		waterTrapped +=min- A[i];

		}

		System.out.println(waterTrapped);
	}
}
