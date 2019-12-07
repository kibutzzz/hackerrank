package challenges.problemsolving;

public class QueensAttackII {

    static int queensAttack(int n, int k, int linhaRainha, int colunaRainha, int[][] obstacles) {
        int obstaculoEsquerda = 0;
        int obstaculoDireita = n + 1;
        int obstaculoAbaixo = 0;
        int obstaculoAcima = n + 1;

        int espaco_superior_direito = Integer.min(n - linhaRainha, n - colunaRainha);
        int espaco_superior_esquerdo = Integer.min(n - linhaRainha, colunaRainha - 1);
        int espaco_inferior_esquerdo = Integer.min(linhaRainha - 1, colunaRainha - 1);
        int espaco_inferior_direito = Integer.min(n - colunaRainha, linhaRainha - 1);

        for (int[] obstacle : obstacles) {
            int linha = obstacle[0];
            int coluna = obstacle[1];
            if (linha == linhaRainha) {
                if (coluna < colunaRainha) {
                    obstaculoEsquerda = Integer.max(coluna, obstaculoEsquerda);
                } else if (coluna > colunaRainha) {
                    obstaculoDireita = Integer.min(coluna, obstaculoDireita);
                }
            } else if (coluna == colunaRainha) {
                if (linha < linhaRainha) {
                    obstaculoAbaixo = Integer.max(linha, obstaculoAbaixo);
                } else if (linha > linhaRainha) {
                    obstaculoAcima = Integer.min(linha, obstaculoAcima);
                }
            } else if (linha - linhaRainha == coluna - colunaRainha) {
                if (linha - linhaRainha > 0) {
                    espaco_superior_direito = Integer.min(espaco_superior_direito, linha - linhaRainha - 1);
                } else if (linha - linhaRainha < 0) {
                    espaco_inferior_esquerdo = Integer.min(espaco_inferior_esquerdo, linhaRainha - linha - 1);
                }
            } else if (coluna - colunaRainha == -(linha - linhaRainha)) {
                if (linha - linhaRainha > 0) {
                    espaco_superior_esquerdo = Integer.min(espaco_superior_esquerdo, linha - linhaRainha - 1);
                } else if (linha - linhaRainha < 0) {
                    espaco_inferior_direito = Integer.min(espaco_inferior_direito, linhaRainha - linha - 1);
                }
            }
        }

        int livreAEsquerda = colunaRainha - obstaculoEsquerda - 1;
        int livreADireita = obstaculoDireita - colunaRainha - 1;
        int livreAcima = obstaculoAcima - linhaRainha - 1;
        int livreAbaixo = linhaRainha - obstaculoAbaixo - 1;
        return livreAEsquerda + livreADireita + livreAcima + livreAbaixo + espaco_superior_direito
                + espaco_inferior_esquerdo + espaco_superior_esquerdo + espaco_inferior_direito;
    }


}
