class RandomArray {
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = 1000 + (int)(Math.random() * 9000);
        return arr;
    }
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int n : numbers) {
            if (n < min) min = n;
            if (n > max) max = n;
            sum += n;
        }
        return new double[]{(double)sum/numbers.length, min, max};
    }
    public static void main(String[] args) {
        int[] arr = generate4DigitRandomArray(5);
        double[] result = findAverageMinMax(arr);
        System.out.print("Numbers: ");
        for (int n : arr) System.out.print(n + " ");
        System.out.println("\nAverage: " + result[0] + " Min: " + result[1] + " Max: " + result[2]);
    }
}
