package chap10;

public class TestBox {

	Integer i;
	int j;  
	
	public TestBox(int i) {
		// this refers to the Integer i of TestBox, set it equal to the int i parameter of the constructor
		this.i = new Integer(i);
	}
	
	public static void main(String[] args) {
		TestBox t = new TestBox(2);
		t.go();
	}
	
	public void go() {
		j=i.intValue();
		System.out.println(j);
		System.out.println(i);
		
	}
}
