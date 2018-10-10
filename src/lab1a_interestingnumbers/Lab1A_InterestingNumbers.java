/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1a_interestingnumbers;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author Vilius
 */
public class Lab1A_InterestingNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lab1A_InterestingNumbers inz1 = new Lab1A_InterestingNumbers();
        Printer print = new Printer();
        print.Print(inz1.NDigitNumber(962, 1521));
        System.out.println("Kitas: ");
        print.Print(inz1.NDigitNumber(999_999_9, 114_000_00));
        System.out.println("Kitas: ");
        print.Print(inz1.NDigitNumber(100, 1000));
    }

    // Returns number list, where numbers meet these conditions:
    // is square of whole number, and its sum of first two and
    // last two digits is also a square.
    /**
    *   @param k start
    *   @param n end
    */
    List<Long> NDigitNumber(long k, long n) {
        List<Long> l = new ArrayList<>();
        System.out.printf("Testuojama nuo %d iki %d\n", k, n);
        // a - int, which square is  >= k
        // b - int, which square is  <= n 
        int a = (int) Math.ceil((Math.sqrt(k)));
        int b = (int) Math.floor((Math.sqrt(n)));
        for (int i = a; i <= b; i++) {          
            long sk = i * i;
            int len = String.valueOf(sk).length();
            int pr = (int) sk / (int) (Math.pow(10, len - 2));
            int pb = (int) sk % 100;
            int sum = pr + pb;
            //whole number square
            if (Math.sqrt(sum) == Math.round(Math.sqrt(sum))) {
                //System.out.println(sk + " " + pr + " " + pb + " " + sum);
                l.add(sk);
            }
        }
        Collections.sort(l);
        Collections.reverse(l);
        return l;
    }

}
