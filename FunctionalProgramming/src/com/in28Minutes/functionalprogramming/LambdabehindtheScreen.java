package com.in28Minutes.functionalprogramming;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

class EvenNumberPredicate implements Predicate<Integer>{

	@Override
	public boolean test(Integer number) {
		 
		return number%2==0;
	}
	
}

class SystemOutConsumer implements Consumer<Integer>{

	@Override
	public void accept(Integer number) {
		 System.out.println(number);
		
	}
	
}

class NumberSquareMapper implements Function<Integer,Integer>{

	@Override
	public Integer apply(Integer number) {
		// TODO Auto-generated method stub
		return number*number;
	}
	
}
public class LambdabehindtheScreen {

	//1.Storing functions in variables
	//2.Passing functions to methods 
	//3. Returning functions from methods
	
	public static void main(String[] args) {
        Predicate<? super Integer> evenpredicate = createEvenPredicate();
        Predicate<? super Integer> oddpredicate = createOddPredicate();
        
		List.of(20,10,90,46,77,32,13,31).
        stream().filter(evenpredicate).	
        map(e->e*e).
        forEach(e->System.out.println(e));
        
        
        System.out.println("===========================================================================");
        List.of(20,10,90,46,77,32,13,31).
        stream().
        filter(new EvenNumberPredicate()).
        map(new NumberSquareMapper()).
        forEach(new SystemOutConsumer());
        
       // forEach(e->System.out.println(e))
        //(Consumer<? super T> action)
       // void accept(T t);
        
        //filter(e->e%2==0)
        //Stream<T> filter(Predicate<? super T> predicate);
        // boolean test(T t);
        
        //map(e->e*e)
        //    <R> Stream<R> map(Function<? super T, ? extends R> mapper);
      //  R apply(T t);
        

	}

	private static Predicate<? super Integer> createOddPredicate() {
		return e->e%2==1;
	}

	private static Predicate<? super Integer> createEvenPredicate() {
		return e->e%2==0;
	}

}
