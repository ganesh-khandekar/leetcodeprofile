class Solution {
        private int[][] matrix =new int[50][50];
        int at=0,number=0;
    
    public int totalNQueens(int n) {
        this.number =n;
         return placeNQueen(0);
    }    
      public boolean isposible(int row,int col,int number){
        for (int i=row-1; i >=0  ; i--) {
            if(matrix[i][col]==1){

                return true;
            }
        }
        // diagnolly left
        for (int i=row-1,j=col-1; i >=0 && j >=0 ; i--,j--) {
            if(matrix[i][j]==1){
                return true;
            }
        }

        // dignolly right
        for (int i=row-1,j=col+1; i >=0 && j <number ; i--,j++) {
            if(matrix[i][j]==1){
                return true;
            }
        }
        return false;

    }




    int placeNQueen(int row ){
        //base case
        if (number ==row){
            at++;

        }  
        
        //possible place of queen
        for (int col = 0; col <number ; col++) {
            if(!isposible(row,col,number)){
                matrix[row][col]=1;
                placeNQueen(++row);
                row--;
                matrix[row][col]=0;
            }else{
                matrix[row][col]=0;
            }
        }

        return at;
    }
   
}
