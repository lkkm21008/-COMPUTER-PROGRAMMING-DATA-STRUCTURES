/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
 * @author admin
 */
import java.util.*;
public class MI2C_HWK9_412631383_03 {
    public static void main(String[] args) {
        String s = "The product ID of this item is a111bc34d. It is a derivative product of m785xz66K";

        String result = s.replaceAll("([a-zA-Z])(\\d+)([a-zA-Z])(\\d+)", 
                                      "$3-$4$2$1".toUpperCase());

        System.out.println(result);
    }
}
