package main.creationalDesignPattern.Prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		NetworkResource localNR = new NetworkResource("localhost:4200/", 1);
		List<NetworkResource> allNRs = new ArrayList<>();
		allNRs.add(localNR);
		for (int i = 0; i < 9; i++) {
			allNRs.add((NetworkResource) localNR.clone());
		}
		System.out.println("All Network Resources are : " + allNRs.toString());
	}
}
