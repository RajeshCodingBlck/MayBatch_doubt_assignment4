import java.util.*;
public class Main {
    public static void main (String args[]) {

      Scanner s= new Scanner(System.in);

      int m= s.nextInt();
      int n= s.nextInt();

      int arr[][]= new int[m][n];

      for(int i=0; i<m;i++){

          for(int j=0; j<n;j++){

              arr[i][j]=s.nextInt();
          }
      }

      int row[]= new int[m];
      int col[]= new int [n];

      for(int i=0; i<m;i++){

          for(int j=0; j<n;j++){

              if(arr[i][j]==1){
                  col[j]=1;
              }
          }
      }

       for(int j=0; j<n;j++){

          for(int i=0; i<m;i++){

              if(arr[i][j]==1){
                  row[i]=1;
              }
          }
      }

      for(int i=0; i<m;i++){

          for(int j=0; j<n;j++){

              if(row[i]==1 || col[j]==1){
                  arr[i][j]=1;
              }

              System.out.print(arr[i][j]+" ");
          }
          System.out.println();
      }



    }
}
