package com.bistiboy.agricola;

import com.bistiboy.agricola.impl.AgricolaFactoryImpl;

/** This factory  overrides the generated factory and returns the new generated interfaces */
public interface AgricolaFactory extends MAgricolaFactory 
{
	
	/** Specialize the eINSTANCE initialization with the new interface type 
	  * (overridden in the override_factory extension)
	*/
	AgricolaFactory eINSTANCE = AgricolaFactoryImpl.init();
				
	public GamerBoard createGamerBoard();
	public Parcel createParcel();
	public Gamer createGamer();
	public Gamer createGamer(String name);
	public Agricola createAgricola();
	public SupplierCard createSupplierCard();
	public CreationCard createCreationCard();
	public Supply createSupply();
	public Supply createSupply(int quantity, Resource r);
	public Creation createCreation();
	public Creation createCreation(String name, Supply... supplies);
	public MainBoard createMainBoard();
	public Round createRound();
	public Round createRound(String name);

}
