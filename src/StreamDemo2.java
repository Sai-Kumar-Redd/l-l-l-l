import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[]args) {
        String[] strings = {"hi", "hello", "you", "bye", "me", "there","a"};
        Stream.of(strings).distinct().filter(s->s.charAt(0)=='t').sorted().map(String::toUpperCase).forEach(System.out::println);

    }
}
