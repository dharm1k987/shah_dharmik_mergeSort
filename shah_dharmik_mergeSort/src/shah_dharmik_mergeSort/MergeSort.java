package shah_dharmik_mergeSort;

import java.util.Random;

public class MergeSort {

	public static void Merge(int []l,int[]r,int[]a)
	{
		int nL = l.length;
		int nR = r.length;
		int i,j,k;

		i = 0; j = 0; k =0;
		
		while (i<nL && j<nR)
		{
			if (l[i]<r[j])
			{
				a[k]=l[i];				
				i+=1;
			}
			else
			{
				a[k]=r[j];
				j+=1;
			}
			k+=1;
		}
		System.arraycopy(l,i,a,k,l.length-i);
		System.arraycopy(r,j,a,k,r.length-j);
		
	}
	
	public static int[] mergeSort(int[]a)
	{
		int n=a.length;
		if (n<=1)
		{
			return a;
		}
		int mid = n/2;
		
		int left[]=new int[mid];
		int right[] = new int[n-mid];
		System.arraycopy(a, 0, left, 0, left.length);
        System.arraycopy(a, left.length, right, 0, right.length);
		
		mergeSort(left);
		mergeSort(right);
		Merge(left,right,a);
	return a;
	}
	
	public static void main(String[] args) {
		
		int[] a = {1,25,21,36};
		mergeSort(a);
		for (int i = 0 ; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		

	}

	private static void printArray(int[] arr) {
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
	}



}
