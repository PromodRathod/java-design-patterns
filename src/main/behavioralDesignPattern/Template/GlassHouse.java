package main.behavioralDesignPattern.Template;

public class GlassHouse extends BuildingHouse {

	@Override
	public void buildWindows() {
		System.out.println("Building Glass Window");
	}

	@Override
	public void buildWalls() {
		System.out.println("Building Glass Walls");
	}

}
