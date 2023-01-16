package com.collection_generics_interface;


//whenever you are implementing any generic specific parameter interface then class dont need a generic.

public class GCImp_2 implements GInterface_2<String> {

	private String s;
	
	@Override
	public void setValue(String s) {
		// TODO Auto-generated method stub
		
		this.s=s;
		
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return s;
	}

	
	
	
	
	
}
