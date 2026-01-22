import java.util.*;
public class staircaseSearch{
  public static void staircase(int matrix[][],int key){
   int row=0,colum=matrix[0].length-1;
   while(row<matrix.length && colum>=0){
    if(matrix[row][colum]==key){
      System.out.print("("+row+","+colum+")");
      return;
    }
    else if(key<matrix[row][colum]){
      colum--;
    }else{
      row++;
    }

   }
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
    int key=4;
    staircase(matrix,key);

  }
}
