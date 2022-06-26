package Methods;

import GUI.Principal;

public class Algoritmos extends Principal {
    private int N = 2;
    Principal principal;
    public void crearMatriz(int N){
        String strMatriz[][] = new String[N][N];
        int matriz[][] = new int[N][N];
        for (int i = 0; i < matriz.length;i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (int) Math.random()*999;
                //strMatriz += matriz[i][j];
            }
        }
        String.valueOf(matriz);
    }

}
