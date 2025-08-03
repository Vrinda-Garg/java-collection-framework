import java.util.Stack;

public class learnStack {
    public static void main(String[] args) {
        Stack<String> animal= new Stack<>();
        animal.push("lion");
        animal.push("cat");
        animal.push("dog");
        animal.push("horse");

        System.out.println(animal.peek());
        System.out.println(animal.pop());
        System.out.println(animal);

    }
}
