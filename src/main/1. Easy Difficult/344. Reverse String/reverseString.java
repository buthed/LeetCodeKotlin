public class reverseString {
    public static void main(String[] args) {
        char[] s1 = {'h','e','l','l','o'};
        char[] s2 = {'H','a','n','n','a','h'};
        char[] s3 = {'h','e','l','p'};
        reverseString(s1);

//        System.out.println(reverseString(s1)); // Output: 0
//        System.out.println(reverseString(s2)); // Output: 2
//        System.out.println(reverseString(s3)); // Output: -1

    }
    public static void reverseString(char[] s) {
        for(int i = 0; i != s.length/2; i++) {
            char sym = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = sym;
        }
        return;
    }
}


