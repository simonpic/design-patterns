package main.design.patterns.creational.factory;

public class Point {
  private double x, y;

  private Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public static Point createCartesianPoint(double x, double y) {
    return new Point(x, y);
  }

  public static Point createPolarPoint(double rho, double theta) {
    return new Point(rho * Math.cos(theta), rho * Math.sin(theta));
  }

  @Override
  public String toString() {
    return "Point{" +
      "x=" + x +
      ", y=" + y +
      '}';
  }
}
