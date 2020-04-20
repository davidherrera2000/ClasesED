package ed2.Avion;


public class Aviones {

        private String nombre, apellidos, dni, Avion, Destino;
        private int telefono;

        public Aviones(String nombre, String apellido, String dni, String avion, String destino) {
            this.nombre = nombre;
            this.apellidos = apellido;
            this.dni = dni;
            Avion = avion;
            Destino = destino;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellidos;
        }

        public void setApellido(String apellido) {
            this.apellidos = apellido;
        }

        public String getDni() {
            return dni;
        }

        public void setDni(String dni) {
            this.dni = dni;
        }

        public String getAvion() {
            return Avion;
        }

        public void setAvion(String avion) {
            Avion = avion;
        }

        public String getDestino() {
            return Destino;
        }

        public void setDestino(String destino) {
            Destino = destino;
        }

    public String mostrarDatos(){
        return nombre +" " +apellidos + " " +dni+"" +Avion + " "+Destino + " ";
    }


    }
