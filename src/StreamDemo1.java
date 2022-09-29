import java.util.stream.Stream;
public class StreamDemo1 {
    public static void main(String[]args){
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        for(int i:arr) {
            if (i % 2 == 0) sum += i;
        }
        System.out.println("The sum  of Evens:"+sum);
        }
      //  for(int i:arr)
        //{
        //if(i%2 == 1) sum+=i;
        //}
        //System.out.println("The sum of odd"+sum);
}

