public class BMExercio04 {
    public static void main(String[] args) {
        long long1 = 100;
        int int1 = 200;
        int int2 = 0;
        int2 += int1 + long1;
        

        System.out.println(int2);

        /*
         * EXPLICAÇÃO DA QUESTÃO
         * long1 começou com 100 e int1 começou com 200
         * ao atribuir int1 ao int2, int2 imediatamente assume o valor de int1
         * bom, o erro é causado porque não é possível converter long para int
         * ou seja, não é possível somar dois valores diretamente, no caso de: int int2 = int1 + long1;
         * para solucionar o problema, é necessário utilizar o +=
         * o += fará com que o valor de int2 seja o resultado da soma de int1 + long1
         * ou seja, int 1 assumirá a soma de 200+100 e depois será atribuido para int2
         * porém, essa solução muda o valor de int1
         * uma solução que encontrei foi atribuir 0 ao int2 na declaração, e após isso somar com +=
         * assim, int1 pode continuar com o seu valor inicial
         */
    }
}