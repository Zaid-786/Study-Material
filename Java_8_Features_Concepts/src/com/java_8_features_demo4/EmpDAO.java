package com.java_8_features_demo4;

import java.util.ArrayList;
import java.util.List;

public class EmpDAO {

	
	public List<Employee>  getAllEmp()
	{
		List<Employee>  list=new ArrayList<>();
		
		list.add(new Employee(111,"ansari","computer",500000));
		list.add(new Employee(222,"khan","doctor",700000));
		list.add(new Employee(333,"shaikh","computer",600000));
		list.add(new Employee(444,"sayyed","electronics",500000));
		list.add(new Employee(555,"momin","teacher",300000));
		
		return  list;
	}
	
	
	
	
}
