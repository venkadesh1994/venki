package Practice;

import java.util.ArrayList;
import java.util.List;

public class Collection {
public static void main(String[] args) {
List<Object> li =new ArrayList<>();

li.add(10);
li.add("Java");
li.add(12.98);
li.add('3');
li.add(true);
li.add(10);
System.out.println(li);
li.add(4,60 );
System.out.println(li);

boolean contains = li.contains(60);
System.out.println(contains);

Object object = li.get(2);
System.out.println(object);

int indexOf = li.indexOf(3);
System.out.println(indexOf);

 li.remove(2);
System.out.println(li);

li.clear();
System.out.println(li);
}
}
