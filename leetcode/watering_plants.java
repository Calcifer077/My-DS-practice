public class watering_plants {
    public static int wateringPlants(int[] plants, int capacity) {
        int res = 0;

        int temp = capacity;

        int i = -1;

        while (i < plants.length - 1) {
            if (temp >= plants[i + 1]) {
                res++;
                temp -= plants[i + 1];
                i++;
            } else {
                res += (i + 1) * 2;
                temp = capacity;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int plants[] = { 2, 2, 3, 3 };
        int capacity = 5;

        System.out.println(wateringPlants(plants, capacity));
    }
}
