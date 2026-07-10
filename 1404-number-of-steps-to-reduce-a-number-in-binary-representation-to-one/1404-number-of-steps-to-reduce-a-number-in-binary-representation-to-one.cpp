class Solution {
public:
    int numSteps(string s) {
        int op=0,flag=0;
        for(int i=s.size()-1;i>0;i--){
            if((flag==1&&s[i]=='1')||(flag==0&&s[i]=='0')){
                op++;
               s.pop_back();
            }else if ((flag==1&&s[i]=='0')||(flag==0&&s[i]=='1')){
                op=op+2;
               s.pop_back();
               flag=1;
            }
        }
        if(flag==1&&s.size()==1){
            op++;
        }
        return op;
    }
};