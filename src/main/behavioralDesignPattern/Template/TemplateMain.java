package main.behavioralDesignPattern.Template;

public class TemplateMain {

	public static void main(String[] args) {
		BuildingHouse house1 = new GlassHouse();
		house1.buildingHouse();
		System.out.println("House 1 constructed");
		System.out.println();
		BuildingHouse house2 = new WoodenHouse();
		house2.buildingHouse();
		System.out.println("House 2 constructed");
	}
}
