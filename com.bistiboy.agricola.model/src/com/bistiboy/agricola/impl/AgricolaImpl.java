package com.bistiboy.agricola.impl;

import com.bistiboy.agricola.Agricola;
import com.bistiboy.agricola.Gamer;
import com.bistiboy.agricola.simu.AgricolaBox;

// This class overrides the generated class and will be instantiated by factory
public class AgricolaImpl extends MAgricolaImpl implements Agricola
{
	@Override
	public void play(Gamer g) {
		// TODO Auto-generated method stub
		System.out.println("Le joueur joue : " + g.getName());
		
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		AgricolaBox b = new AgricolaBox();
		b.init(this);
	}

}
