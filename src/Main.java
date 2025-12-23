import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 배열 안의 두 수를 선택해서 두 수의 합이 9가 되는 조합을 찾기
        int[] numbers = {2, 11, 7, 15};
        int target = 9;
        int count = 0;
        ArrayList<Integer> list1 = new ArrayList();
        ArrayList<Integer> list2 = new ArrayList();

        // 처음부터 탐색하는 완전탐색
        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers.length; j++){
                if (numbers[i] + numbers[j]  == target){
                    list1.add(numbers[i]);
                    list2.add(numbers[j]);
                    System.out.println("9가 되는 조합" + (count+1));
                    System.out.println(list1.get(count) + " / " + list2.get(count));
                    count++;
                }
            }
        }
    }
}