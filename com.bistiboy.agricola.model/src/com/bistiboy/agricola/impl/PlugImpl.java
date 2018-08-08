package com.bistiboy.agricola.impl;

import java.util.Set;

import com.bistiboy.agricola.Pipe;
import com.bistiboy.agricola.Plug;

// This class overrides the generated class and will be instantiated by factory
public class PlugImpl extends MPlugImpl implements Plug
{
	// to return the Pipe object contained inside      
	// the current Plug Object
	public Pipe getAllPipes(){
		return super.getPipe();
	}
}
