package com.oops.abtraction;

public class ShapeMainClass {

		public static void main(String[] args) {
			Circle c1 = new Circle();
			
			c1.setColor(null);
			c1.setFilled(false);
			c1.getColor();
			c1.isFilled();
			
			Rectangle r1 = new Rectangle(0, 0, 0, null, false);
			r1.setColor(null);
			r1.setFilled(false);
			r1.getColor();
			r1.isFilled();
			
			Square s1 =new Square(0, 0, 0, 0, null, false);
			s1.setColor(null);
			s1.setFilled(false);
			s1.getColor();
			s1.isFilled();
			

	}
}
