/*Calculate area of rectangle and triangle using
single inheritance*/

package oops2;

public class Assignment3 {

	public static void main(String[] args) {
		Area a = new Rectangle();
		a.height=10;
		a.base=8;
		System.out.println(a.calculateArea());
		
		Area b = new Triangle();
		b.height=10;
		b.base=8;
		System.out.println(b.calculateArea());
	}
}



class Area{
	
	int base;
	int height;
	
	public float calculateArea(){
	return 0;
}
}


class Rectangle extends Area{
	
	public float calculateArea(){
		return base*height;
	}
}

class Triangle extends Area{
	
	public float calculateArea(){
		return (float) (0.5*base*height);
	}
}
