class Solution {
    public List<Integer> intersection(int[][] nums) {
        // Sort every array
        for (int[] arr : nums) {
            Arrays.sort(arr);
        }

        // Current intersection = first array
        List<Integer> common = new ArrayList<>();
        for (int x : nums[0]) {
            common.add(x);
        }

        // Intersect with remaining arrays one by one
        for (int i = 1; i < nums.length; i++) {

            List<Integer> temp = new ArrayList<>();

            int p1 = 0, p2 = 0;

            while (p1 < common.size() && p2 < nums[i].length) {

                if (common.get(p1) == nums[i][p2]) {
                    temp.add(common.get(p1));
                    p1++;
                    p2++;
                }
                else if (common.get(p1) < nums[i][p2]) {
                    p1++;
                }
                else {
                    p2++;
                }
            }

            common = temp;
        }

        return common;
    }
}