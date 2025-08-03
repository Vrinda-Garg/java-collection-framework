
import java.util.Set;
import java.util.TreeSet;

public class LearnTreeset {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();// uses binary search tree
        set.add(23);
        set.add(54);
        set.add(32);// operations under O(log n)
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
