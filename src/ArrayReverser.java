public class ArrayReverser {
    public static int[] returnReverse(int[] original){
        int[] newArray = new int[original.length];
        for(int i = 0; i < original.length; i++){
            newArray[original.length - 1 - i] = original[i];
        }
        return newArray;
    }

    public static void reverseInPlace(int[] original){
        for(int i = 0; i < original.length / 2; i++){
            int a = original[i];
            int b = original[original.length - i - 1];
            original[i] = b;
            original[original.length - i - 1] = a;
        }
    }

    public static void main(String[] args){
        int[] array = {1,2,3,4,5};
        for(int num : returnReverse(array)){
            System.out.print(num + ", ");
        }
        System.out.println();
        reverseInPlace(array);
        for(int num : array){
            System.out.print(num + ", ");
        }
    }


}
