package $package$;

import java.util.stream.Collectors;
import java.util.stream.Stream;

class App {

  public static void main(String[] args) {
    String message = Stream
      .of("Hello", "World", "!")
      .map(String::toUpperCase)
      .collect(Collectors.joining(" "));

    System.out.println(message);
  }

}
