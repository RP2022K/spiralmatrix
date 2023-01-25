/*
* File: SpiralMatrix.java
* Author: Gyüre Árpád
* Copyright: 2022, Gyüre Árpád
* Group: Szoft I-1-E
* Date: 2023-01-25
* Github: https://github.com/rp2022k/spiralmatrix
*/

import java.lang.Math.*;

public class SpiralMatrix {

    
    static void kiir(int [][] tomb, int n){
   	
	for (int i=0;i<n;i++){
	  System.out.print("  ");
	  for (int j=0;j<n;j++){
	  System.out.print(tomb[i][j]+"\t");
	}
	  System.out.println();
	}
    }

    public static void main(String[] args){
        
	try{

        int n = Integer.parseInt(args[0]);
	int[][] tomb = new int[n][n];
	
	int e = 0;//az a szám amivel feltöltöm a tömböt

	for (int k=0;k<((int)Math.ceil(n/2.0));k++){

	//felső sorok feltöltése balról jobbra
	for (int i=k;i<n-k;i++){
	  tomb[k][i] = e;
	  e++;
	}
	
	//jobb oldali oszlopok feltöltése fentről lefele
	for (int i=1+k;i<n-k;i++){
	  tomb[i][n-1-k] = e;
	  e++;
	}
        
	//alsó sorok feltöltése jobbról balra
	for (int i=n-2-k;i>=k;i--){
	  tomb[n-1-k][i] = e;
	  e++;
	}

	//bal oldali oszlopok feltöltése alulról felfele
	for (int i=n-2-k;i>k;i--){
	  //tomb[i-k][k] = e;
	  tomb[i][k] = e;
	  e++;
	}

	}//k ciklus end
	
	kiir(tomb, n);
	}//try end
	catch (Exception e) {
	    System.out.println("Nem lett megadva a paraméter vagy nem pozitív egész szám!");
	}//catch end
    }//main end
}