package main.behavioralDesignPattern.Template;

public abstract class BuildingHouse {

	public final void buildingHouse() {
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
	}
	
	public void buildFoundation() {
		System.out.println("Building Foundation");
	}
	
	public void buildPillars() {
		System.out.println("Building Pillars");
	}
	
	public abstract void buildWalls();
	
	public abstract void buildWindows();
	
}
