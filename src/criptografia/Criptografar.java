// cifra de cesar com tabela ASCII

package criptografia;

public class Criptografar {
    public static void main(String[] args) {
        
        String textoSimples = "BOA NOITE";

        System.out.println(textoSimples);

        char[] letras = textoSimples.toCharArray();
        String textoNovo = "";

        for (char letra : letras) {
            letra += 3;
            //System.out.print(letra);
            textoNovo += String.valueOf(letra);
        }

        System.out.println("\n" + textoNovo);
    }
}