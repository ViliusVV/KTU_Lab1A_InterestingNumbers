/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1a_interestingnumbers;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author Vilius
 */
public class Printer {

    public void Print(List<Long> l) {
        System.out.println("Spausdinamas sarasas");
        if(l.isEmpty())
        {
            System.out.println("Nera elementu!");
            return;
        }
        Collections.reverse(l);
        for (long sk : l) {
            int len = (int)Math.log10(sk) + 1;
            int pr = (int) sk / (int) (Math.pow(10, len - 2));
            int pb = (int) sk % 100;
            System.out.printf("%d sqrt(%d)=%s %d+%d=%d\n", sk, sk, Math.sqrt(sk), pr, pb, pr + pb);
        }
    }
}