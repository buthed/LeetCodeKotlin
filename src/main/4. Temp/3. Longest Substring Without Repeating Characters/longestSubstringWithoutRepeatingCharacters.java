import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public static int addDigits(int num) {
    int numTemp = num;
    int result = 0;
    int numLength = 0;
    int var = 0;
    do {
        numLength = String.valueOf(numTemp).length();
    for (int i = numLength+1, j =10; i > 1 ; i++, j=j*10) {
        var = (numTemp-result)%j;
        var = var/10;
        result = + var;
    }

    } while (String.valueOf(result).length() != 1);
    return result;
}