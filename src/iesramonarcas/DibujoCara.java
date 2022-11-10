/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iesramonarcas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class DibujoCara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String COLOR_RED="\033[31m";
        String COLOR_BLACK="\033[30m";
        Scanner entrada = new Scanner(System.in);
        String[][][] dibujo = new String[9][9][2];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 2; k++) {
                    dibujo[i][j][k] = " ";

                }

            }

        }
        dibujo[2][3][0] = "*";
        dibujo[2][4][0] = "*";
        dibujo[2][5][0] = "*";
        dibujo[2][6][0]="*";

        dibujo[3][2][0] = "*";
        dibujo[3][3][1] = "O";
        dibujo[3][5][1] = "O";
        dibujo[3][6][0] = "  *";

        dibujo[4][2][0] = "*";
        dibujo[4][4][1] = "|";
        dibujo[4][6][0] = "  *";

        dibujo[5][2][0] = "*";
        dibujo[5][6][0] = "  *";

        dibujo[6][3][0] = "*";
        dibujo[6][4][1] = "_";
        dibujo[6][5][0] = "  *";

        dibujo[7][4][0] = " *";

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 2; k++) {
                    if(k==1)
                        System.out.printf(COLOR_RED+dibujo[i][j][k] );
                    if(k==0)
                        System.out.printf(COLOR_BLACK+dibujo[i][j][k]);
               }
            }
            System.out.println("");
        }

        
        
    }

}
