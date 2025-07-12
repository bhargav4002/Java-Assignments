class Assignment6{
    public static void main(String[]args){
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.print( "Diagonal elements ");
        for (int i=0;i<matrix.length;i++){
            for(int j=0; j<matrix[i].length;j++){
                if(i==j)
                {
                    System.out.print( matrix[i][i]+ " ");
                }
                
            }
        }
    
    }
}