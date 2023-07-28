import java.util.*;
public class Main {
    public static boolean ispossible(int [] arr
    , int mid, int k){

        int max_val=0;

        for(int i=0; i<arr.length;i++){

            max_val= Math.max(arr[i], max_val);

        }

        if(max_val>mid){
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

          if(count>k){
              return false;
          }else{
              return true;
          }
    }
    public static int Paint(int [] arr, int n, int k){

        int low=1;
        int high=(int)(1e9);
         int ans=0;
         
        while(low<=high){

            int mid= low+(high-low)/2;

            if(ispossible(arr, mid,k)==true){
                ans= mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        return ans;

    }
    public static void main(String args[]) {
       
        Scanner s= new Scanner(System.in);

        int k= s.nextInt();

        int n= s.nextInt();

        int arr[]= new int[n];

        for(int i=0; i<n;i++){
            arr[i]= s.nextInt();
        }

        int ans= Paint(arr, n, k);

        System.out.println(ans);


    }
}
