/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author bibek
 */
public class Assignment5_LongestWord {
    public static void main(String[] args) throws FileNotFoundException {
        new Assignment5_LongestWord().findLongestWords();
    }

    public String findLongestWords() throws FileNotFoundException {

        String longest_word = "";
        String current;
        Scanner sc = new Scanner(new File("D://JavaPrograms//file1.txt"));

        while (sc.hasNext()) {
            current = sc.next();
            if (current.length() > longest_word.length()) {
                longest_word = current;
            }

        }
        System.out.println("\n" + longest_word + "\n");
        return longest_word;
    }
}
