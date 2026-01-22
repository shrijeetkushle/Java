import java.util.*;
public class diagonalSum{
  public static void DiagonalSum(int matrix[][]){

    //method 1 O(n^2)
    int sum=0;
   for(int i=0;i<matrix.length;i++){
    for(int j=0;j<matrix[0].length;j++){
    if(i==j){
     sum+=matrix[i][j];
    }else if(i+j==matrix.length-1){
      sum+=matrix[i][j];
    }

    }
   }


   //Method 2 O(n)
  for(int i=0;i<matrix.length;i++){

    //pd
    sum+=matrix[i][i];

    //sd
    if(i!=matrix.length-1-i){
    sum+=matrix[i][matrix.length-i-1];
    }
  }


   System.out.print(sum);
  }
  public static void main (String [] args){
    Scanner sc=new Scanner (System.in);
    int matrix[][]=new int [3][3];
    int n=matrix.length,m=matrix[0].length;
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        matrix[i][j]=sc.nextInt();
      }
    }

    //output

    for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
      System.out.print(matrix[i][j]+" ");
      }
      System.out.println();
    }
    DiagonalSum(matrix);

  }
}
