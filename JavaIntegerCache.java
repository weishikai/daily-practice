/**
 * 整型的缓存机制 整型对象使用相同的对象引用实现了缓存和重用(适用于-128--+127)
 * 只适用于自动装箱,使用构造函数创建对象不适用
 * 
 *
 */
public class JavaIntegerCache {
	public static void main(String... args) {
		Integer integer1 = 3;
		Integer integer2 = 3;
		
		if(integer1 == integer2) {
			System.out.println("integer1 == integer2");
		} else {
			System.out.println("integer1 != integer2");
		}
		
		Integer integer3 = 300;
		Integer integer4 = 300;
		
		if(integer3 == integer4) {
			System.out.println("integer3 == integer4");
		} else {
			System.out.println("integer3 != integer4");
		}
	}
}
