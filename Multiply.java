package assignment3.poynomial;
import java.util.Scanner;

public class Multiply{
    public static void main(String[] args){
        int n,m,k;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter highest power of 1st polynomial");
        n = s.nextInt();
        
        System.out.println("Enter highest power of 2nd polynomial");
        m = s.nextInt();
        
        int[] p1 = new int[n+1]; //n+1 terms in 1st polynomial
        int[] p2 = new int[m+1]; //m+1 terms in 2nd polynomial
        int[] p3 = new int[m+n+1];  //highest power of resultant polynomial is m+n
        
        System.out.println("Enter 1st polynomial coefficients");
        for(int i=0;i<(n+1);i++)
            p1[i] = s.nextInt();
        
        System.out.println("Enter 2nd polynomial coefficients");
        for(int i=0;i<(m+1);i++)
            p2[i] = s.nextInt();       
        
        for(int i=0;i<(n+1);i++){
            k = i;
            for(int j=0;j<(m+1);j++){
                p3[k] += p1[i]*p2[j];
                k++;
            }
        }
        for(int i=0;i<(n+m+1);i++)
            System.out.print(p3[i]+"a"+(p3.length-i-1)+" ");
    }
}