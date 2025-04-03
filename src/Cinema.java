public class Cinema {
    public static void main(String[] args) {
        Ingresso ingresso1 = new Ingresso(20.0, "Vingadores", true);
        MeiaEntrada ingresso2 = new MeiaEntrada(20.0, "Vingadores", true);
        IngressoFamilia ingresso3 = new IngressoFamilia(20.0, "Vingadores", true, 4);

        System.out.println(ingresso1);
        System.out.println(ingresso2);
        System.out.println(ingresso3);
    }
}