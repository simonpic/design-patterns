package main.design.patterns.structural.composite;

import java.util.*;

interface ValueContainer extends Iterable<Integer> {}

public class Composite {
}

class SingleValue implements ValueContainer
{
  public int value;

  // please leave this constructor as-is
  public SingleValue(int value)
  {
    this.value = value;
  }

  @Override
  public Iterator<Integer> iterator() {
    return Collections.singleton(this.value).iterator();
  }
}

class ManyValues extends ArrayList<Integer> implements ValueContainer
{
}


class MyList extends ArrayList<ValueContainer>
{
  // please leave this constructor as-is
  public MyList(Collection<? extends ValueContainer> c)
  {
    super(c);
  }

  public int sum()
  {
    int sum = 0;
    for (ValueContainer c : this) {
      for (int n : c) {
        sum += n;
      }
    }
    return sum;
  }
}
