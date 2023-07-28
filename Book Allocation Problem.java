import java.util.*;
public class Main {


    public static boolean ispossible(int [] arr, 
       int m, int mid){

           int maxval=0;

           for(int i=0; i<arr.length;i++){

             maxval=Math.max(maxval, arr[i]);
           }

           if(maxval>mid){
               return false;
           }

           int count=1;

           int sum=0;

           for(int i=0; i<arr.length;i++){

               sum+=arr[i];
               if(sum>mid){
                   count++;
                   sum=arr[i];
               }
           }

           if(count>m){
               return false;
           }else{
               return true;
           }
       }
    public static int BookAllo(int [] arr, int n, int m){

        int low=1;
        int high=(int)(1e9);

        int ans=0;

        while(low<=high){

            int mid= (low+high)/2;

            if(ispossible(arr, m, mid)==true){
              ans=mid;
               high=mid-1;
            }else{
                low=mid+1;
            }
        }

        return ans;


    }
    public static void main(String args[]) {
       
       Scanner s= new Scanner(System.in);

       int t= s.nextInt();

       while(t>0){
         
           int n= s.nextInt();

           int m= s.nextInt();

           int [] arr= new int [n];

           for(int i=0; i<n;i++){
                arr[i]= s.nextInt();

           }

           int ans= BookAllo(arr, n, m);
           System.out.println(ans);
           t--;
       }
    }
}
