public class sqrtOfX {
    public static void main(String[] args) {
        int x = 9;
        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x) {
        int low = 1;
        int height = x;
        while (low<=height) {
            int mid = low+(height-low)/2;

            if (mid == x/mid) return mid;
            else if (mid<x/mid) {
                low = mid+1;
            }
            else{
                height = mid-1;
            }

        }
        return height;
    }
}
