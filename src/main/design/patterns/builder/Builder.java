package main.design.patterns.builder;

public class Builder {
  public static void main(String[] args) {
    String myClass = new CodeBuilder("Person")
      .addField("name", "String")
      .addField("age", "int")
      .toString();

    System.out.println(myClass);
  }

  static class CodeBuilder {
    private StringBuilder sb = new StringBuilder();

    public CodeBuilder(String className) {
      sb
        .append(String.format("public class %s%n", className))
        .append("{\n");
    }

    public CodeBuilder addField(String name, String type) {
      sb.append(String.format("  public %s %s;%n", type, name));
      return this;
    }

    @Override
    public String toString() {
      return sb.append("}").toString();
    }
  }
}
