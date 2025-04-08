
package ArrayList;

import java.util.*;
public class new_add {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(9);
        al.add(2);
        al.add(11);
        al.add(12);
        System.out.println(al);
        al.remove(2);
        System.out.println(al);
        al.set(2,45);
        System.out.println(al);
    }

}
