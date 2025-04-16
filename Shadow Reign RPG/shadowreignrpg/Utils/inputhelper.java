package shadowreignrpg.utils;
class Utils {

// Sistemas para Otimização

    public static void pausar(int milissegundos) {  // -> Quantos segundos esperar para mensagem enviar
        try {
            Thread.sleep(milissegundos); 
        } catch (InterruptedException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    public static void mostrarTexto(String texto, Scanner entrada) {
        for (char c : texto.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(35); // -> Quantos segundos esperar na digitação
            } catch (InterruptedException e) {
                System.err.println("Erro: " + e.getMessage());
            }
        }
        System.out.println();
    }
}