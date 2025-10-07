public interface Ejercicio12 {
    public static void main(String[] args) throws Exception {
        double notaexamen = 0.0;
        double notatrimestre = 0.0;
        double notaexamen2 = 0.0;

        System.out.print("Introduzca la nota del primer examen: ");
        notaexamen = Double.parseDouble(System.console().readLine());

        System.out.print("¿Que nota quiere sacar en el trimestre? ");
        notatrimestre = Double.parseDouble(System.console().readLine());

        notaexamen2 = (notatrimestre-notaexamen*0.4)/0.6;

        System.out.printf("Para tener un %d en el trimestre necesitas un %.2f en el segundo examen",(int)notatrimestre,notaexamen2 );

    }
}
