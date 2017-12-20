public class QuickSort
{
    private void quickSort(int[] array, int left, int right)
    {
        if (left < right) {
            int partition = partition(array, left, left+1, right);
            quickSort(array, left+1, partition-1);
            quickSort(array, partition+1, right);
        }
    }

    private int partition(int[] array, int pivotPos, int left, int right)
    {
        int pivot = array[pivotPos];
        //System.out.println(pivot);
        while (left < right) {
            if (array[left] <= pivot) left++;
            if (array[right] > pivot) right --;
            if (left < right) {
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;
            }
            //swap array of left and right
        }
        //swap the pivot element with array of right
        int tmp = array[right];
        array[right] = array[pivotPos];
        array[pivotPos] = tmp;
        //Arrays.stream(array).forEach(e -> System.out.print(e + " "));
        //System.out.println("");
        return right;
    }

    public int[] sort(int[] array)
    {
        quickSort(array, 0, array.length -1);
        return array;
    }
}
