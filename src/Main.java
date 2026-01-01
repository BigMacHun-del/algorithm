import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 배열 안의 두 수를 선택해서 두 수의 합이 9가 되는 조합을 찾기
        int[] numbers = {2, 11, 7, 15};
        int target = 9;

        int[] result = findPairs(numbers, target);

//        int count = 0;
//        ArrayList<Integer> list1 = new ArrayList();
//        ArrayList<Integer> list2 = new ArrayList();
//
//        // 처음부터 탐색하는 완전탐색
//        for (int i = 0; i < numbers.length; i++){
//            for (int j = 0; j < numbers.length; j++){
//                if (numbers[i] + numbers[j]  == target){
//                    list1.add(numbers[i]);
//                    list2.add(numbers[j]);
//                    System.out.println("9가 되는 조합" + (count+1));
//                    System.out.println(list1.get(count) + " / " + list2.get(count));
//                    count++;
//                }
//            }
//        }
    }

    private static int[] findPairs(int[] numbers, int target) {
        //1. 배열 순회해서 첫 번째 수 선택
        for (int i=0; i<numbers.length; i++){
            //1.1 베열의 첫 번째 요소부터 순차적으로 선택
            int num1 = numbers[i];  // 첫 번째 수 선택

            //2. 두 번째 수 선택 및 검증 단계
            //2.1 첫 번째 수 다음 인덱스부터 배열 끝까지 순회해서 선택
            for (int j=0; i<numbers.length; j++){
                int num2 = number[j];
            }
        }
    }
}