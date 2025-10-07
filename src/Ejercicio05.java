public interface Ejercicio05 {
    public static void main(String[] args) throws Exception {
        double base = 0.0; 
        double altura = 0.0;

        System.out.println("Área de un rectangulo");
        System.out.println("---------------------");

        System.out.print("Por favor, Introduzca la longitud de la base (cm): ");
        base = Double.parseDouble(System.console().readLine());

        System.out.print("Introduzca altura (cm): ");
        altura = Double.parseDouble(System.console().readLine());

        System.out.printf("El área del rectangulo es %.1f cm2", base*altura);

    }
}