import java.util.Arrays;

public class TestSorting {
    private void testQuickSort()
    {
        QuickSort qckSort = new QuickSort();
        int[] arr = {98,45,677,2324,8,9,0,534,75,4,65,123};
        //int[] arr = {5,1,2,6,7};
        arr = qckSort.sort(arr);
        Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
    }

    private void testTriplet()
    {
        int[] arr = {98,45,677,2324,8,9,0,534,75,4,65,123};
        int[] res = TripletArray.findTriplets(arr, 613);
        Arrays.stream(res).forEach(e -> System.out.print(e + " "));
    }

    public static void main(String[] args)
    {
        TestSorting ts = new TestSorting();
        ts.testTriplet();
    }
}
