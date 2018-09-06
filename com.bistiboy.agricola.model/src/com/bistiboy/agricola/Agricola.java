package com.bistiboy.agricola;

// This interface overrides the generated interface and will be returned by factory
public interface Agricola extends MAgricola
{
	// You can write additional methods using an empty default java 8 notation 
	// because the generated implemented class extends this interface and is not abstract
	//
	// For instance : 
	// default public void addSomething(Something foo) {} ;
	
	default public void addGamer(String name){
		
		getGamers().add(AgricolaFactory.eINSTANCE.createGamer(name));
	}

}
