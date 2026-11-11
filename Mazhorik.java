public class Mazhorik {

    public static void main(String[] args) {
        // Корректный пример
        int[] numsWithMajority = {2, 2, 1, 7, 1, 2, 2};
        System.out.println("Мажоритарный элемент: " + majorityElement(numsWithMajority));

        // Пример без мажоритарного элемента: 6 встречается 3 раза из 8
        int[] numsWithoutMajority = {1, 2, 3, 6, 6, 6, 7, 8};
        System.out.println("Мажоритарный элемент: " + majorityElement(numsWithoutMajority));
    }
    /**
     * Ищет мажоритарный элемент в массиве.
     * @return Мажоритарный элемент, или null, если его не существует.
     */
    public static Integer majorityElement(int[] nums) {
        //обработка пустых массивов
        if (nums == null || nums.length == 0) {
            System.out.println("Массив не может быть null или пустым");
        }

        int candidate = 0;
        int count = 0;

        //алгоритм Бойера-Мура
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        //обязательная проверка
        int actualCount = 0;
        for (int num : nums) {
            if (num == candidate) {
                actualCount++;
            }
        }

        // 4. Возврат результата только если элемент действительно мажоритарный
        if (actualCount > nums.length / 2) {
            return candidate;
        } else {
            return null;
        }
    }


}

