import java.util.Scanner;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
            int a[]=new int[5];
            int b[]=new int[5];
            int i,k=0,isthere=0,j;
            for(i=0;i<a.length;i++){
                System.out.println("enter values");
                a[i]=scan.nextInt();
            }
            for(i=0;i<a.length;i++){
                isthere=0;
                for(j=0;j<k;j++){
                    if(a[i]==b[j]){
                        isthere=1;
                        break;
                       
                    }
                   
                    
                }if(isthere==0){
                    b[k]=a[i];
                    k++;
                }
            }System.out.println("after removing duplicates");
            for(i=0;i<k;i++){
                  System.out.println(b[i]);
               
            }
        }
    }
    

