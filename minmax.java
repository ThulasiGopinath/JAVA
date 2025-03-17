public class minmax {
class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
    public static void main{

        public Pair<Integer, Integer> getMinMax(int[] arr) {
        
        
        if (arr == null || arr.length == 0) {
            return null; // Handle empty/null arrays
        }

        int minimum = arr[0];
        int maximum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }

        return new Pair<>(minimum, maximum);
  
        
    }
}
}

