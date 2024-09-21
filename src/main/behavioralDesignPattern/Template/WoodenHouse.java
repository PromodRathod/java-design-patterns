package main.behavioralDesignPattern.Template;

public class WoodenHouse extends BuildingHouse {

	@Override
	public void buildWindows() {
		System.out.println("Building Sliding Wooden Window");
	}

	@Override
	public void buildWalls() {
		System.out.println("Building Wooden Walls");
	}

}