
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int newLength = arr1.length + arr2.length;
        int[] merged = new int[newLength];
        int position = 0;
        for(int i : arr1){
            merged[position] = i;
            position++;
        }
        for(int j : arr2){
            merged[position] = j;
            position++;
        }

        return merged;
    }
}
