package challenges.problemsolving;

public class QueensAttackII {

    static int queensAttack(int n, int k, int linhaRainha, int colunaRainha, int[][] obstacles) {
        int obstaculoEsquerda = 0;
        int obstaculoDireita = n + 1;
        int obstaculoAbaixo = 0;
        int obstaculoAcima = n + 1;

        for (int[] obstacle : obstacles) {
            if (obstacle[0] == linhaRainha) {
                if (obstacle[1] < colunaRainha) {
                    obstaculoEsquerda = Integer.max(obstacle[1], obstaculoEsquerda);
                } else if (obstacle[1] > colunaRainha) {
                    obstaculoDireita = Integer.min(obstacle[1], obstaculoDireita);
                }
            }
        }

        int livreAEsquerda = colunaRainha - obstaculoEsquerda - 1;
        int livreADireita = obstaculoDireita - colunaRainha;
        int livreAcima = obstaculoAcima - colunaRainha;
        int livraAbaixo = obstaculoDireita - colunaRainha;
        return livreAEsquerda + livreADireita;
    }


}
