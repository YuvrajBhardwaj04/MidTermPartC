/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author yuvra
 */
public class TestUserprofile {
    
    public static void main(String[] args){
        
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String names = input.nextLine();
        for(int i = 0; i < genres.length; i++ ){
            System.out.println(genres[i]);
        }
        System.out.print("Enter the genre from the displayed list : ");
        String favGenre = input.nextLine();
        UserProfile up =new UserProfile(names, favGenre);
        up.setGenre(favGenre);
        up.setUserID(names);
        System.out.println("The profile is created");
    }
}
