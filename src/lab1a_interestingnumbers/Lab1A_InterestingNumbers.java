/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1a_interestingnumbers;

import java.util.List;
import java.util.ArrayList;

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
        //maziausia reiksme 31*31 + 1 = 962; 32*32 = 1024
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
        // a - int, which square is  >= k
        // b - int, which square is  <= n
        int a = (int) Math.ceil((Math.sqrt(k)));
        int b = (int) Math.floor((Math.sqrt(n)));
        System.out.println("a: " + a + ", b: " + b);
        System.out.println("a*a: " + a * a + ", b*b: " + b * b);
        for (int i = a; i <= b; i++) {          
            long sk = i * i;
            int len = String.valueOf(sk).length();
            int pr = (int) sk / (int) (Math.pow(10, len - 2));
            int pb = (int) sk % 100;
            int sum = pr + pb;
            //jeigu suma yra naturalaus skaiciaus kvadratas
            if (Math.sqrt(sum) == Math.round(Math.sqrt(sum))) {
                //System.out.println(sk + " " + pr + " " + pb + " " + sum);
                l.add(sk);
            }
        }
        return l;
    }

}
