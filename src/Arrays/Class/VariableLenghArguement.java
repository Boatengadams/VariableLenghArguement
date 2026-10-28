// Question: How can a variable-length argument method sum any number of integers?
package Arrays.Class;
//Always the variable length arguement should be the last arguement
//car(String name, int... numbers)

public class VariableLenghArguement {
    public static void main(String[] args) {
        int [] numbs = {1,4,-3};
        System.out.println(sum(1,2,3,4,5,6,7,88,8));
        System.out.println(sum(numbs));
        System.out.println(sum(new int[] {3,5,8,-9}));

    }

    static int sum (int... numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
            sum += numbers[i];
        return sum;
    }
}
