package main.design.patterns.factory;

public class Main {
  public static void main(String[] args) {
    Point cartesianPoint = Point.createCartesianPoint(3, 4);
    Point polarPoint = Point.createPolarPoint(4, 5);
    System.out.println(cartesianPoint);
    System.out.println(polarPoint);
  }
}
