public class Ejercicio01 {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Este Programa Multiplica dos números enteros.");

        System.out.print("Por favor, introduzca un número: ");
        int num1 = Integer.parseInt(System.console().readLine());

        System.out.print("Introduzca el segubdo número: ");
        int num2 = Integer.parseInt(System.console().readLine());

        System.out.printf("%d * %d = %d", num1, num2, num1*num2);
    }
}
