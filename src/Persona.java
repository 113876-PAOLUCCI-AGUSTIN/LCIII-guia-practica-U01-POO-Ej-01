public class Persona {

    // ATRIBUTES
    private String nombre;
    private String apellido;
    private Integer edad;
    private Double peso;
    private Double altura;

    // GETTERS & SETTERS.
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

    public Double getAltura() { return altura; }

    public void setAltura(Double altura) { this.altura = altura; }

    public Double getPeso() { return peso; }

    public void setPeso(Double peso) { this.peso = peso; }


    // CONSTRUCTOR.
    public Persona(String nombre, String apellido, Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Persona(String nombre, String apellido, Integer edad, Double peso, Double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona() {
    }

    // TOSTRING METHOD.
    @Override
    public String toString() {
        return "Persona{" +
                "altura=" + altura +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                '}';
    }
}
