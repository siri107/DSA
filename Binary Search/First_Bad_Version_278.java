// First Bad Version
// leeode link : https://leetcode.com/problems/first-bad-version/description/
class VersionControl {

    static int badVersion = 4;

    static boolean isBadVersion(int version) {
        return version >= badVersion;
    }
}
public class First_Bad_Version_278 extends VersionControl {
    // approach 1: using linear search
    // time: O(n)
    // space : O(1)
    public static int firstBadVersion(int n) {
        for( int i=1; i<=n ;i++ ) {
            if(isBadVersion(i)) {
                return i;
            }
        }
        return 1;
    }
    // approach 2 : binary search
    // time :  O(logn)
    // space : O(1)
    public static int firstBadVersion1(int n) {
        int l=1;
        int r=n;
        int ans=1;
        while(l<=r) {
            int mid= l+ (r-l) /2 ;
            if(isBadVersion(mid)) {
                ans= mid;
                r = mid-1;
            }
            else 
                l = mid+1;
        } 
        return ans; 
    }
    public static void main( String args[]) {
        int n= 5;
        System.out.println(firstBadVersion(n));
        System.out.println(firstBadVersion1(n));

    }
}
