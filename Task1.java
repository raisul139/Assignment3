public class Task1 {
    static int[] ran = {1,2,3,4,5,6,7,8,9,10};

    public static void main(String[] args) {
        System.out.print("Every element at an even index : ");
        for (int i = 0; i < 10; i += 2){
            System.out.print(ran[i]+ " ");
        }
        System.out.println();
        System.out.print("Every even element: ");
        for (int i = 0; i < 10; i++){
            if (ran[i]%2 == 0){
                System.out.print(ran[i] + " ");
            }
        }
        System.out.println();
        System.out.print("All elements in reverse order: ");
        for (int i = ran.length - 1; i >= 0; i--){
            System.out.print(ran[i] + " ");
        }
        System.out.println();
        System.out.println("the first: " + ran[0] +  " the last element: " + ran[ran.length - 1]);

    }
}
