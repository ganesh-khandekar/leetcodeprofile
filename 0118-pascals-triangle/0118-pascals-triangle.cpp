class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> ver;
        for(int i=0;i<numRows;i++){
            vector<int> temp;
            for(int j=0;j<=i;j++){
                if(i==j||j==0){
                    temp.push_back(1);
                }else{
                    temp.push_back(ver[i-1][j-1]+ver[i-1][j]);
                }
                
            }
            ver.push_back(temp);
        }
        return ver;
    }
};