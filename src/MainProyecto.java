
public class MainProyecto {

    public static void main(String[] args) {

        Proyecto proyecto = new Proyecto();
        proyecto.setNombre("Sistema de Ventas");
        proyecto.setResponsable("Alejandro");
        proyecto.setProgreso(50);

        System.out.println("Nombre: " + proyecto.getNombre());
        System.out.println("Responsable: " + proyecto.getResponsable());
        System.out.println("Progreso: " + proyecto.getProgreso());

        proyecto.setProgreso(107);

        proyecto.avanzar(30);
        System.out.println("Progreso: " + proyecto.getProgreso());

        proyecto.avanzar(40);
        System.out.println("Progreso: " + proyecto.getProgreso());
    }
}
 