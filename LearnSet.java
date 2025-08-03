import java.util.HashSet;
import java.util.Set;

public class LearnSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(23);
        set.add(54);
        set.add(32);
        set.add(98);
        set.add(65);
        set.add(54);
//  the order of the elements is not maintained
        System.out.println(set);
        set.remove(54);

        System.out.println(set);

        System.out.println(set.contains(100));
        System.out.println(set.isEmpty());
        System.out.println(set.size());

        set.clear();
        System.out.println(set);
    }

}
