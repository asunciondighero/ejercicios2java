public class permiso {

    public static boolean esMayorDeEdad(int edad) {
        return edad >= 18;
    }

    public static boolean tienePermisoDeConducir(boolean tienePermiso) {
        return tienePermiso;
    }

    public static void main(String[] args) {
        int edad = 20; // Puedes cambiar la edad aquí
        boolean tienePermiso = true; // Puedes cambiar el estado del permiso aquí

        if (esMayorDeEdad(edad) && tienePermisoDeConducir(tienePermiso)) {
            System.out.println("La persona es mayor de edad y tiene permiso de conducir.");
        } else {
            System.out.println("La persona no cumple con los requisitos.");
        }
    }
}


