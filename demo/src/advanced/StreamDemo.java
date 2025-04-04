package advanced;

import java.util.function.Predicate;
import java.util.stream.Stream;

class FindEven implements Predicate<Integer> {
	@Override
	public boolean test(Integer t) {
		 return  t % 2 == 0;
	}
}

public class StreamDemo {
	public static void main(String[] args) {
		 var s = Stream.of(10, 2, 3, 11, 7, 30, 35);
		 
		 // var ns = s.filter(new FindEven());
//		 var ns = s.filter( n -> n % 2 == 0);  // Predicate 
//		 var ss = ns.sorted();
//		 ss.forEach( v -> System.out.println(v));
		 
		 
		 s.filter( v -> v % 2 == 0)
		  .sorted()
		  .limit(2)
		  //.forEach(v -> System.out.println(v));
		  .forEach(System.out::println);
		 
	}

}
