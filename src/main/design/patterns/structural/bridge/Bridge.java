package main.design.patterns.structural.bridge;

abstract class Shape {
  private final Renderer renderer;

  public Shape(Renderer renderer) {
    this.renderer = renderer;
  }

  public abstract String getName();

  public String toString() {
    return String.format("Drawing %s as %s", getName(), renderer.whatToRenderAs());
  }
}

class Triangle extends Shape {
  public Triangle(Renderer renderer) {
    super(renderer);
  }

  @Override
  public String getName() {
    return "Triangle";
  }
}

class Square extends Shape {

  public Square(Renderer renderer) {
    super(renderer);
  }

  @Override
  public String getName() {
    return "Square";
  }
}

interface Renderer {
  String whatToRenderAs();
}

class VectorRenderer implements Renderer {

  @Override
  public String whatToRenderAs() {
    return "lines";
  }
}

class RasterRenderer implements  Renderer {
  @Override
  public String whatToRenderAs() {
    return "pixels";
  }
}

// imagine VectorTriangle and RasterTriangle are here too
public class Bridge {
  public static void main(String[] args) {
    System.out.println(new Triangle(new VectorRenderer()));
    System.out.println(new Square(new RasterRenderer()));
  }
}