class Solution {
public:
    int powerOfTwo(int  num){
        if(num==1){
            return 2;
        }
        num=num-1;
        return (2*powerOfTwo(num));
    }
    bool hasAllCodes(string s, int k) {
        if(k>s.size()){
            return false;
        }
        string st;
        unordered_map<string,bool> present;
        for(int i=0;i<=s.size()-k;i++){
            st = s.substr(i, k);
            if( present.count(st)>0){
                continue;
            }else{
                present[st]=true;
            }
        }
        int power = powerOfTwo(k);
        if(present.size()==power){
            return true;
        }
        return false;
    }
};