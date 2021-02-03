class Solution {

// Use Binary Search to find the last occurance of "1"
public int binarySearch(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    int mid = 0;
    while(start <= end) {
        mid = start + (end - start) / 2;
        if (arr[mid] == 1) start = mid + 1;
        else end = mid - 1;
    }
    return start; 
}

public int[] kWeakestRows(int[][] mat, int k) {
    // 2d array to store number of 1's and its corresponding index
    int[][] sorted = new int[mat.length][2];
    for (int i = 0; i < mat.length; i++) {
        int index = new Solution().binarySearch(mat[i]);
        sorted[i][0] = index;
        sorted[i][1] = i;
    }
    
    // Sort the 2d array in increasing order by comparing number of 1's
    Arrays.sort(sorted, new Comparator<int[]>() {
        public int compare(int[] a, int[] b) {
            return a[0] - b[0];
        }
    });
    
    // Make a new array to store first k weakest indices
    int[] result = new int[k];
    for (int i = 0; i < k; i++) {
        result[i] = sorted[i][1]; 
    }
    
    return result;
}

}
