/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample_shop;

/**
 *
 * @author Shivi
 */
public class monthly_products {
        
    
    
     private String pname;
    private int uprice;
    private int quantity;
     private String date;
     
    public monthly_products(String pname,int uprice,int quantity,String date){
   // this.sno=sno;
    this.pname=pname;
    this.uprice=uprice;
    this.quantity=quantity;
    this.date=date;
    }
    
   /* public int getsno(){
    return sno;
    }*/
    public String getpname(){
    return pname;
    }
    public int getuprice(){
    return uprice;
    }
    public int getquantity(){
    return quantity;
    }
    public String getdate(){
    return date;
    }
}
