class Solution {
public:
    void helper(string &tiles, vector<bool> &visited, int &count, string curr) {
        for (int i = 0; i < tiles.size(); i++) {
            if (visited[i]) continue;
            if (i > 0 && tiles[i] == tiles[i - 1] && visited[i-1]!=true ) continue;

            visited[i] = true;
            count++;
            helper(tiles, visited, count, curr + tiles[i]);
            visited[i] = false;
        }
    }
    int numTilePossibilities(string tiles) {
        sort(tiles.begin(), tiles.end());
        vector<bool> visited(tiles.size(), false);
        int count = 0;
        helper(tiles, visited, count, "");
        return count;
    }
};
