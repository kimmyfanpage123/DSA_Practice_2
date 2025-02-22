package heaps.heap_sort;//(c) A+ Computer Science
//www.apluscompsci.com

public class HeapSortRunner
{
	public static void main ( String[] args )
	{
		HeapSort heap = new HeapSort();

		int[] nums = {99,2,8,75,10,7,9,17,5,3,4,1,11,1};

		heap.heapSort(nums);

		System.out.println(heap);

		heap = new HeapSort();

		int[] stuff = {-3,28,18,5,3,17,29,6,5,3,4,1,11,1};

		heap.heapSort(stuff);

		System.out.println(heap);
	}
}