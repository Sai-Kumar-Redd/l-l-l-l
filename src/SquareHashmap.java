import java.util.*;
public class SquareHashmap {
    public static HashMap<Integer,Integer>getSquare(List<Integer>list){
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(Integer n:list)
        {
            hm.put(n,n*n);
        }
        return hm;

    }
    public static void main(String[]args){
        List<Integer>list=new ArrayList<Integer>();
        list.add(5);
        list.add(6);
        list.add(89);
        list.add(6);
        list.remove(3);
        list.remove(0);
        HashMap<Integer,Integer> square= getSquare(list);
        square.entrySet().forEach(System.out::println);

    }

}




