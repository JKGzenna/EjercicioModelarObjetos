package ejerciciomodelarobjetos;

/**
 *
 * @author JUAN
 */
public class EjercicioModelarObjetos {

    // a continuación instanciamos las 2 clases creadas
    public static void main(String[] args) {
        
        Alumno a = new Alumno();
        a.setNombre("Juan");
        
        Libro l = new Libro();
        l.abrir();
    }
    
}
