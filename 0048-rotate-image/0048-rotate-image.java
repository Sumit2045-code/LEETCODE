class Solution {
    public void rotate(int[][] arr) {
      for(int i =1;i<arr.length;i++){
            for(int j = 0;j<i;j++){// yha pe hmne j<arr.length-1 ke jgh j<i isliye kiya kyuki hme sirf lower triangular matrix hi traverse krna hai nhi to agr complete matrix travel karenge to double swap ho jayega aur hmari matrix transpose nhi ho payegi
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //REVERSE EACH ROW
        for(int i = 0;i<arr.length;i++){
            int stCol = 0, endCol = arr[0].length-1;
            while(stCol<endCol){
                int temp=arr[i][stCol];
                arr[i][stCol]=arr[i][endCol];
                arr[i][endCol]=temp;
                stCol++;
                endCol--;
            }
        }  
    }
}