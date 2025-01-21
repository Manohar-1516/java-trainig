public class Day_10mergesort {
    public static void main(String[] args) {
        int nums1[]={1,2,3,4,5,10,143};
        int nums2[]={4,5,7,9,10,30,57};
        int m = nums1.length;
        int n= nums2.length;
    }
    public static void mergeArrays(int[] nums1,int m,int nums2[] ,int n) {
        int [] newArr=new int[m+n];
        int p1=0;
        int p2=0;
        int idx=0;
        while(p1<m&&p2<n){
            if(nums1[p1]<=nums2[p2]){
                newArr[idx]=nums1[p1];
                p1++;
            }else{
                newArr[idx]=nums2[p2];
                p2++;
            }
            idx++;
        }
        while(p1<m){
            newArr[idx]=nums1[p1];
            p1++;
            idx++;
        }
        while(p2<n){
            newArr[idx]=nums2[p2];
            p2++;
            idx++;
        }
    }
}
