public interface Ejercicio04 {
 public static void main(String[] args) throws Exception {
    double x = 0.0;
    double y = 0.0;

    System.out.print("Por favor, introduzca un número: ");
    x = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por favor, introduzca el segundo número: ");
    y = Double.parseDouble(System.console().readLine());

    System.out.printf("""
            x = %.1f
            y = %.1f
            x + y = %.1f
            x - y = %.1f
            x / y = %.17f
            x * y = %.1f
            """,x ,y, x+y, x-y, x/y, x*y);
}
}