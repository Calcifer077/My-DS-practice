import java.util.*;

public class rank_transform_of_an_array {
    public static int[] arrayRankTransform(int[] arr) {
        int res[] = arr.clone();
        HashMap<Integer, Integer> map = new HashMap<>();

        Arrays.sort(arr);
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], count);
                count++;
            }
        }

        for (int i = 0; i < res.length; i++) {
            if (map.containsKey(res[i])) {
                arr[i] = map.get(res[i]);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 37, 12, 28, 9, 100, 56, 80, 5, 12 };
        arrayRankTransform(arr);
    }

}
