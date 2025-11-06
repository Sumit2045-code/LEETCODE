class Solution {
public:
    void helper(int n,vector<string> &ans,string &curr){
       if (n==0){
           ans.push_back(curr);
           return;
        }

        if(curr.empty() ||curr.back() != '0'){
        curr.push_back('0');
        helper(n-1,ans,curr);
        curr.pop_back();
        }
        
        curr.push_back('1');
        helper(n-1,ans,curr);
        curr.pop_back();
        
   }
    vector<string> validStrings(int n) {
      vector<string> ans;
      string curr="";
      helper(n,ans,curr);
      
      return ans;
    }
};