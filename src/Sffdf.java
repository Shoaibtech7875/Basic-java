
public class Sffdf {

	
		 void sum(long a,long b){System.out.println("a method1 invoked");}  
		  void sum(long a,Long b){System.out.println("b method invoked");}  
		  
		  public static void main(String args[]){  
			  Sffdf obj=new Sffdf();  
		  obj.sum(20,20);//now ambiguity  
		  }  

	

}
