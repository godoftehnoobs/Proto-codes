/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jc878
 */
class sortingla {package sortingla;

public class Sortinglg {
    public static void main(String[] args) {
        int a = 45, b = 250, c = 86, d = 55, e = 99;
        int highest = a;
        int lowest = a;

        // Find the highest number
        if (b > highest) highest = b;
        if (c > highest) highest = c;
        if (d > highest) highest = d;
        if (e > highest) highest = e;

        System.out.println("The highest number is ==> " + highest);

        // Find the lowest number
        if (b < lowest) lowest = b;
        if (c < lowest) lowest = c;
        if (d < lowest) lowest = d;
        if (e < lowest) lowest = e;

        System.out.println("The lowest number is ==> " + lowest);
    }
}

    
}
