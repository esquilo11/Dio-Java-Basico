package edu.andre.primeirasemana;

public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Andre";
        String segundoNome = "Mendes";
        String nomeCompleto;

        nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
        
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){

        return "Rsultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
