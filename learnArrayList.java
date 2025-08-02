import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
 class learnArrayList {
     public static void main(String[] args) {
        /* ArrayList<String> StudentName = new ArrayList<>();
         StudentName.add("ram");
         StudentName.add("Rakesh");
         StudentName.add("Vidhi");
         StudentName.add("Ved");
         System.out.println(StudentName);*/

         List<Integer> list = new ArrayList<>();
         list.add(1);
         list.add(2);
         list.add(3);
         System.out.println(list);
         list.add(4);
         System.out.println(list);
         list.add(1, 50);
         list.add(6);
         System.out.println(list);

         List<Integer> newList = new ArrayList<>();
         newList.add(50);
         newList.add(160);
         list.addAll(newList);
         System.out.println(list);
         System.out.println(list.get(1));
         list.remove(1);
         list.remove(Integer.valueOf(6));
         System.out.println(list);
       for(int i=0;i<list.size();i++)
           System.out.println(i);
       for(Integer el:list)
           System.out.println(el);
         Iterator<Integer> it= list.iterator();
         while(it.hasNext())
         {
             System.out.println(it.next());

         }
         it.remove();
         System.out.println(list);
     }
     }


