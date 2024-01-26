import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class MinimumNumber
{
    @Test
    public void checkSmallArraySize()
    {
        assertEquals(1, Solution.minimumNumber(new int[]{3,1,2}));
        assertEquals(0, Solution.minimumNumber(new int[]{5,2}));
        assertEquals(0, Solution.minimumNumber(new int[]{1,1,1}));
    }
    @Test
    public void checkLargerArraySize()
    {
        assertEquals(5, Solution.minimumNumber(new int[]{2,12,8,4,6}));
        assertEquals(2, Solution.minimumNumber(new int[]{50,39,49,6,17,28}));
    }
}



import java.util.Arrays;

public class Solution
{
    public static int minimumNumber(int[] numbers){
    
    // Declaramos un integer que va a ser la base para sumar todos los valores
     int suma = 0;
    // Creamos un bucle del tamaño de numbers
      for(int i = 0; i < numbers.length; i++){
        // Sumamos todos los numeros de numbers a suma y nos dara el total
        suma += numbers[i];
      }
      // Declaramos un boolean para la comprobación de si es primo o no
      boolean Primo = false;
      // Creamos otro bucle para llamar una funcion y devolver true
      for(int j = suma; !Primo;j++){
        // Llamamos a una funcion que comprueba si es primo o no
       Primo = isPrimo(j);
        // Si es primo le restamos j a suma y guardamos el resultado
        if(Primo){
          suma = j - suma;
        }
      }
      
      // Mostramos el resultado de la resta
        return suma; 
    }
  // Funcion que devuelve un boolean
  private static boolean isPrimo(int j){
    // Bucle para comprobar si es primo o no
    for(int i = 2; i <  j ; i++){
      // Si j modulo de i que inicia en 2 es igual a 0 no es primo
      if(j % i == 0){
        return false;
      }
   }
    // Si el es primo devuelve true 
    return true;
  }

  
}
