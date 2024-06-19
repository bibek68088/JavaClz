/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_one;  // Package declaration

import java.io.*;  // Importing I/O classes
import java.net.InetAddress;  // Importing InetAddress class for IP handling
import java.net.UnknownHostException;  // Importing UnknownHostException class for handling unknown hosts

public class ServerLog {
    public static void main(String[] args) {
        // Path to the server log file
        String log_path = "C:\\Users\\Dinesh\\IdeaProjects\\NetworkProgrammingLab\\src\\lab_1\\serverlog.log";
        
        try (
            // FileInputStream to read the file
            FileInputStream fin = new FileInputStream(log_path);
            // InputStreamReader to convert byte stream to character stream
            Reader in = new InputStreamReader(fin);
            // BufferedReader to read text from the character input stream
            BufferedReader bin = new BufferedReader(in)
        ) {
            // Read each line from the log file
            for (String entry = bin.readLine(); entry != null; entry = bin.readLine()) {
                // Separate out the IP address from the rest of the log entry
                int index = entry.indexOf(' ');  // Find the first space character
                String ip = entry.substring(0, index);  // Extract the IP address
                String theRest = entry.substring(index);  // Extract the rest of the log entry
                
                // Print the IP address indicating access by the client
                System.out.println("Access by client " + ip);
            }
        } catch (IOException e) {
            // Handle any IO exceptions
            System.out.println(e);
        }
    }
}
