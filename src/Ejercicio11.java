public interface Ejercicio11 {
    public static void main(String[] args) throws Exception {
        double num1 = 0.0;
        double num2 = 0.0;

        System.out.print("Por favor, introduzca un numero de Kb: ");
        num1 = Double.parseDouble(System.console().readLine());
        num2 = num1/1024;

        System.out.printf("%.1fKb son %.1fMb",num1,num2 );

    }
}
