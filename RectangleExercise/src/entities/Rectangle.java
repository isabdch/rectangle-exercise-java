package entities;

public class Rectangle {
	public double width;
	public double height;

	public double area() {
		return this.width * this.height;
	};

	public double perimeter() {
		return 2 * (this.width + this.height);
	};

	public double diagonal() {
		return Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2));
	};
	
	public String toString() {
		return String.format("AREA = %.2f%nPERIMETER = %.2f%nDIAGONAL = %.2f", this.area(), this.perimeter(), this.diagonal());
	};
}
