package fr.dauphine.javaavance.hafidkamilia.shapes;
import java.util.Arraylist;

/**
 * Hello world!
 *
 */
public class Point {
{
 
		 private double x ;
		 private double y ;
		 
		 Public Point(double x, double y ) {
		    this.x=x;
		    this.y=y;
		}
		 
		 public String toString () {
			 return "("+this.x+this.y")";
		 }	
		 
		 Public static void main (string[] args) {
                   Point p1 = new Point (1,2);
                   Point p2 = new Point (1,3);

                  System.out.println(p1.x + " " + p1.y);
                  
                  Arraylist<Point> list = new Arraylist <>();
                  list.add(p1);
                  System.out.println(list.indexOf(new Point(1.2)));
		}
}
                  