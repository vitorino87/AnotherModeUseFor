/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anothermodeusefor;

/**
 *
 * @author Win7
 */
public class AnotherModeUseFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ar[]={1,2,3,4,5,6,7,8,9,10};
        for(int x : ar){
            System.out.print(x+" ");
            x=x*10; //no effect on nums
            
        }
        System.out.println();
        for(int x:ar)
            System.out.print(x+" ");
    }
    
}
