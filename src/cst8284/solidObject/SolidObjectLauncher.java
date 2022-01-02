package cst8284.solidObject;

import java.util.ArrayList;
import java.util.Collection;

//import cst8284.genericTable.Triangle;

public class SolidObjectLauncher {

	
	// TODO: define a new static ArrayList of type SolidObject called solidObjects.
	
	static ArrayList <SolidObject<BasicShape>> solidObjects = new ArrayList<SolidObject<BasicShape>>();
	public static void main(String[] args) {
				
		Circle c2D = new Circle(3.0);
		SolidObject<BasicShape> c3D = new SolidObject<BasicShape>(c2D, 39.2436654315);
		solidObjects.add(c3D);
		
		Square square2D = new Square(16.0);
		SolidObject<BasicShape> square3D = new SolidObject<BasicShape>(square2D, 2.0);
		solidObjects.add(square3D);
		
		Triangle tri2D = new Triangle(6.0);
		SolidObject<BasicShape> tri3D = new SolidObject<BasicShape>(tri2D, 4.5);
		solidObjects.add(tri3D);
		
		Square sq2D = new Square(8.0);
		SolidObject<BasicShape> sq3D = new SolidObject<BasicShape>(sq2D);
		solidObjects.add(sq3D);
		
		
	
		
		displayVolumeComparison(solidObjects);
		displaySurfaceAreaComparison(solidObjects);
	}
	
	public static boolean isVolumeEqual(SolidObject<BasicShape>obj1, SolidObject<BasicShape> obj2) {
		return Math.abs(obj1.getVolume() - obj2.getVolume()) < 0.0000001;
		
		//if(obj1.getVolume() == obj2.getVolume() &&  {
		//if(obj1.getVolume() == obj2.getVolume()) {
			
		//if(a.getVolume() == b.getVolume() <1e-8) {
						//return true;
			
		//}else {
						//return false;
		}
	
	
	// TODO: Create a public static method isVolumeEqual() that takes two SolidObjects as
	// parameters, and if they have the same volume, returns true, otherwise false.
	// This method is called by the displayVolumeComparison method, whose code is
	// already provided below.  Assume the two SolidOjects have equal volume
	// if their volumes are the same to within 1e-8

	public static boolean isSurfaceAreaEqual(SolidObject<BasicShape> obj1, SolidObject<BasicShape> obj2) {
		return Math.abs(obj1.getSurfaceArea() - obj2.getSurfaceArea()) < 0.0000001;
		//if (obj1.getSurfaceArea() == obj2.getSurfaceArea()) {
					//return true;
		//}else {
			//return false;
		}
	
	// TODO: Create a public static method isSurfaceAreaEqual() that takes two SolidObjects
	// as parameters and if they have the same surface area, returns true, otherwise
	// false.  This method is called by the displayVolumeComparison method, whose code is
	// already provided below.  Assume the two SolidOjects have equal surface area
	// if their surface areas are the same to within 1e-8


	
	
	public static void displayVolumeComparison(ArrayList<SolidObject<BasicShape>> arList) {

		// Print out column header
		System.out.println("Compare the objects' volumes.  Are they equal?");
		System.out.print("\t\t");
		for (SolidObject<BasicShape> columnHeader : arList)
			System.out.print(columnHeader);


		for (SolidObject<BasicShape> solidObjRow : arList) {
			System.out.println(); // Next line
			System.out.print(solidObjRow);
			for (SolidObject<BasicShape> solidObjColumn : arList)
				System.out.print("\t\t" + (isVolumeEqual(solidObjColumn, solidObjRow) ? "TRUE" : false));
		}
		System.out.println("\n");
	}

	public static void displaySurfaceAreaComparison(ArrayList<SolidObject<BasicShape>> arList) {

		System.out.println("Compare the objects' surface areas.  Are they equal?");
		// Print out the header
		System.out.print("\t\t");
		for (SolidObject<BasicShape> columnHeader : arList)
			System.out.print("\t" + columnHeader);

		// Print out each row,starting with the name of the object
		for (SolidObject<BasicShape> solidObjRow : arList) {
			System.out.println(); // Next line
			System.out.print(solidObjRow);
			for (SolidObject<BasicShape> solidObjColumn : arList)
				System.out.print("\t\t" + (isSurfaceAreaEqual(solidObjColumn, solidObjRow) ? "TRUE" : false));
		}
		System.out.println("\n");
	}
}
