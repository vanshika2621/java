public class ArraySum {
    public static void main(String[] args) {
        int[] a = {2,4,6,8};
        int sum = 0;

        for(int i : a)
            sum += i;

        System.out.println(sum);
    }
}
