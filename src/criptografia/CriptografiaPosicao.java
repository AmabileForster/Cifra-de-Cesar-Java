// cifra de cesar com caracteres

package criptografia;

public class CriptografiaPosicao {
    public static void main(String[] args) {
        // criptoCesar("abcdefghijklmnopqrstuvwxyz", 3); // texto, posições
		// decriptoCesar("defghijklmnopqrstuvwxyz", 3); // texto, posições
		
        //criptoCesar2("aaa", 3);
        //decriptoCesar2("ddd", 3);
    }

    public static void criptoCesar(String textoInicial, int posicoes) {
        
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";

        String alfabetoDeslocado = alfabeto.substring(posicoes) + alfabeto.substring(0, posicoes);

        StringBuilder cifra = new StringBuilder();
        for (int i = 0; i < textoInicial.length(); i++) {
            cifra.append(alfabetoDeslocado.charAt(textoInicial.charAt(i) - 'a'));
        }

        System.out.println("Texto criptografado: " + cifra.toString());
    }

    public static void decriptoCesar(String textoInicial, int posicoes) {
       
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";

        StringBuilder cifra = new StringBuilder();
        for (int i = 0; i < textoInicial.length(); i++) {
            cifra.append(alfabeto.charAt(textoInicial.charAt(i) + 'a'));
        }
		System.out.println("Texto decriptografado: " + cifra.toString());

    }
}

