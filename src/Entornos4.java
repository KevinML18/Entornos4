import java.util.*;
/**
* Clase para crear un array y rellenarlo de números
* aleatorios del 1 al 20.
* 																			
* @author Kevin													
* @see "Apuntes Entornos Desarrollo"									
* @see <a href="www.documentacion.com">Documentacion</a>		
* @see java.util.Random												
* @since JDK 17
* @version 1.0
* 
*/

public class Entornos4 {
	
	/**
	 * LONGITUD fija del el array
	 * 
	 */
	private final int LONGITUD=10;
	private int[] vector;
	
	/**
	 * Constructor por defecto
	 */
	public Entornos4() {
		
		/**
		 * random Genera numeros aleatorios
		 * 
		 * @see java.util.Random
		 */
		Random random = new Random();
		
		this.vector= new int[this.LONGITUD];
		
		for (int i=0; i<this.LONGITUD; i++) {
			int rdm=random.nextInt(20)+1;
			this.vector[i]=rdm;
		}
	}
	
	//Getters/setters
	public int[] getVector() {
		return this.vector;
	}

	public void setVector(int[] vector) {
		this.vector = vector;
	}

	public int getLONGITUD() {
		return this.LONGITUD;
	}
	
	/**
	 * @deprecated Usar metodo {@link #mostrar() mostrar}
	 */
	
	public void mostrarX() {
		int[]vector=this.getVector();
		for (int i=0; i<this.getLONGITUD(); i++) {
			System.out.print(vector[i]+" ");			
		}
		System.out.println();
	}
	
	
	public void mostrar() {
		int[]vector=this.getVector();
		for (int i=0; i<this.getLONGITUD(); i++) {
			if (vector[i]>0 && vector[i]<21) {
				System.out.print(vector[i]+" ");
			} else {
				System.out.println("Los valores del array son incorrectos");
				break;
			}
			
		}
		System.out.println();
	}
	
	/**
	 * Ordena el vector de menor a mayor.
	 * @throws Exception Si ocurre algún error durante el proceso de ordenacion.
	 * @return Vector ordenado de menor a mayor 
	 */
	
	public void menorAmayor() {
		int aux;
		int [] vector=this.getVector();
		for(int i=0; i<this.getLONGITUD()-1; i++) {
			for (int j=0; j<this.getLONGITUD()-1; j++) {
				if (vector[j]>vector[j+1]) {
					aux= vector[j];
					vector[j]=vector[j+1];
					vector[j+1]=aux;	
				}
			}
		}
	}
	
	/**
	 * Ordena el vector de mayor a menor.
	 * 
	 * @throws Exception Si ocurre algún error durante el proceso de ordenacion.
	 * @exception IllegalArgumentException Si el vector es nulo.
	 */
	
	public void mayorAmenor() {
		int aux;
		int [] vector=this.getVector();
		for(int i=0; i<this.getLONGITUD()-1; i++) {
			for (int j=0; j<this.getLONGITUD()-1; j++) {
				if (vector[j]<vector[j+1]) {
					aux= vector[j];
					vector[j]=vector[j+1];
					vector[j+1]=aux;	
				}
			}
		}
	}
	

	public static void main(String[] args) {
		
		Entornos4 array = new Entornos4();
		array.mostrar();
		
		System.out.println("Array ordenado de menor a mayor:");
		array.menorAmayor();
		array.mostrar();
		
		System.out.println("Array ordenado de mayor a menor:");
		array.mayorAmenor();
		array.mostrar();
		
	}

}
