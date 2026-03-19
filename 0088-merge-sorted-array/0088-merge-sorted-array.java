class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] o = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                o[k] = nums1[i];
                i++;
            } else {
                o[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            o[k] = nums1[i];
            i++;
            k++;
        }

        while (j < n) {
            o[k] = nums2[j];
            j++;
            k++;
        }

        // copy back to nums1
        for (int x = 0; x < m + n; x++) {
            nums1[x] = o[x];
        }
    }
}