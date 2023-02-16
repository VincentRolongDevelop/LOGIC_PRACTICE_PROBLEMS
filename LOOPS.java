import java.util.Scanner;

public class LOOPS{
 
	public static void main(String[]args){

        
    System.out.println("************for-Loop*************");

    for(int i=0;i<3;i++){

    System.out.println(i);
    }
	
	Scanner in = new Scanner(System.in);
	String opcion="SI";
	
	System.out.println("************Loop while***********");

	while(opcion.equals("SI")){
	
	System.out.println(opcion);
	opcion = in.nextLine();



    
	System.out.println("************Do-While loop**********");
	do{
	
	System.out.println("Listo");

	}while(!opcion.equals("SI"));

	}

	in.close();
	}	
}