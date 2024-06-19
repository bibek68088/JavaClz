/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_three;

import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.List;

/**
 * Write a java program to store, retrieve, delete the cookies in default cookie store
 *
 * @author bibek
 */
public class cookieStore {
    public static void main(String[] args) {
        // Create a default CookieManager
        CookieManager cookieManager = new CookieManager();
        CookieStore cookieStore = cookieManager.getCookieStore();

        // Define the URI to associate with the cookies
        URI uri = URI.create("http://www.oic.edu.np");

        // Create a new cookie
        HttpCookie cookie1 = new HttpCookie("username", "bibek88");
        HttpCookie cookie2 = new HttpCookie("session", "xyz123");

        // Add the cookies to the cookie store
        cookieStore.add(uri, cookie1);
        cookieStore.add(uri, cookie2);

        // Retrieve cookies from the cookie store
        List<HttpCookie> cookies = cookieStore.get(uri);
        System.out.println("Cookies for " + uri + ":");
        for (HttpCookie cookie : cookies) {
            System.out.println(" - " + cookie);
        }

        // Delete a specific cookie
        cookieStore.remove(uri, cookie1);

        // Verify the cookies after deletion
        cookies = cookieStore.get(uri);
        System.out.println("Cookies for " + uri + " after deletion:");
        for (HttpCookie cookie : cookies) {
            System.out.println(" - " + cookie);
        }
    }
}
