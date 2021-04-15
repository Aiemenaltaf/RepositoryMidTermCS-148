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
public class AdvisoryData {
    public String AdvName;
    public String AdvCNIC;
    public String AdvEmail;
    public String AdvPhoneNo;
    
    public AdvisoryData(String AdvName, String AdvCNIC, String AdvEmail, String AdvPhoneNo)
    {    
        this.AdvName = AdvName;
        this.AdvCNIC = AdvCNIC;
        this.AdvEmail = AdvEmail;
        this.AdvPhoneNo = AdvPhoneNo;
    }    
    
    public String getAdvName()
    {
      return AdvName;   
    }
    
    public String getAdvCNIC()
    {
      return AdvCNIC;   
    }
     
    public String getAdvEmail()
    {
      return AdvEmail;   
    }
    public String getAdvPhoneNo()
    {
      return AdvPhoneNo;   
    }
    
}
