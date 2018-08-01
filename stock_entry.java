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
public class stock_entry {
    
    
     private String pname;
    private int uprice;
    private String date;
    private int quantity;
     private int total;
    
    
    public stock_entry(String pname,int uprice,int quantity,String date,int total){
   // this.sno=sno;
    this.pname=pname;
    this.uprice=uprice;
    this.quantity=quantity;
   this.date=date;
    this.total=total;
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
    public String getdate(){
    return date;
    }
    public int getquantity(){
    return quantity;
    }
    public int gettotal_amount(){
    return total;
    }
    
}
