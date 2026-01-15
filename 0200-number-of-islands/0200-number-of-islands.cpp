class Solution {
public:
void helper(int x,int y,vector<vector<char>>& grid,int n,int m){

       if(x<0 || y<0 || x>=n || y>=m ){
        return;
       }
       if(grid[x][y] != '1'){
        return;
       }

       grid[x][y] = '0';
       helper(x,y+1,grid,n,m);
       helper(x,y-1,grid,n,m);
       helper(x+1,y,grid,n,m);
       helper(x-1,y,grid,n,m);
    }
    int numIslands(vector<vector<char>>& grid) {
        int n =grid.size();
        int m =grid[0].size();
        int islands = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == '1'){
                    islands ++;
                    helper(i,j,grid,n,m);
                }
            }
        }
        return islands; 
    }

    
};