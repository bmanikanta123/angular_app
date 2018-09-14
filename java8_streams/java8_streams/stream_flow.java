package com.java8_streams;

import java.util.stream.Stream;

public class stream_flow {
    public static void main(String[] args) {
        //explain about laziness, loop fusion technique,explain if they are not lazy

        /*
        1.Firstly, an important aspect to understand that the Stream execution, as I had mentioned earlier, is lazy.
        The actual execution of the Stream does not start till the terminal operation is encountered.
        So, one can have ‘n’ intermediate operations in a Stream pipeline, but the execution of these ‘n’ operations does not start
        unless the terminal operation (forEach() in our case) is invoked.

        2.Secondly, if you notice closely – only 5 even integers are generated, rather than a huge list.
        Lazy execution of Streams allows the implementing logic to ‘understand’ that there is a limit(5) in the sequence of operations,
        and hence, finally only 5 elements will be used. So, the Stream never generates more than 5 elements.
        This optimization is technically named as Short-Circuiting!

        3.what we see is that the three intermediate operations generate() – map() – println using forEach() have been logically joined together
        to constitute a single pass, i.e. they are executed in order for each of the individual integers generated.
        This joining together of operations in a single pass is an optimization technique known as loop fusion

        */
        Stream<Integer> integers = Stream.iterate(0,n->n+1);
        Stream<Integer> numDouble = integers.map(n-> {
            System.out.println("Map:"+n);
            return n*n;
        });

        Stream<Integer> limit = numDouble.limit(10);

        limit.forEach(n-> System.out.println(n));



        /*Stream.iterate(0,n->n+1).map(n-> {
            System.out.println("Map:"+n);
            return n*n;
        }).limit(10).forEach(n-> System.out.println(n));*/
    }
}
