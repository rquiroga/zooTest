public class Persona {

    private int carnetDeIdentidad;
    private String nombre;
    private String fechaDeNacimiento;
    protected int telefono;
    String direccion;

    public Persona(int carnetDeIdentidad, String nombre, String fechaDeNacimiento) {
        this.carnetDeIdentidad = carnetDeIdentidad;
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;

    }
    // Este es un comentario

    public void prueba() {
        setNombre("");
        setFechaDeNacimiento("");
		
		int test = 0;
		int test1 = 0;
		int test2 = 0;

    }

    public Persona(String carnetDeIdentidad){}


    public int getCarnetDeIdentidad() {

        return carnetDeIdentidad;
    }

    public String getNombre() {
        return nombre + " -- ";
    }

    @Override
    public String toString() {
        return "Persona{" +
                "carnetDeIdentidad=" + carnetDeIdentidad +
                ", nombre='" + nombre + '\'' +
                ", fechaDeNacimiento='" + fechaDeNacimiento + '\'' +
                ", telefono=" + telefono +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
}
