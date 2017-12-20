public class TripletArray
{
    public static int[] findTriplets (int[] array, int number)
    {
        QuickSort sort = new QuickSort();
        int[] sortedArray = sort.sort(array);

        for (int i=0; i<sortedArray.length; i++) {
            int pivot = sortedArray[i];
            int left = i+1;
            int right = sortedArray.length-1;

            while (left < right) {
                int sum = pivot+sortedArray[left]+sortedArray[right];
                //System.out.println("Considering "+pivot+", "+sortedArray[left]+", "+sortedArray[right]);
                if (sum == number) {
                    return new int[] {pivot, sortedArray[left], sortedArray[right]};
                } else if (sum > number) {
                    right --;
                } else {
                    left++;
                }
            }
        }
        return null;
    }
}
