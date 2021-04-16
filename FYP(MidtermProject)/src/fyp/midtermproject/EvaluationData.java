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
public class EvaluationData {
    
    public String EvlTitle;
    public String EvlMarks;
    public String EvlRubrics;
    public String EvlDaeadline;
    
    public EvaluationData( String EvlTitle, String EvlMarks, String EvlRubrics, String EvlDaeadline)
    {    
        this.EvlTitle = EvlTitle;
        this.EvlMarks = EvlMarks;
        this.EvlRubrics = EvlRubrics;
        this.EvlDaeadline = EvlDaeadline;
    }    
    
    public String getEvlTitle()
    {
      return EvlTitle;   
    }
    
    public String getEvlMarks()
    {
      return EvlMarks;   
    }
     
    public String getEvlRubrics()
    {
      return EvlRubrics;   
    }
    public String getEvlDaeadline()
    {
      return EvlDaeadline;   
    } 
}
