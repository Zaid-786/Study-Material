import java.util.ArrayList;
import java.util.Arrays;

public class Test {
		
	public static void main(String[] args) 
	{

//		Double d1=Double.valueOf(0);
//		Double d2=Double.valueOf(0);
//		Double d3=Double.valueOf(0);
//
//		boolean b12=d1==d2;
//		boolean b23=d2==d3;
//		boolean b31=d3==d1;
//
//		System.out.println(b12+" "+b23+" "+b31);

	ArrayList arr=new ArrayList();
	
	int[] newarr= {10,20,30};
	arr.addAll(Arrays.asList(newarr));
	
arr.forEach(i-> System.out.println(i));	
	
	
	}

}
