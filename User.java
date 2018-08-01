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
class User {
    //private int sno;
    private String pname;
    private int uprice;
    private int pid;
    private int quantity;
     private int total;
    
    
    public User(int pid,String pname,int uprice,int quantity,int total){
    this.pid=pid;
    this.pname=pname;
    this.uprice=uprice;
    this.quantity=quantity;
    this.total=total;
    }
    
    public int getpid(){
    return pid;
    }
    
    public String getpname(){
    return pname;
    }
    public int getuprice(){
    return uprice;
    }
   /* public int getnet_amount(){
    return netamount;
    }*/
    public int getquantity(){
    return quantity;
    }
    public int gettotal_amount(){
    return total;
    }
}
