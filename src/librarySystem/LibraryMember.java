/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package librarySystem;

/**
 *
 * @author tarra7926
 */
public class LibraryMember {

    private static int numMembers = 0;
    private int id;
    private String name;
    private String address;
    private int phoneNumber;

    public LibraryMember(String name, String address, int phoneNumber) {
        LibraryMember.numMembers++;
        this.id = LibraryMember.numMembers;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public String getName(){
        return this.name;
    }
    public int getID(){
        return this.id;
    }
}
