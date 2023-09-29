public class letra {
    

        public static boolean contieneAB(String texto) {
            return texto.contains("a") && texto.contains("b");
        }
    
        public static void main(String[] args) {
            String texto = "amor"; // Puedes cambiar el texto aquí
    
            if (contieneAB(texto)) {
                System.out.println("El texto contiene tanto 'a' como 'b'.");
            } else {
                System.out.println("El texto no cumple con los requisitos.");
            }
        }
    
    
}
