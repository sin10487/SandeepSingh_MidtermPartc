/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
@ Sandeep Singh
 */
package status;

/**
 * june 24th
 * @author srinivsi
 */
public class StausUser 
{
    public enum Userenum{REJECTED, PENDING, PROCESSING, APPROVED}
    
        
    
   public void statusDetail(String code)
{
switch(code.toUpperCase())
        {
        case "ZERO": System.out.println(Userenum.REJECTED);
        break;
        case "ONE": System.out.println(Userenum.PENDING);
        break;
        case "TWO":
        System.out.println(Userenum.PROCESSING);
        break;
        case "THREE": 
            System.out.println(Userenum.APPROVED);
        break;
        default:
         System.out.println("NOT VALID CODE");
        break;
        }
}
 
}
