package entities;

public class Rectangle implements Shape{
	
	private Double width;
	private Double Height;
		
	public Rectangle(Double width, Double height) {
		this.width = width;
		Height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return Height;
	}

	public void setHeight(Double height) {
		Height = height;
	}

	@Override
	public double area() {
		return width * Height;
	}

}
