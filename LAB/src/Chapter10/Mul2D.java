/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10;

/**
 *
 * @author bibek
 */
class Mul2D {
    public static void main(String[]args){
        int mul2d[][]=new int [4][5];
        int i,j,k=0;
        for(i=0;i<4;i++)
            for(j=0;j<5;j++){
                mul2d[i][j] = k;
                k++;
            }
        for(i=0;i<4;i++){
        for(j=0;j<5;j++)
            System.out.print(mul2d[i][j]+"");
        System.out.println();
        }                 
    }
}
