
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List <Integer>list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        List <Integer>newlist = new ArrayList();
        newlist.add(20);
        newlist.add(30);
        System.out.println(newlist);
        list.addAll(newlist);
        System.out.println(list);
        list.remove(1);
        list.get(2);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println( "element is " + list.get(i));

            for(Integer element:list){
                System.out.println("foreach elemnt is " + element);
            }

            Iterator<Integer> it = list.iterator();
            while(it.hasNext()){
                System.out.println("iterator" + it.next());
            }
        }
    } }