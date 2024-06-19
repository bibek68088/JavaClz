/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB8;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author bibek
 */
public class Assignment1_Content {
     public static void main(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("D:\\JavaPrograms\\file1.txt");
        String str = "Video provides a powerful way to help you prove your point. When you click Online\n"
                + "Video, you can paste in the embed code for the video you want to add. You can also\n"
                + "type a keyword to search online for the video that best fits your document. To make\n"
                + "your document look professionally produced, Word provides header, footer, cover\n"
                + "page, and text box designs that complement each other. For example, you can add a\n"
                + "matching cover page, header, and sidebar. Click Insert and then choose the elements\n"
                + "you want from the different galleries. Themes and styles also help keep your document\n"
                + "coordinated.";
        byte[] b = str.getBytes();
        fout.write(b);
        System.out.println("\nInformation is stored into the file");
        fout.close();
    }
}
