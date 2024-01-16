package data_structures.algorithms;

public class SortingAlgos {
  public void insertion_sort(char[] data) {
    int n = data.length;
    for (int k = 1; k < n; k++) {
      char cur = data[k];
      int j = k;
      while(j > 0 && data[j-1] > cur) {
        data[j] = data[j-1];
        j--;
      }
      data[j] = cur;
    }
  }
}
