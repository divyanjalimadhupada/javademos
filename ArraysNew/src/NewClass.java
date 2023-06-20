
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class NewClass {
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a[]=new int[5];
        int i,isthere=0;
        for(i=0;i<a.length;i++){
        System.out.println("enter elements ");
        a[i]=scan.nextInt();
        }
        System.out.println("enter target");
        int target=scan.nextInt();
        for(i=0;i<a.length;i++){
            if(a[i]==target){
                isthere=0;
                break;
            }
        }if(isthere==1){
            System.out.println("target present");
        }else{
                System.out.println("no target element");
                }
    }
    
    
}
