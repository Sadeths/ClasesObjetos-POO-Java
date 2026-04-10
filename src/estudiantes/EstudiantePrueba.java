package estudiantes;

public class EstudiantePrueba {
    public static void main(String[] args) {
        //Crear estudiantes
        var estudiante1 = new Estudiante("Samahel Thomas", 24, "Ing. Sistemas", 96);
        var estudiante2 = new Estudiante("Luis Baltazar", 28, "Psicologia", 49);

        //Mostar informacion
        estudiante1.mostrarInfo();
        estudiante2.mostrarInfo();

        //Evaluar si aprobaron
        System.out.println();
        if (estudiante1.aprobo()){
            System.out.println(estudiante1.getNombre() +" : Aprobo");
        }else{
            System.out.println(estudiante1.getNombre() + " : Reprobo");
        }
        System.out.println();
        if(estudiante2.aprobo()){
            System.out.println(estudiante2.getNombre() + " : Aprobo");
        }else 
            System.out.println(estudiante2.getNombre() + " : Reprobo");

        //Imprimir la informacion
        System.out.println();
        System.out.println(estudiante1);
        System.out.println(estudiante2);
    }
}
