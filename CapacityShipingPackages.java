//LeetCode - 1011
public class CapacityShippingPackages {
        // Your Code goes here!

    public static void main(String[] args) {
        CapacityShippingPackages obj = new CapacityShippingPackages();
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;

        int result = obj.shipWithinDays(weights, days);
        System.out.println("Minimum capacity required: " + result);
    }

    public int getdays(int[] weights, int cap){
        int days=1, sum=0;
        for(int weight : weights){
            if(sum + weight <= cap){
                sum += weight;
            } else {
                sum = weight;
                days++;
            }
        }
        return days;
    }

    public int shipWithinDays(int[] weights, int days){
        int low = weights[0], high = 0;
        for(int weight : weights) {
            low = Math.max(weight,low);
            high += weight;
        }
        int ans = low;
        while(low <= high){
            int mid = (low+high) / 2;
            int day = getdays(weights, mid);
            if(day <= days){
                ans = mid;
                high = mid-1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    
}