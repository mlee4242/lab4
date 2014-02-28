package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] unsortedArray) {
		//TODO: S1 implements bubble sort

    	boolean sorted;
    	int length = unsortedArray.length;
    	int i;
    	int temp;
    	
    	do
    	{
    		sorted = true;
    		length--;
    		for (i = 0; i < length; i++)
    		{
    			if (unsortedArray[i] > unsortedArray[i+1])
    			{
    				temp = unsortedArray[i];
    				unsortedArray[i] = unsortedArray[i+1];
    				unsortedArray[i+1] = temp;
    				sorted = false;
    			}
    		}
    	}
    	while (sorted != true);
    	
        return unsortedArray;		
	}
}
