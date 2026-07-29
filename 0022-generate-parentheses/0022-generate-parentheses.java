class Solution {
    List<String> res =new ArrayList<>();
    int stack=0;
    void travel(int n,String s,int num,int level){
        System.out.println("s:"+s+" , level :"+level);

        if(num<0||num>stack||n<0){
            return;
        }
        if(num==0&&s.length()==(2*stack)&&!res.contains(s)){
            res.add(s);
        }
        level++;
        travel((n-1),(s+"("),(num+1),level);
        travel((n-1),(s+")"),(num-1),level);
    }
    public List<String> generateParenthesis(int n) {
        stack=n;
        travel((n*2),"",0,0);
        return res;
    }
}