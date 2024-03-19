import java.util.Arrays;

public class Sum_large_two{
    public static void main(String[] args) {
        int[] nummbers = {10, 51, 53, 39, 47, 44, 21};
        Arrays.sort(nummbers);
        int second_Large_number = nummbers[nummbers.length - 2];
        int third_Large_number = nummbers[nummbers.length - 3];
        int sum = second_Large_number + third_Large_number;
        System.out.println(sum);
    }
}
