package examples;

import java.util.List;
import java.util.function.Function;

public class Example {

    public Example() {

    }

    public static void test(String a, String b, int... c) {
    }

    public static final <R, T extends Object> void test(Function<? super T, ? extends List<? extends R>>
			transformer, String hello) {
	}

    public static class Foo {
        public Foo() {

        }

        public void foo(String bar) {

        }
    }

    public static class Bar extends Foo {
        public Bar() {
            
        }

        @Override
        public void foo(String bar) {

        }
    }

    public static <T> void main(String[] args) {
        test("Foo", "bar", 1, 2, 3, 4);

        String message = new String(new char[]{'5', '4', '3'});

        test((x) -> List.of(), "");

        System.out.println(message);

        var foo = new Bar();
        foo.foo("");

    }

    @FunctionalInterface
    public interface Baz {
        String method(String string);
    }
}