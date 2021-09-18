
package operaciones;

/**
 *
 * @author INDRA
 */
public class PruebaAritmetica {
    public static void main(String[] args) {
        
        //Variables locales
        int a = 10;
        int b =2;
        miMetodo();
        Aritmetica arimeAritmetica1 = new Aritmetica();
        System.out.println("arimeAritmetica1 a = " + arimeAritmetica1.a);
        System.out.println("arimeAritmetica1 b = " + arimeAritmetica1.b);
        Aritmetica aritmetica2 = new Aritmetica(5, 8);
               System.out.println("arimeAritmetica2 a = " + aritmetica2.a);
        System.out.println("arimeAritmetica2 b = " + aritmetica2.b);
    }
 public static void miMetodo(){
     System.out.println("Metodo estatico");
 }

}
