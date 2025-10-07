public interface Ejercicio03 {
    public static void main(String[] args) throws Exception {
        System.out.print("Por favor, introduzuca la cantidad de pesetas que quieres convertir: ");
        int peseta = Integer.parseInt(System.console().readLine());
        
        System.out.printf("%d euros son %.2f peseta.",peseta, peseta/166.386);    
    }
}

