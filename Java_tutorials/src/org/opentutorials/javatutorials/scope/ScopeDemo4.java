package org.opentutorials.javatutorials.scope;
 
public class ScopeDemo4 {
    static void a(){
        String title = "coding everybody";
    }
    public static void main(String[] args) {
        a();
        //System.out.println(title);
    }
 
}