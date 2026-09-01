class Solution {

    public int largestRectangleArea(int[] arr) {
        int n = arr.length;

        int[] nse = new int[n];
        nse[n - 1] = n; // PLS SAMAJ JAO (-1)

        Stack<Integer> st = new Stack<>();
        st.push(n - 1);

        for (int i = n - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if (st.size() == 0)
                nse[i] = n;
            else
                nse[i] = st.peek();

            st.push(i);
        }

        while (st.size() > 0) {
            st.pop();
        }

        int[] pse = new int[n];
        pse[0] = -1;
        st.push(0);

        for (int i = 1; i < n; i++) {
            while (st.size() > 0 && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if (st.size() == 0)
                pse[i] = -1;
            else
                pse[i] = st.peek();

            st.push(i);
        }

        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            int area = arr[i] * (nse[i] - pse[i] - 1);
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    public int maximalRectangle(char[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        // matrix ko hi heights ki tarah use kar rahe hain
        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                if (matrix[i][j] == '1') {

                    if (i == 0) {
                        matrix[i][j] = 1;
                    } else {
                        matrix[i][j] = (char) (matrix[i - 1][j] + 1);
                    }

                } else {
                    matrix[i][j] = 0;
                }
            }
        }

        int max = 0;

        for (char[] row : matrix) {

            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = row[j];
            }

            int area = largestRectangleArea(arr);
            max = Math.max(max, area);
        }

        return max;
    }
}