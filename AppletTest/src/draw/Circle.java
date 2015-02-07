/**
 * 
 */
package draw;

/**
 * @author frank
 *
 */
public class Circle {
	private int x, y, radius;
	
	/**
	 * 
	 */
	public Circle(){
		x=0;
		y=0;
		radius=0;
	}
	/**
	 * @param x
	 * @param y
	 * @param radius
	 */
	public Circle(int x, int y, int radius){
		this.radius = radius;
		this.x = x;
		this.y = y;
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return this.x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return this.y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * @return the radius
	 */
	public int getRadius() {
		return this.radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}

}
