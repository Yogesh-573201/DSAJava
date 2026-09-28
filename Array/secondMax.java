public class secondMax {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        System.out.println("Second Maximum = " + secondMax);
    }
    
}
