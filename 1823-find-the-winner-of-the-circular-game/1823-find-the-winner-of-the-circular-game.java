class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=n;i++){
            q.add(i);
        }
        while(q.size()>1){
            //q-1 element ko add krna hai remove krna hai add krna hai remove krna hai 
            for(int i=1;i<=k-1;i++){
                q.add(q.remove());
            }
            q.remove(); // to remove every kth element 
        }
        return q.peek();
    }
}