package fr.dauphine.ja.hafidkamilia.td00;
import java.util.ArrayList;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class PrimeCollection
{
	
public  ArrayList <Integer> numbers; 

	
	public PrimeCollection(){
		this.numbers= new ArrayList<Integer> () ;
	}
	
	
	public  void initRandom(int n , int m) {
		int nombre_aleatoire ;
		for(int i=0;i<n;i++) {
	      nombre_aleatoire=(int)(Math.random()*(m)+1);
	     ((java.util.ArrayList<Integer>) this.numbers).add(nombre_aleatoire);
		}
	}
		
		
		

	
private boolean isPrime(int p){
    int z=0;
 
    for(int i=1;i<=p;i++) {
         if (p%i==0)  z++;
                                }
    if (z==2)
        return true;
        else  return false;
   
   
   
}   
public void printPrimes() {
   
	for (Integer t:numbers) {
        if (isPrime(t)==true)
        System.out.println(t);
   
       
    }
   
}
public static void main (String[] args) {
    PrimeCollection a = new PrimeCollection();

 a.initRandom(100, 2000);
 a.printPrimes();
  
    System.out.println(a.isPrime(7));
    a.printPrimes();
}
}

	

