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
public class AssignAdvData {
       
    public String STD_ID1;
    public String STD_ID2;
    public String ProjName;
    public String AdvisorName;
    
    public AssignAdvData( String STD_ID1,String STD_ID2, String ProjName,String AdvisorName)
    {    
        this.STD_ID1 = STD_ID1;
        this.STD_ID2 = STD_ID2;
        this.ProjName = ProjName;
        this.AdvisorName = AdvisorName;
    }    
    
    public String getSTD_ID1()
    {
      return STD_ID1;   
    }
    
    public String getSTD_ID2()
    {
      return STD_ID2;   
    }
     
    public String getProjName()
    {
      return ProjName;   
    }
    public String getAdvisorName()
    {
      return AdvisorName;   
    } 
}
