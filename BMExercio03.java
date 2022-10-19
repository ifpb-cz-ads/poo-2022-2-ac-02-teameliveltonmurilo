public class BMExercio03 {
    public static void main(String[] args){
        double item1 = 2.95;
        double item2 = 3.50;
        System.out.println("O item 1 custa " + item1 + " e o item 2 custa " + item2);

        double custoTotal = item1 + item2;
        System.out.println("Custo total: " + custoTotal);
        final double taxa = 0.0825;
        double taxaCalculada = custoTotal * taxa;
        System.out.println("Taxa Calculada: " + taxaCalculada);
        item1 += taxaCalculada; item2 += taxaCalculada;
        double novoCusto = item1 + item2;
        System.out.println("Novo custo: " + novoCusto);
        boolean muitoCaro = novoCusto>10;
        System.out.println("Valor de muitoCaro: " + muitoCaro);
    }
}
