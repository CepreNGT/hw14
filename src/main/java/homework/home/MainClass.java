package homework.home;

public class MainClass {
    public static int[] task1(int[] arr){
        int fourIndex = -1;
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            len += 1;
            if (arr[i] == 4){
                fourIndex = i;
                len = 0;
            }
        }
        if (fourIndex == -1){
            throw new RuntimeException();
        }
        int[] outputArray = new int[len];
        System.arraycopy(arr, fourIndex + 1, outputArray, 0, len);
        return outputArray;
    }
    public static boolean task2(int[] arr) {
        boolean four = false;
        boolean one = false;
        for (int i:arr) {
            if (i == 4){
                four = true;
            } else if(i == 1){
                one = true;
            } else {
                return false;
            }
        }
        return (one && four);
    }
}
