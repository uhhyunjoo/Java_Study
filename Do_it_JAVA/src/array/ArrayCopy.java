package array;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 40, 50};
        int[] array2 = {1,2,3,4,5};

        System.arraycopy(array1, 1, array2, 1, 3);
        // 복사할 배열, 복사할 첫 위치, 대상 배열, 붙여넣을 첫 위치, 복사할 요소 개수

        for(int num : array2){
            System.out.println(num);
        }
    }
}
