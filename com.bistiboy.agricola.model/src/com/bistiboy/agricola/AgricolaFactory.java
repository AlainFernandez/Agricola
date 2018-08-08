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
	public Agricola createAgricola();
	public SupplierCard createSupplierCard();
	public CreationCard createCreationCard();
	public Supply createSupply();
	public Creation createCreation();
	public MainBoard createMainBoard();
	public Round createRound();
	public InPlug createInPlug();
	public Plug createPlug();
	public OutPlug createOutPlug();
	public Pipe createPipe();
}
