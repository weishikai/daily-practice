# 目录
- [抽象类和抽象方法](#抽象类和抽象方法)

### 抽象类和抽象方法
- 抽象方法
```java
// 仅有声明而没有方法体
abastract void f();
// 包含抽象方法的类叫做抽象类,如果一个类包含一个或多个抽象方法(不需要所有的方法都是抽象的),该类必须被限定为抽象的
abastract class Instrument {
    private int i;
    public abstract void play(Note n);
    public String what(){return "Instrument"; }
    public abstract void adjust();
}
```

- 接口
```java
/**
 * interface这个关键字产生一个完全抽象的类,它根本就没有提供任何具体实现.它允许创建者确定方法名,参数列表和返回类型,但是没有任何方法体
 * 接口只提供了形式,而未提供任何具体实现
  */
public interface Instrument {
  int VALUE = 5;// static&final
  void play(Note n);// Automatically public
  void adjust();
}
class Wind implements Instrument {
  public void play(Note n) {
    System.out.println(this + ".play()"+n);
  }
  public String toString() { return "Wind"; }
  public void adjust() {
    System.out.println(this + ".adjust()");
  }
}
```

### 策略设计模式
```java
import java.util.*;
class Processor {
  public String name(){
    return getClass().getSimpleName();
  }
  Object process(Object input){ return input; }
}

class Upcase extends Processor {
  String process(Object input){ return ((String)input).toUpperCase(); }
}

class Downcase extends Processor {
  String process(Object input){ return ((String)input).toLowerCase(); }
}

class Splitter extends Processor {
  String process(Object input){ return Arrays.toString(((String)input).split(" ")); }
}

public class Apply {
  public static void process(Processor p,Object s) {
    sout("Using Processor " + p.name);
    sout(p.process(s));
    }
    public static String s ="Disagreement with beliefs by definition incorrect";
    
    psvm {
      process(new Upcase(),s);
      process(new Downcase(),s);
      process(new Splitter(),s);
    }
}
```
