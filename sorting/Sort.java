package sorting;

import java.util.Arrays;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(12, 11, 13, 5, 6, 7);
        
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr, arr.size());
    }
}
