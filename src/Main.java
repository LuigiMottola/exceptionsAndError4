public class Main {
    public static void main(String[] args) {
        int[] integerArray = {1, 15, 6, 20, 9};

        arrayZeroDivider(integerArray, 15);
    }

    public static void arrayZeroDivider(int[] array, int index){
        try {
            System.out.println(array[index] / 0);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Catch error: " + e);
        } catch (ArithmeticException e){
            System.out.println("Catch error: " + e);
        }
    }
}
