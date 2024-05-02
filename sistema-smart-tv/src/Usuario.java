public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV aparelho = new SmartTV();

        System.out.println(aparelho.canal);
        aparelho.aumentarCanal();
        System.out.println(aparelho.canal);
        aparelho.aumentarCanal();
        System.out.println(aparelho.canal);
        aparelho.aumentarCanal();
        System.out.println(aparelho.canal);
        aparelho.diminuirCanal();
        System.out.println(aparelho.canal);
        aparelho.mudarDeCanal(87);
        System.out.println(aparelho.canal);

       
    }
}
