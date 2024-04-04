public class Persona {
    // ATRIBUTOS
    private String nombre;
    private String apellido;
    private Integer edad;

    // GETTERS & SETTERS - PROPERTIES.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Datos de la persona " +
                "Nombre: '" + nombre + '\'' +
                ", Apellido: '" + apellido + '\'' +
                ", Edad: " + edad +
                '}';
    }
}
