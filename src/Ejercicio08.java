public interface Ejercicio08 {
    public static void main(String[] args) throws Exception {
        int salario = 0;
        int numhoras = 0;

        System.out.print("Introduzca el número de horas trabajadas la semana: ");

        numhoras = Integer.parseInt(System.console().readLine());

        salario = numhoras*12;

        System.out.printf("Su salario semanal es de %d euros.",salario);

    }
}