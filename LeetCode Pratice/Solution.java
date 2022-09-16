    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution  {
    public int firstBadVersion(int n) {
    int left = 1;
    int right = n;
    while (left < right) {
        int mid = left + (right - left) / 2;
        if (firstBadVersion(mid)==1) {
            right = mid;
        } else {
            left = mid + 1;
        }
    }
    return left;
    }
}

