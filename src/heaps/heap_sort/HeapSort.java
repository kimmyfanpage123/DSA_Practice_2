package heaps.heap_sort;//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.List;
import java.util.ArrayList;

public class HeapSort
{
	private List<Integer> list;

	public HeapSort()
	{
		list = new ArrayList<Integer>();
	}

   public void swapUp(int index)
   {
	   while (index > 0){
		   int parent = (index - 1)/2;
		   if (list.get(parent) > list.get(index)){
			   swap(index, parent);
			   index = parent;
		   }
		   else{
			   break;
		   }
	   }
   }

	public void swapDown(int index)
	{
		int root = 0;

		while (root < index){
			int left = root * 2 + 1;
			int right = root * 2 + 2;
			int min;

			if (left < index){
				if (right < index){
					if (list.get(left) >= list.get(right)){
						min = right;
					}
					else{
						min = left;
					}
				}
				else{
					min = left;
				}
			}
			else{
				break;
			}

			if (list.get(root) > list.get(min)){
				swap(root, min);
				root = min;
			}
			else{
				break;
			}
		}
	}

   public void heapSort(int[] nums)
   {
		for (int i = 0; i < nums.length; i++){
			list.add(nums[i]);
			swapUp(list.size() - 1);
		}

		List<Integer> sorted = new ArrayList<>();
		while (!list.isEmpty()){
			sorted.add(list.get(0));

			if (list.size() > 1){
				list.set(0, list.remove(list.size() - 1));
				swapDown(list.size());
			}
			else{
				list.remove(0);
			}
		}
		list.addAll(sorted);
   }
   
   private void swap(int first, int last)
   {
	   int temp = list.get(first);
	   list.set(first, list.get(last));
	   list.set(last, temp);
   }

	public String toString()
	{
		return list.toString();
	}
}