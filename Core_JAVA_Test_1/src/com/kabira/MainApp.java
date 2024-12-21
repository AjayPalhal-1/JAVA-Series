package com.kabira;

public class MainApp {

	public static void sort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    // Swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }


		for (int itr = 0; itr < arr.length; itr++) {
//			System.err.println(arr[itr]);
			System.out.println(arr[itr]);
		}
	}

	public static void findUnionAndIntersection(int []arr , int [] brr) {
		
		System.out.println("Intersection  No. are : ");

		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==brr[i])
			{
				System.out.println(arr[i]);
			}
		}
		
		
		System.out.println("Union  No. are : ");

		
		for(int i=0;i<arr.length;i++)
		{
			for (int j=0;j< brr.length;j++)
			{
				if(arr[i]==brr[j])
				{
					System.out.println(arr[i]);
				}
				else if(arr[i]!=brr[j])
				{
					System.out.println(arr[i]);

				}

				
			}
			
		}
		
		System.out.println("Hlw");


	}

	public static void main(String[] args) {
		
		System.out.println("Hiiii");
		int arr[] = { 1, 3, 2, 4 };
		int brr[] = { 1, 3, 2, 6 };

		
		System.out.println("1st Array ");

		sort(arr);
		System.out.println("2nd Array ");
		sort(brr);
		
		findUnionAndIntersection(arr ,brr );

	}

}
