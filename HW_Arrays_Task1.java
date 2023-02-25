package Consultation240223;

public class HW_Arrays_Task1 {
    public static void main(String[] args) {

        //Дан массив nums целых чисел и целое число target,
        // найдите индексы двух элементов массива, чтобы сумма этих значений
        // была равна target. Предполагается, что существует всегда только одно
        // решение и нельзя использовать один и тот же элемент массива дважды.

        int [] nums = {2, 7, 11, 15};
        int target = 9;
        findTwoIndex(nums,target);
    }
    public static void findTwoIndex(int [] nums, int target) {
        int a = 0;


        for (int i = 0, j = 0; i < nums.length; i++) {
            a = target - nums[i];
            if (a != nums[j] && i == nums.length -1) {
                j = j + 1;
                i = j - 1;
            }
            else  if (a == nums[j] && i !=j) {
                System.out.println("[" + i + "," + j + "]");
                j++;
            }

        }
    }
}
