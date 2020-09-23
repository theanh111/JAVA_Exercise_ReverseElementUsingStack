public class Main {
    public static void main(String[] args) {
        GenericStack<Integer> integers = new GenericStack<>();
        Integer[] numbers = {1, 2, 3, 4};

        System.out.println("Before: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element " + i + " : " + numbers[i]);
        }

        integers.push(numbers[0]);
        integers.push(numbers[1]);
        integers.push(numbers[2]);
        integers.push(numbers[3]);

        numbers[0] = integers.pop();
        numbers[1] = integers.pop();
        numbers[2] = integers.pop();
        numbers[3] = integers.pop();

        System.out.println("After: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element " + i + " : " + numbers[i]);
        }
    }
}

