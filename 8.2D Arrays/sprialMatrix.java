import java.util.*;
public class sprialMatrix{
  public static void SprialMatrix(int matrix[][]){
    int sr=0;
    int sc=0;
    int er=matrix.length-1;
    int ec=matrix[0].length-1;

    while(sr<=er && sc<=ec){
      
      //top
      for(int j=sc;j<=ec;j++){
        System.out.print(matrix[sr][j]+" ");
      }

      //right
      for(int i=sr+1;i<=er;i++){
        System.out.print(matrix[i][ec]+" ");
      }

      //bottom
      for(int j=ec-1;j>=sc;j--){
        if(sr==er){
          break;
        }
        System.out.print(matrix[er][j]+" ");
      }

      //left
      for(int i=er-1;i>=sr+1;i--){
        if(sc==ec){
          break;
        }
        System.out.print(matrix[i][sc]+" ");
      }

      sr++;
      sc++;
      er--;
      ec--;
    }

  }
  public static void main (String [] args){
    Scanner sc=new Scanner (System.in);
    int matrix[][]=new int [2][4];
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
    SprialMatrix(matrix);

  }
}
