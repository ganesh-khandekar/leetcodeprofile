class Solution {
    Boolean check (char ch){
        if(ch=='2'||ch=='4'||ch=='6'||ch=='8'||ch=='0'){
            return true;
        }
        return false;
    }
    public String largestOddNumber(String num) {

        StringBuilder  temp = new StringBuilder("");
        int i= num . length()-1;

        while(i>=0&&check(num.charAt(i))){
            i--;
        }
        for (int j=0;j<=i;j++){
            temp.append(num.charAt(j));
        }
        return temp.toString();
    }
}