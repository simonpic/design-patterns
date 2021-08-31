package main.design.patterns.creational.singleton;

public class MonoState {
  private static String name;
  private static int age;

  public static String getName() {
    return name;
  }

  public static void setName(String name) {
    MonoState.name = name;
  }

  public static int getAge() {
    return age;
  }

  public static void setAge(int age) {
    MonoState.age = age;
  }
}
