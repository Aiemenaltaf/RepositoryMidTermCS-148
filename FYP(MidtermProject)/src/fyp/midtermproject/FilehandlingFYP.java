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
import java.io.IOException;
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
        } catch (IOException ex) {
             JOptionPane.showMessageDialog(null,"Exception message" + ex);
        }
    }
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
        } catch (IOException ex) {
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
        } catch (IOException ex) {
             JOptionPane.showMessageDialog(null,"Exception message" + ex);
        }
    }
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
        } catch (IOException ex) {
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
        } catch (IOException ex) {
             JOptionPane.showMessageDialog(null,"Exception message" + ex);
        }
    } 
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
        } catch (IOException ex) {
             JOptionPane.showMessageDialog(null,"Exception message" + ex);
        }
     }
    //**********************************************************************************
   //Data of EvaluationCrietria
    
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
        } catch (IOException ex) {
             JOptionPane.showMessageDialog(null,"Exception message" + ex);
        }
    }
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
        } catch (IOException ex) {
             JOptionPane.showMessageDialog(null,"Exception message" + ex);
        }
     }
    //**********************************************************************************
     //Data of EvaluationMarksheet
    
    public List<AdvisorySecData> A1;
    public void saveEvlMarksData(String filename)
    {
        try{
            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write("1st StudentName,2nd StudentName,1st StudentID,2nd StudentID,Project,Each_Evaluation,Total_Evaluation\n");
            
            for(int i = 0 ; i < A1.size();i++)
            {
                bw.write(A1.get(i).getSTD_Name1()+ ", "+
                         A1.get(i).getSTD_Name2()+ ","+
                         A1.get(i).getSTD_ID1()+ ","+
                         A1.get(i).getSTD_ID2()+ ","+
                         A1.get(i).getProject()+ ","+
                         A1.get(i).getEach_evl()+ ","+
                         A1.get(i).getTotal_evl()+ " \n");
            }
            
            bw.flush();
            bw.close();
            fw.close();
        } catch (IOException ex) {
             JOptionPane.showMessageDialog(null,"Exception message" + ex);
        }
    }
    public void loadEvlMarksData(String filename)
    {
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            
          String line = br.readLine();
            
          line = br.readLine();
          while(line != null)
          {
               String[] toks = line.split(",");
               new AdvisorySecData(toks[0],toks[1],toks[2],toks[3],toks[4],toks[5],toks[6]);
               
          }
            
            br.close();
            fr.close();
        } catch (IOException ex) {
             JOptionPane.showMessageDialog(null,"Exception message" + ex);
        }
     }
    //**********************************************************************************
    
    //**********************************************************************************
     //Data of AssignAdvisor
    
      public List<AssignAdvData> As1;
    public void saveAssignAdvisorData(String filename)
    {
        try{
            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write("ID of 1st Student,ID of 2nd Student,Project Name, Advisor name\n");
            
            for(int i = 0 ; i < As1.size();i++)
            {
                bw.write(As1.get(i).getSTD_ID1()+ ", "+
                         As1.get(i).getSTD_ID2()+ ","+
                         As1.get(i).getProjName()+ ","+
                         As1.get(i).getAdvisorName()+" \n");
            }
            
            bw.flush();
            bw.close();
            fw.close();
        } catch (IOException ex) {
             JOptionPane.showMessageDialog(null,"Exception message" + ex);
        }
    }
    public void loadAssignAdvisorData(String filename)
    {
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            
          String line = br.readLine();
            
          line = br.readLine();
          while(line != null)
          {
               String[] toks = line.split(",");
               new AssignAdvData(toks[0],toks[1],toks[2],toks[3]);
               
          }
            
            br.close();
            fr.close();
        } catch (IOException ex) {
             JOptionPane.showMessageDialog(null,"Exception message" + ex);
        }
     }
    //**********************************************************************************
     //**********************************************************************************
     //Data of Std Project Selection
    
    public List<STDSelecData> SD1;
    public void saveSTDselectionData(String filename)
    {
        try{
            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write("1st StudentName,2nd StudentName,1st StudentID,2nd StudentID,1st StudentSession,2nd StudentSession,Project\n");
            
            for(int i = 0 ; i < SD1.size();i++)
            {
                bw.write(SD1.get(i).getName1()+ ", "+
                         SD1.get(i).getName2()+ ","+
                         SD1.get(i).getID1()+ ","+
                         SD1.get(i).getID2()+ ","+
                         SD1.get(i).getSession1()+ ","+
                         SD1.get(i).getSession2()+ ","+
                         SD1.get(i).getProject()+ " \n");
            }
            
            bw.flush();
            bw.close();
            fw.close();
        } catch (IOException ex) {
             JOptionPane.showMessageDialog(null,"Exception message" + ex);
        }
    }
    public void loadSTDselectionData(String filename)
    {
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            
          String line = br.readLine();
            
          line = br.readLine();
          while(line != null)
          {
               String[] toks = line.split(",");
               new  STDSelecData(toks[0],toks[1],toks[2],toks[3],toks[4],toks[5],toks[6]);
               
          }
            
            br.close();
            fr.close();
        } catch (IOException ex) {
             JOptionPane.showMessageDialog(null,"Exception message" + ex);
        }
     }
    //**********************************************************************************
    
    

}
