public interface Ejercicio07 {
    public static void main(String[] args) throws Exception {
        double base = 0.0;
        
        System.out.print("Por favor, Introduzca la base imponible (precio sin IVA): ");
        base = Double.parseDouble(System.console().readLine());
        double IVA = 0.21*base;
        System.out.printf("""
            Base Imponible     %.2f $
            IVA (21%%)         %6.2f $   
            --------------------------
            Total              %.2f $  
            """, base,IVA,base+IVA);
    }
}