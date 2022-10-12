public class Task2 {
    public static int sumWithoutSmallest(int[] numbers){
        int smallest = numbers[0];
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        return (sum - smallest);

    }
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int ans = sumWithoutSmallest(numbers);
        System.out.println(ans);
    }
}
