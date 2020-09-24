public class Main {
    public static void main(String[] args) {
        GenericStack<Integer> integers = new GenericStack<>();
        Integer[] numbers = {1, 2, 3, 4};

        System.out.println("Before: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element " + i + " : " + numbers[i]);
        }

        for (int i = 0; i < numbers.length; i++) {
            integers.push(numbers[i]);
        }

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = integers.pop();
        }

        System.out.println("After: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element " + i + " : " + numbers[i]);
        }
    }
}

