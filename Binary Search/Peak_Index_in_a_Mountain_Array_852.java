// Peak Index in a Mountain Array
// lc link : https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class Peak_Index_in_a_Mountain_Array_852 {
    public int peakIndexInMountainArray(int[] arr) {
        int n= arr.length;
        if(n==1) return 0;
        if(arr[0]>arr[1]) return 0;
        if(arr[n-1] > arr[n-2]) return n-1;
        int l=1;
        int h=n-2;
        while(l<=h) {
            int mid = l+(h-l)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1])
                return mid;
            else if(arr[mid] > arr[mid-1])
                l = mid+1;
            else
                h = mid-1;
        }
        return -1;   
    }
    // time : O(logn)
    // space : O(1)
    public static void main(String[] args) {
        Peak_Index_in_a_Mountain_Array_852 obj = new Peak_Index_in_a_Mountain_Array_852();
        int[] arr = {0, 2, 1, 0};
        System.out.println(obj.peakIndexInMountainArray(arr));
    }
}
