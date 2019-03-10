# Java-Stream-Example

This project aims to demonstrate the use of Stream API in Java in order to perform various collection operations on Collections.

Introduced in Java 8, the Stream API is used to process collections of objects. A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.<br/>
The features of Java stream are –<br/>
1.A stream is not a data structure instead it takes input from the Collections, Arrays or I/O channels.<br/>
2.Streams don’t change the original data structure, they only provide the result as per the pipelined methods.<br/>
3.Each intermediate operation is lazily executed and returns a stream as a result, hence various intermediate operations can be pipelined. Terminal operations mark the end of the stream and return the result.<br/>

Intermediate Operations:<br/><br/>

1.map: The map method is used to map the items in the collection to other objects according to the Predicate passed as argument.<br/>
           List number = Arrays.asList(2,3,4,5);<br/>
           List square = number.stream().map(x->x*x).collect(Collectors.toList());<br/><br/>
           
2.filter: The filter method is used to select elements as per the Predicate passed as argument.<br/>
           List names = Arrays.asList("Reflection","Collection","Stream");<br/>
           List result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());<br/><br/>
           
3.sorted: The sorted method is used to sort the stream.<br/>
          List names = Arrays.asList("Reflection","Collection","Stream");<br/>
          List result = names.stream().sorted().collect(Collectors.toList());<br/><br/>
         
Terminal Operations:<br/><br/>

1.collect: The collect method is used to return the result of the intermediate operations performed on the stream.<br/>
          List number = Arrays.asList(2,3,4,5,3);<br/>
          Set square = number.stream().map(x->x*x).collect(Collectors.toSet());<br/><br/>

2.forEach: The forEach method is used to iterate through every element of the stream.<br/>
          List number = Arrays.asList(2,3,4,5);<br/>
          number.stream().map(x->x*x).forEach(y->System.out.println(y));<br/><br/>

3.reduce: The reduce method is used to reduce the elements of a stream to a single value.The reduce method takes a BinaryOperator as a parameter.<br/>
           List number = Arrays.asList(2,3,4,5);<br/>
           int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);<br/><br/>
