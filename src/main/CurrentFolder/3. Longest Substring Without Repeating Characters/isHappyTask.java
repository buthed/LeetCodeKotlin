//import java.util.HashMap;
//import java.util.HashSet;
//
//public class isHappyTask {
//    public static void main(String[] args) {
//        int n = 19;
//        System.out.println(isHappy(n));
//    }
//
//    public static int isHappy(int n) {
//        HashSet<Integer> set = new HashSet<>();
//    }
//
//    public int sumOfSqrt(int x) {
//        int buffer = x;
//        int count = (buffer==0)? 1:0;
//        int result = 0;
//        while (buffer!=0) {
//            count++;
//            buffer/=10;
//        }
//
//        int delCount = (int) Math.pow(10,count-1);
//        for (int i = count; i > 0; i--) {
//            int bufferPlus = (int) (x%delCount);
//            delCount *= 10;
//            x =(x- bufferPlus)/10;
//            result += Math.pow(bufferPlus,2);
//        }
//
//        return result;
//    }
//}
