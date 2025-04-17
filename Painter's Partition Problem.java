//Painter's partiton problem gfg II
class Solution {
    
    public int getTime(int[] a, int n, int times, int k){
        
        int sum = 0, paint = 1;
        for(int i = 0; i < n; i++){
            if(sum + a[i] > times){
                paint++;
                sum = a[i];
            } else {
                sum += a[i];
            }
        }
        
        return paint;
    }
    
    public int minTime(int[] arr, int k) {
        
        int low = 0, high = 0, n = arr.length;
        
        for(int i = 0; i < n; i++){
            low = Math.max(low, arr[i]);
            high = high + arr[i];
        }
        
        int ans = -1;
        
        while(low <= high){
            int mid = (low + high) / 2;
            int paint = getTime(arr,n,mid,k);
            if(paint <= k){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return ans;
    }
}
