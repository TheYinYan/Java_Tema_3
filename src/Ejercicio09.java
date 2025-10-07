public interface Ejercicio09 {
    public static void main(String[] args) throws Exception {
        double radio = 0.0; 
        double altura = 0.0;
        

        System.out.println("Volumen de un cono");
        System.out.println("------------------");

        System.out.print("Por favor, Introduzca la altura (cm): ");
        altura = Double.parseDouble(System.console().readLine());

        System.out.print("Introduzca el rade de la base (cm): ");
        radio = Double.parseDouble(System.console().readLine());

        System.out.printf("El área del triángulo es %f cm3", (1.0/3)*Math.PI*Math.pow(radio, 2)*altura);


    }
}
