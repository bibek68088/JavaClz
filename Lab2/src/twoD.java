/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bibek
 */
public class twoD {
    public static void main (String[]args){
    int i,j ,k=0;
    int twoD[][]= new int [4][5];
    for(i=0;i<4;i++){
        for(j=0 ; j<5; j++)
            twoD[i][j] = k;
            k++;
    }
    for(i=0; i<4; i++){
    for(j=0;j<5;j++)
        System.out.println("Array:["+i+"]["+j+"]=\t"+twoD[i][j]);
    System.out.println();
}
    }}