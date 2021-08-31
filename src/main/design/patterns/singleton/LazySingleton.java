package main.design.patterns.singleton;

public class LazySingleton {

  private static volatile LazySingleton instance;

  private LazySingleton() { }

  public static LazySingleton getInstance() {
    if (instance == null) {
      instance = new LazySingleton();
    }
    return instance;
  }

  public static LazySingleton getInstanceDoubleCheckLock() {
    if (instance == null) {
      synchronized (LazySingleton.class) {
        if (instance == null) {
          instance = new LazySingleton();
        }
      }
    }
    return instance;
  }

}
