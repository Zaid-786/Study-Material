package com.java_8_features_demo4;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class TestService {

	
	public static List<Employee> evauleTaxPayer(String tax)
	{
		List<Employee> emp=new EmpDAO().getAllEmp();

		if(tax.equalsIgnoreCase("tax"))
		{
			
			return 	emp.stream().filter((s) -> s.getSalary()>500000).collect(Collectors.toList());
		}

		else
		{
		 return emp.stream().filter(x-> x.getSalary()<500000).collect(Collectors.toList());
			 
		}
	
	
	}
	




	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestService ts=new TestService();
		System.out.println(ts.evauleTaxPayer("no tax"));
	}

}
