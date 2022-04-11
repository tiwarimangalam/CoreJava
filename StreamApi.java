import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
    public static void evenList(ArrayList<Integer> list)
    {
        // This is to be done using stream api
        Stream<Integer> stream=list.stream();
        List<Integer> res= stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(res);
    }
    public static void emptyStream()
    {
        Stream<Object> s_obj=Stream.empty();// empty stream object
        String [] s={"Mangalam","Tiwari","Zemoso","Labs","Technologies"};
        //Stream<String > stream=Stream.of(s);
        s_obj=Stream.of(s);
        int i=0;
        s_obj.forEach(e ->
        {
            System.out.println(e);
        });
    }
    public static List<String>  namesStartingWith(List<String > stringList, char c)
    {
        List<String> res=stringList.stream().filter(e-> e.startsWith(String.valueOf(c))).collect(Collectors.toList());
        return res;
    }
    public static void main(String[] args) {
        // 1st way to create mutable list
        List<Integer> list1=new  ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        // 2nd way to create immutable list
        List<Integer> list2=List.of(1,2,3,4,5);
        evenList((ArrayList<Integer>) list1);
        emptyStream();
        List<String> stringList=new ArrayList<>();
        stringList.add("Mangalam");
        stringList.add("Tiwari");
        stringList.add("Zemoso");
        stringList.add("Technologies");
        List<String> res=namesStartingWith(stringList,'T');
        System.out.println(res);
    }
}
