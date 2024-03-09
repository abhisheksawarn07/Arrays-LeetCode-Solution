class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n  = nums1.length;
        int m = nums2.length;
        int k = m+n;
        int nums3[] = new int[k];
        for(int i=0;i<n;i++){
            nums3[i] = nums1[i];
        }
        for(int i=0;i<m;i++){
            nums3[n] = nums2[i];
            n++;
        }
        Arrays.sort(nums3);
        int mid = k/2;
        double ans = 0.0;
        if(k%2!=0){
            ans = nums3[mid];
            return ans;
        }
        else{
            ans = (double)(nums3[mid] + nums3[mid-1])/2;
            return ans;
        }


    }
}