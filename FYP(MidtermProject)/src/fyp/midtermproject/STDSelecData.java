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
public class STDSelecData {
    public String Name1;
    public String Name2;
    public String ID1;
    public String ID2;
    public String Session1;
    public String Session2;
    public String Project;
    
    
    public STDSelecData(String Name1,String Name2,String ID1,String ID2,String Session1,String Session2,String Project)
    {    
        this.Name1 = Name1;
        this.Name2 = Name2;
        this.ID1 = ID1;
        this.ID2 = ID2;
        this.Session1 = Session1;
        this.Session2 = Session2;
        this.Project = Project;
            
    }    
    
    public String getName1()
    {
      return Name1;   
    }
    
    public String getName2()
    {
      return Name2;   
    }
     
    public String getID1()
    {
      return ID1;   
    }
    public String getID2()
    {
      return ID2;   
    } 
     public String getSession1()
    {
      return Session1;   
    }
     
    public String getSession2()
    {
      return Session2;   
    }
    public String getProject()
    {
      return Project;   
    } 
}
