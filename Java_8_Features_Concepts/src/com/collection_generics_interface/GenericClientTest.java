package com.collection_generics_interface;

public class GenericClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("----------------GCImp_1 and GInterface_1 Example----------------");
		GCImp_1<Integer> g1=new GCImp_1<>();
		g1.setValue(100);
		System.out.println(g1.getValue());

		GCImp_1<String> g2=new GCImp_1<>();
		g2.setValue("miracle");
		System.out.println(g2.getValue());
System.out.println("----------------------------------------------------------");	
		

System.out.println("----------------GCImp_2 and GInterface_2 Example----------------");

		GCImp_2  a1=new GCImp_2();
		a1.setValue("ansari");
		
		Object s=a1.getValue();
		String q=(String)s;
		System.out.println(q);
System.out.println("----------------------------------------------------------");	



System.out.println("----------------GCImp_3 and GInterface_3 Example----------------");

			GCImp_3<String,Integer>  gcimp3= new GCImp_3<>();
			
			gcimp3.setK("khan");
			gcimp3.setValue(101);
			
			System.out.println(gcimp3.getK()+"\t"+gcimp3.getValue());
			
System.out.println("----------------------------------------------------------");	



System.out.println("---------------- Generic_Method Example----------------");

Integer [] arr= {200,100,300,900,600};

Generic_Method_Example<Integer>  gme=new Generic_Method_Example<>(arr);

Integer[] arr2=gme.getArr();
gme.printElement(arr2);

System.out.println("----------------------------------------------------------");	


System.out.println("---------------- No_GenericClass_GenericMethod Example----------------");
String[] str= {"ansari","khan","momin","sayyed"};

Generic_Method_Example_2  gem2=new Generic_Method_Example_2();

gem2.printElement(str);

System.out.println("----------------------------------------------------------");	


	}
}
