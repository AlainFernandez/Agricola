package com.bistiboy.agricola.impl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.bistiboy.agricola.Agricola;
import com.bistiboy.agricola.AgricolaFactory;
import com.bistiboy.agricola.Creation;
import com.bistiboy.agricola.CreationCard;
import com.bistiboy.agricola.Gamer;
import com.bistiboy.agricola.GamerBoard;
import com.bistiboy.agricola.MainBoard;
import com.bistiboy.agricola.Parcel;
import com.bistiboy.agricola.Resource;
import com.bistiboy.agricola.Round;
import com.bistiboy.agricola.SupplierCard;
import com.bistiboy.agricola.Supply;


// This factory  overrides the generated factory and returns the new generated interfaces
public class AgricolaFactoryImpl extends MAgricolaFactoryImpl implements AgricolaFactory
{
	
	public static AgricolaFactory init() {
		
		try {
			Object fact = MAgricolaFactoryImpl.init();
			if ((fact != null) && (fact instanceof AgricolaFactory))
					return (AgricolaFactory) fact;
			}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AgricolaFactoryImpl(); 
		 }
	
	public GamerBoard createGamerBoard()
	{
		GamerBoard result = new GamerBoardImpl();
		return result;
	}
	public Parcel createParcel()
	{
		Parcel result = new ParcelImpl();
		return result;
	}
	public Gamer createGamer()
	{
		Gamer result = new GamerImpl();
		result.setGamerboard(createGamerBoard());
		return result;
	}
	public Gamer createGamer(String name)
	{
		Gamer result = createGamer();
		result.setName(name);
		return result;
	}
	public Agricola createAgricola()
	{
		Agricola result = new AgricolaImpl();
		return result;
	}
	public SupplierCard createSupplierCard()
	{
		SupplierCard result = new SupplierCardImpl();
		return result;
	}
	public CreationCard createCreationCard()
	{
		CreationCard result = new CreationCardImpl();
		return result;
	}
	public Supply createSupply()
	{
		Supply result = new SupplyImpl();
		return result;
	}
	public Supply createSupply(int quantity, Resource r)
	{
		Supply result = createSupply();
		result.setQuantity(quantity);
		result.setResourceType(r);
		return result;
	}
	public Creation createCreation()
	{
		Creation result = new CreationImpl();
		return result;
	}
	public Creation createCreation(String name, Supply... supplies) {
		Creation c = createCreation();
		c.setName(name);
		for(Supply s : supplies){
			c.getCost().add(s);
		}	
		return c;
	}
	public MainBoard createMainBoard()
	{
		MainBoard result = new MainBoardImpl();
		return result;
	}
	public Round createRound()
	{
		Round result = new RoundImpl();
		return result;
	}
	public Round createRound(String name)
	{
		Round result = createRound();
		result.setName(name);
		return result;
	}


	
}
