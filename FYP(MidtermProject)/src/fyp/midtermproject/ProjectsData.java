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
public class ProjectsData {
    
    public String ProjectTitle;
    public String ProjectType;
    public String ProjectDescpt;
    
    public ProjectsData(String ProjectTitle, String ProjectType, String ProjectDescpt )
    {    
        this.ProjectTitle = ProjectTitle;
        this.ProjectType=ProjectType;
        this.ProjectDescpt= ProjectDescpt;
    }    

      
      
    public String getTitle()
    {
      return ProjectTitle;   
    }
    
    public String getType()
    {
      return ProjectType;   
    }
     
    public String getDescription()
    {
      return ProjectDescpt;   
    }
    
}
