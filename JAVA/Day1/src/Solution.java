public class Solution {
    public static  void findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m= nums1.length;
        int n= nums2.length;

        int res[]= new int[m+n];

        for(int i=0; i<m ; i++){
            res[i]= nums1[i];
        }
        for(int j=0; j<n ; j++){
            res[m+j]= nums2[j];
        }
        for(int i=0; i<m+n ; i++){
            System.out.println(" "+res[i]);
        }       
        int median =0;
        if((m+n)%2==0){
            median= (((m+n)/2) + ((m+n)/2)+1)/2;
            System.out.println(res[median]);
        }
        else{
            median= ((m+n)/2);
            System.out.println(res[median]);
        }
        

    }
    public static void main(String[] args) {
        int ar1[] = {1,2,3};
        int ar2[] = {4,5,6};
        findMedianSortedArrays(ar1,ar2);
    }
}