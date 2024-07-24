public class Ejercicio4 {
    public static void main(String[] args) {
        int m = 5;
        int n = 3;
        int resultado=0;

        for(int i = 1; i<=n; i++) {
           resultado = resultado + m;
        }
        
        System.out.println("El numero: " + m + " potenciado a: " + n + " es igual a: " + resultado);
    }
}