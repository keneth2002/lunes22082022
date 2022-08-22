package ejemplodos;

public class TiposdeDatos2 {

	public static void main(String[] args) {
		// Esto es un comentario de una sola linea
		/*Este es un comentario
		 * pero de 
		 * varias lineas*/
          //Tipos de datos primitivos
		byte numByte = 110;
		System.out.println(numByte);
		short numShort =32_565 ;
		System.out.println(numShort);
		int numInt= -2_147_483_648 ;
		System.out.println(numInt);
		long numLong= -9_223_372_036_854_700_000L ;
		System.out.println(numLong);
		
		byte num1=100, num2=100;
		int num3 = (int) (num1 + num2);
		System.out.println("El valor de num3 es "  + num3);
		
		//Enteros *int,long,short,byte
		//Reales *double,float
		float numFloat = 12.85555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555F;
		System.out.println(numFloat);
		double numDouble = 12.78555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555D;
		System.out.println(numDouble);
		//Caracter char
		//Lógicos/Booleanos true,false
		
	}

}
