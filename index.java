import java.util.Arrays;

public class index {
    
    public static void main(String[] args) {
        int[] list = {1,3,4,1,2,4,5,63,1,23,3};
        // int[] list = {-1,-3};
        int num = 0;

        Arrays.sort(list);

        for (int v : list) {
            if (v < 0) {
            } else if (num + 1 == v) {
                num ++;
            } else if (num + 1 < v) {
                num ++;
                System.out.println(num);
                return;
            }
        }

        num ++;
        System.out.println(num);
    }
}
