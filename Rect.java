class Rect{
	int width;
	int height;

	public void setWidth(int width){
		this.width = width;
	}

	public int getWidth(){
		return width;
	}	

	public void setHeight(int height){
		this.height = height;
	}

	public int getHeight(){
		return height;
	}

	pulbic int getArea(){
		return width * height;
	}
}