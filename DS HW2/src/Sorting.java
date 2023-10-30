
public class Sorting {
	
	public static int[] bubbleSort(int[] a){
		//sort a
		int temp;
		int swapinloop;
		int size = a.length;
		for (int i = size-1; i>=1; i--)
		{
			swapinloop=0;
			for (int j = 0; j <= i-1; j++)
			{
				//element comparison (a[j]> a [j+1]), increment count
				if (a[j] > a[j+1])				
				{ //swap
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;

					//swap, increment count
					swapinloop++;
				}
			}
			
			if (swapinloop==0){
				break;
			}
		}
		return a;
	}

	//bubble sort-descending order .. 
	public static int[] bubbleSortDecending(int[] a){
		//sort a
				int temp;
				int swaps=0;
				int comps=0;
				int size = a.length;
				for (int i = 0; i < size-1; i++)
				{
					for (int j = size-1; j >=i+1; j--)
					{
						//element comparison (a[j]> a [j+1]), increment count
						comps+=1;
						if (a[j] > a[j-1])				
						{ //swap
							temp = a[j];
							a[j] = a[j-1];
							a[j-1] = temp;
							//swap, increment count
							swaps+=1;
						}
					}
				}
				System.out.println("Number of swaps: " + swaps);
				System.out.println("Number of comparisons: " + comps);

				return a;
	}
	
	public static int[] bubbleSortRecursive(int[] a, int end){
		if(end==0){
			return a;
		}
		else{
			for(int i=0; i<=end-1; i++){
				if(a[i]>a[i+1]){
					int temp=a[i+1];
					a[i+1]=a[i];
					a[i]=temp;
				}
			}
			return bubbleSortRecursive(a, end-1);
		}
	}

	//selection sort - integers	
	public static int[] selectionSort(int[] a){	
		int temp, min;
		int size = a.length;
		for (int i = 0; i < size; i++){		
			// find the index of the smallest element
			min =indexOfSmallestElement(a, i);
			//number of element comparison in indexOfSmallestElement is size - (i+1)
			//swap
			temp = a[min];
			a[min] = a[i]; 
			a[i] = temp;
		}
		return a;
	}



	private static int indexOfSmallestElement(int[] a, int i) {
		int min=i;
		for(int j=i+1; j< a.length; j++){
			if (a[j] > a[min]){
				min=j;
			}
		}
		return min;
	}


	// insertion sort
	public static int[] insertionSort(int[] a){	
		int num;
		int size = a.length;
		for (int i = 1; i < size; i++){
			int j = i;
			num = a[i];
			
			while (j > 0 && num < a[j - 1]){
				a[j] = a[j - 1]; // right shifting
				j--;
			}
			a[j] = num;
		}
		return a;
	}

	// insertion sort with left-shifting
	public static int[] insertionSort2(int[] a){	
		int temp;
		int size = a.length;
		int swaps=0;
		int comps=0;
		for (int i = size-2; i >=0; i--){
			int j = i;
			temp = a[i];
			
			while (j < size-1 && temp > a[j + 1]){
				comps++;
				a[j] = a[j + 1]; // left shifting
				j++;
			}
			a[j] = temp;
			swaps++;
		}
		System.out.println("Number of swaps: " + swaps);
		System.out.println("Number of comparisons: " + comps);
		return a;
	}
	
	public static int[] mergeSort(int[] a, int start, int end){
		//uses merge
		if(start==end){
			return a;
			
		}
		else{
			mergeSort(a,start,(start+end)/2);
			mergeSort(a,1+(start+end)/2,end);
			return merge(a,start,(start+end)/2,end);
		}
	}
	
	public static int[] merge(int[]A, int start, int mid, int end){
		//start to mid is sorted
		//mid+1 to end is sorted
		int[] X= new int[end-start+1];
		int i=start;
		int j=mid+1;
		int index=0;
		while((i<=mid) && (j<=end)){
			if(A[i]<A[j]){
				X[index]=A[i];
				i++;
				index++;
			}
			else if(A[i]>=A[j]){
				X[index]=A[j];
				j++;
				index++;				
			}
		}
		
		if(i==mid+1){
			for(int n=index; n<=X.length-1; n++){
				X[n]=A[j];
				j++;
			}	
		}
		else if(j==end+1){
			for(int n=index; n<=X.length-1; n++){
				X[n]=A[i];
				i++;
			}
		}
		return X;
		
	}
	
	public static int[] quickSort(int[] a, int start, int end){
		int pivot=a[start];
		
	}

	
	public static void main(String[] args) {
		int[] array= {4,77,98,30,20,50,77,22,49,2};
		int[] a= bubbleSort(array);
		for(int i=0; i<=a.length-1; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		a= bubbleSortRecursive(array,array.length-1);
		for(int i=0; i<=a.length-1; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("");

		a=selectionSort(array);
		for(int i=0; i<=a.length-1; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		
		a=insertionSort(array);
		for(int i=0; i<=a.length-1; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		a=mergeSort(array,0,array.length-1);

		for(int i=0; i<=a.length-1; i++){
			System.out.print(a[i]+" ");
		}
		
	}

}
