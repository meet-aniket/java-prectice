package sorting;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class MergeSort {
    void sort(List<Integer> arr, int size) {
        // if()
    }
}

//#include <bits/stdc++.h>
//        using namespace std;
//
//        void merge(vector<int> arr, int const start, int const mid, int const end) {
//        int const n1 = mid-start + 1;
//        int const n2 = end-mid;
//
//        // creating subArrays
//        auto *la = new int[n1],
//        *ra = new int[n2];
//
//        // Copy data to temp arrays
//        for(auto i=0; i<n1; i++)
//        la[i] = arr[start+i];
//        for(auto j=0; j<n2; j++)
//        ra[j] = arr[mid + 1 + j];
//
//
//        }
//
//        void mergeSort(vector<int> arr, int start, int end) {
//        if(start >= end)
//        return;
//
//        int mid = start + (end-start)/2;
//        mergeSort(arr, start, mid);
//        mergeSort(arr, mid+1, end);
//        merge(arr, begin, mid, end);
//        }
//
//        int main() {
//        vector<int> arr = {12, 11, 13, 5, 6, 7};
//        int size = sizeof(arr)/sizeof(arr[0]);
//
//        mergeSort(arr, 0, size-1);
//        return 0;
//        }
