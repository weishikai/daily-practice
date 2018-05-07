# 目录
- [抽象类和抽象方法](#抽象类和抽象方法)

### 抽象类和抽象方法
- 抽象方法
```java

abastract void f();// 仅有声明而没有方法体
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
// interface这个关键字产生一个完全抽象的类,它根本就没有提供任何具体实现
```
