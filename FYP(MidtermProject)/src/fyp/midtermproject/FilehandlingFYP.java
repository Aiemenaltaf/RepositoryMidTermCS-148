/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fyp.midtermproject;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author Altaf Hussain
 */
public class FilehandlingFYP {
    
    //***********************************************************************
    //Data of Project
    public List<ProjectsData> P1;
    public void saveProjectData(String filename)
    {
        try{
            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write("Title, Type, Description\n");
            
            for(int i = 0 ; i < P1.size();i++)
            {
                bw.write(P1.get(i).getTitle() + ", "+
                        P1.get(i).getType() + ","+
                        P1.get(i).getDescription() + " \n");
            }
            
            bw.flush();
            bw.close();
            fw.close();
        } catch (Exception ex) {
             JOptionPane.showMessageDialog(null,"Exception message" + ex);
        }
    }
    //P1 
    public void loadProjectData(String filename)
    {
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            
          String line = br.readLine();
            
          line = br.readLine();
          while(line != null)
          {
               String[] toks = line.split(",");
               new ProjectsData(toks[0],toks[1],toks[2]);
               
          }
            
            br.close();
            fr.close();
        } catch (Exception ex) {
             JOptionPane.showMessageDialog(null,"Exception message" + ex);
        }
     }
    //**********************************************************************************


//Data of Students    
    //******************************************************************************
    public List<StudentData> s1;
    public void saveStudentData(String filename)
    {
        try{
            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write("STD Name, STD ID, STD Email, STD CNIC\n");
            
            for(int i = 0 ; i < s1.size();i++)
            {
                bw.write(s1.get(i).getStdName() + ", "+
                        s1.get(i).getStdID() + ","+
                        s1.get(i).getStdEmail() + "," +
                        s1.get(i).getStdCNIC() + " \n");
            }
            
            bw.flush();
            bw.close();
            fw.close();
        } catch (Exception ex) {
             JOptionPane.showMessageDialog(null,"Exception message" + ex);
        }
    }
    //P1 
    public void loadStudentData(String filename)
    {
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            
          String line = br.readLine();
            
          line = br.readLine();
          while(line != null)
          {
               String[] toks = line.split(",");
               new StudentData(toks[0],toks[1],toks[2],toks[3]);
               
          }
            
            br.close();
            fr.close();
        } catch (Exception ex) {
             JOptionPane.showMessageDialog(null,"Exception message" + ex);
        }
     }
    //**********************************************************************************

    
//Data of Advisory Board
    //******************************************************************************
    public List<AdvisoryData> a1;
    public void saveAdvisoryData(String filename)
    {
        try{
            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write("ADV Name, ADV CNIC, ADV Email, ADV PhoneNo.\n");
            
            for(int i = 0 ; i < a1.size();i++)
            {
                bw.write(a1.get(i).getAdvName() + ", "+
                        a1.get(i).getAdvCNIC() + ","+
                        a1.get(i).getAdvEmail() + "," +
                        a1.get(i).getAdvPhoneNo() + " \n");
            }
            
            bw.flush();
            bw.close();
            fw.close();
        } catch (Exception ex) {
             JOptionPane.showMessageDialog(null,"Exception message" + ex);
        }
    }
    //P1 
    public void loadAdvisoryData(String filename)
    {
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            
          String line = br.readLine();
            
          line = br.readLine();
          while(line != null)
          {
               String[] toks = line.split(",");
               new AdvisoryData(toks[0],toks[1],toks[2],toks[3]);
               
          }
            
            br.close();
            fr.close();
        } catch (Exception ex) {
             JOptionPane.showMessageDialog(null,"Exception message" + ex);
        }
     }
    //**********************************************************************************

      public List<EvaluationData> E1;
    public void saveEvlCriteriaData(String filename)
    {
        try{
            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write("Assignment Title, Marks,Rubrics,Deadline\n");
            
            for(int i = 0 ; i < E1.size();i++)
            {
                bw.write(E1.get(i).getEvlTitle()+ ", "+
                        E1.get(i).getEvlMarks()+ ","+
                        E1.get(i).getEvlRubrics()+ ","+
                        E1.get(i).getEvlDaeadline()+ " \n");
            }
            
            bw.flush();
            bw.close();
            fw.close();
        } catch (Exception ex) {
             JOptionPane.showMessageDialog(null,"Exception message" + ex);
        }
    }
    //P1 
    public void loadEvlCriteriaData(String filename)
    {
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            
          String line = br.readLine();
            
          line = br.readLine();
          while(line != null)
          {
               String[] toks = line.split(",");
               new  EvaluationData(toks[0],toks[1],toks[2],toks[3]);
               
          }
            
            br.close();
            fr.close();
        } catch (Exception ex) {
             JOptionPane.showMessageDialog(null,"Exception message" + ex);
        }
     }
    //**********************************************************************************

}
