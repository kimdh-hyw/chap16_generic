package sec05_inheritanceofgeneric.EX02_InheritanceGenericMethod;

class Parent {
	<T extends Number> void print(T t) {
		System.out.println(t);
	}
}

class Child extends Parent {
	
}

public class InheritanceGenericMethod {
	public static void main(String[] args) {
		
		//#1. 부모클래스 제네릭메서드 이용
		Parent p = new Parent();
		p.<Integer>print(10);
		p.print(10);
		
		//#2. 자식클래스 제네릭메서드 이용
		Child c = new Child();
		c.<Double>print(5.8);
		c.print(5.8);
	}
}
