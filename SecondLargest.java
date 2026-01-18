public class SecondLargest {
    public static void main(String[] args) {
        int[] a = {10, 40, 20, 50, 30};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int n : a){
            if(n > first){
                second = first;
                first = n;
            } else if(n > second && n != first){
                second = n;
            }
        }

        System.out.println(second);
    }
}
