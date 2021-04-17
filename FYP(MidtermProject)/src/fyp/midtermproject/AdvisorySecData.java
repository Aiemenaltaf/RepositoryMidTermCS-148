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
public class AdvisorySecData {
    public String STD_Name1;
    public String STD_Name2;
    public String STD_ID1;
    public String STD_ID2;
    public String Project;
    public String Each_evl;
    public String Total_evl;
    
    
    public AdvisorySecData(String STD_Name1, String STD_Name2, String STD_ID1, String STD_ID2, String Project, String Each_evl, String Total_evl)
    {    
        this.STD_Name1 = STD_Name1;
        this.STD_Name2 = STD_Name2;
        this.STD_ID1 = STD_ID1;
        this.STD_ID2 = STD_ID2;
        this.Project = Project;
        this.Each_evl = Each_evl;
        this.Total_evl= Total_evl;
            
    }    
    
    public String getSTD_Name1()
    {
      return STD_Name1;   
    }
    
    public String getSTD_Name2()
    {
      return STD_Name2;   
    }
     
    public String getSTD_ID1()
    {
      return STD_ID1;   
    }
    public String getSTD_ID2()
    {
      return STD_ID1;   
    } 
     public String getProject()
    {
      return Project;   
    }
     
    public String getEach_evl()
    {
      return Each_evl;   
    }
    public String getTotal_evl()
    {
      return Total_evl;   
    } 
}
