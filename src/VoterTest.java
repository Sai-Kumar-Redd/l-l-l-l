/*import java.security.KeyStore;
import java.util.*;
 public class VoterTest {
     public static List<Integer>votersList(Map<Integer,Integer>hm){
         List<Integer>list=new ArrayList<Integer>();
         for(KeyStore.Entry<Integer,Integer> age : hm.keyStore()) {
             if (age.getValue() >= 18)
                 list.add(age.getKey());
         }
         return list;

         }
        public static void main(String[] args){
         Map<Integer,Integer>hm=new HashMap<Integer,Integer>();
         hm.put(809,18);
         hm.put(900,78);
         hm.put(7888,67);
         List <Integer> eligible = votersList(hm);
         eligible.forEach(System.out::println);
     }
}*/
