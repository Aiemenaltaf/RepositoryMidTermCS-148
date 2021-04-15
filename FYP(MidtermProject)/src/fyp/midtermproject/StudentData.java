/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fyp.midtermproject;

/**
 *
 * @author Altaf Hussain
 */
public class StudentData {
    public String StdName;
    public String StdID;
    public String StdEmail;
    public String StdCNIC;
    
    public StudentData(String StdName, String StdID, String StdEmail, String StdCNIC)
    {    
        this.StdName = StdName;
        this.StdID = StdID;
        this.StdEmail = StdEmail;
        this.StdCNIC = StdCNIC;
    }    
    
     public String getStdName()
    {
      return StdName;   
    }
    
    public String getStdID()
    {
      return StdID;   
    }
     
    public String getStdEmail()
    {
      return StdEmail;   
    }
    public String getStdCNIC()
    {
      return StdCNIC;   
    }

}
