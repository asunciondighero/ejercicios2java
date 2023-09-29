import java.util.Scanner;
// equilatero tres lados iguales
// isoceles dos lados iguales
public class tipode{

     public static void main(String[] args){
        try (Scanner scanner = new Scanner (System.in)) {
            int primerLado;
            int segundoLado;
            int tercerLado;

System.out.println("Determinar el tipo de triangulo");
System.out.println("ingrese el primer lado del triangulo:   ");
primerLado=scanner.nextInt();
System.out.println("ingrese el segundo lado del triangulo:   ");
segundoLado=scanner.nextInt();
System.out.println("ingrese el tercer lado del triangulo:    ");
tercerLado=scanner.nextInt();

if (primerLado==segundoLado && segundoLado==tercerLado) {
   System.out.println("Ingresaste un triangulo Equilatero");
   
}
else if(primerLado == segundoLado || primerLado==tercerLado || segundoLado==tercerLado){
   System.out.println("Ingresaste un triangulo Isoceles");
}
        }
    }
}