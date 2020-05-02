package arreglos;

public class arrelos_nueva {

	public static void main(String[] args) {
		/* Ejemplos
		int[]edad = new int[4]; //---podemos almacenar 4 areglos
		long[]edad = new long[4];
		float[]estatura = new float[3];
		double estatura = new double[3];
		boolean[]estado = new boolean[5];
		char[] sexo = new char[2];
		String[]nombre = new String[2];
		*/
		
		int[] numero=new int[3];
		
		numero[0] = 9;
		numero[1] = 10;
		numero[2] = 5;
		
		for(int i=0; i<=3;i++) {
			//-------el i <3---debe ser de la mano con el int 3 para que se cumpla 
			System.out.println(numero[i]);
		}
		
	}

}
