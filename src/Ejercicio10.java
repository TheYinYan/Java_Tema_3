public interface Ejercicio10 {
    public static void main(String[] args) throws Exception {
        double num1 = 0.0;
        double num2 = 0.0;

        System.out.print("Por favor, introduzca un numero de Mb: ");
        num1 = Double.parseDouble(System.console().readLine());
        num2 = num1*1024;

        System.out.printf("%.1fMb son %.1fKb",num1,num2 );

    }
}