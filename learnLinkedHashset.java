
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class learnLinkedHashset {
    public static void main(String[] args) {
        Set<Student> studentset = new HashSet<>();

        studentset.add(new Student("Ram",102));
        studentset.add(new Student("Ravi",10));
        studentset.add(new Student("Tisha",90));
        studentset.add(new Student("Ram",69));
        studentset.add(new Student("Anuj",100));

        System.out.println(studentset);

        
       /* Set<Integer> set = new LinkedHashSet<>();
        set.add(23);
        set.add(54);//operations under O(n)
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
        System.out.println(set);*/
    }
}
