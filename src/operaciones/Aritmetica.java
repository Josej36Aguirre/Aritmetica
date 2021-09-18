package operaciones;

public class Aritmetica {

    int a;
    int b;

    public Aritmetica(){
        System.out.println("Este es el constructor");
        
    }
    
    public Aritmetica(int a, int b){
        
        this.a = a;
        this.b= b;
        System.out.println("Constructor con argumentos");
    }
    
    public void sumar() {
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }

    public int sumarConRetorno() {
//        int resultado a+b;
//        return resultado;
        return a + b;
    }
    
      public int sumarConArgumentos(int a, int b){
        this.a = a;
        this.b = b;
        return  sumarConRetorno();
    }
}
