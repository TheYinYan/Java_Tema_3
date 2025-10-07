public class Ejercicio02 {
    public static void main(String[] args) throws Exception {
        System.out.print("Por favor, introduzuca la cantidad de euros que quieres convertir: ");
        double euro = Double.parseDouble(System.console().readLine());
        
        System.out.printf("%.2f euros son %d peseta.%n%n",euro, (int)Math.round(euro*166.386));    
    }
}
