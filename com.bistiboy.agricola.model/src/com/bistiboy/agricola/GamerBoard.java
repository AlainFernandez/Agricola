package com.bistiboy.agricola;

import java.util.Set;

// This interface overrides the generated interface and will be returned by factory
public interface GamerBoard extends MGamerBoard
{
	// You can write additional methods using an empty default java 8 notation 
	// because the generated implemented class extends this interface and is not abstract
	//
	// For instance : 
	// default public void addSomething(Something foo) {} ;
	
	// to return the set of all Pipe object contained inside each Plug of each Parcel  
	//  of the current GamerBoard Object
	//public Set<Pipe> getAllPipes();

}
