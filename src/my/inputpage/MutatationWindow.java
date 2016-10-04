/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.inputpage;

import java.awt.Color;
import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.File;
//import java.io.FileUtils;
//import org.apache.commons.io.FileUtils;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import static my.inputpage.inputpageUI.directory;

/**
 *
 * @author Ashish
 */
public class MutatationWindow extends javax.swing.JFrame {
    int count;int ii;
    int count1;int countc;
    String filename1;
    String numInputs;
    String yeah;
    String cc;
    String myStr;

    /**
     * Creates new form MutatationWindow
     */
    static final String directory = "C:\\file store";
    public MutatationWindow() throws FileNotFoundException {
        
        initComponents();
        count=0;count1=0;cc="0";
        numInputs="1";countc=0;
        yeah="4";myStr="";
        ii=0;
        String text0="";
        File f0 = new File("C:\\file store\\GetFileName.txt");
        String filename0 = f0.getAbsolutePath();
        java.io.File file0 = new java.io.File(filename0);
        try{
            Scanner input0 = new Scanner(file0);
            while(input0.hasNext()){
                text0 = text0 + input0.nextLine();
                
            }
        }
        catch(FileNotFoundException e){
        System.err.format("File does not exist \n");
        }
        filename1=text0;
        String text="";
        //File f = new File("C:\\file store\\check\\check.c");
        File f = new File( directory + "\\" + filename1 + "\\" + filename1 + ".c");
        //jTextArea1.setText(directory + "\\" + filename1 + "\\" + filename1 + ".c");
        String filename = f.getAbsolutePath();
        java.io.File file = new java.io.File(filename);
        try{
            Scanner input = new Scanner(file);
            while(input.hasNext()){
                text = text + input.nextLine() + "\n";
                
            }
            jTextArea1.setText(text);
            jTextArea1.setEditable(false);
        }
        catch(FileNotFoundException e){
            System.err.format("File does not exist \n");
        }
        String text1="";
        File f1 = new File(directory + "\\" + filename1 + "\\" + "output.txt");
        String filename2 = f1.getAbsolutePath();
        java.io.File file1 = new java.io.File(filename2);
        try{
            Scanner input1 = new Scanner(file1);
            while(input1.hasNext()){
                text1 = text1 + input1.nextLine()+ "\n";
                
            }
            jTextArea4.setText(text1);
            jTextArea4.setEditable(false);
        }
        catch(FileNotFoundException e){
            System.err.format("File does not exist \n");
        }
        File f7 = new File(directory + "\\" + filename1 + "\\" + "Mutation");
                int countcc = 0;
                for (File file33 : f7.listFiles()) {
                        if (file.isFile()) {
                                countcc++;
                        }
                }
                countc=countcc/4;
                System.out.println("Number of files: " + countc);
                myStr = Integer.toString(countc);
                  jTextArea7.setText(myStr);
                  String ashish11 = directory +"\\"+ filename1 +"\\"+ "TotalNoOfMutants.txt";
                    try{
                            FileWriter writer = new FileWriter( ashish11 );
                             BufferedWriter bw = new BufferedWriter ( writer );
                            jTextArea7.write(bw);
                        }  catch (IOException ex) {
                            Logger.getLogger(MutatationWindow.class.getName()).log(Level.SEVERE, null, ex);
                                }
//new File(directory + "\\" + filename1 + "\\" + "Mutation").listFiles().length;
        for(ii=1;ii<countc+1;ii++)
        {  
            cc = Integer.toString(ii);
          
            FileInputStream fstream1;
              fstream1 = new FileInputStream(directory + "\\" + filename1 + "\\" + "output.txt");
            FileInputStream fstream2;
              fstream2 = new FileInputStream(directory + "\\" + filename1 + "\\" + "Mutation" +"\\"+ "result" +cc+".txt");
           
            
            DataInputStream in1= new DataInputStream(fstream1);
            DataInputStream in2= new DataInputStream(fstream2);
            
            BufferedReader br1 = new BufferedReader(new InputStreamReader(in1));
            BufferedReader br2 = new BufferedReader(new InputStreamReader(in2));
            
            String strLine1, strLine2;
            String s1="",s2="",z1="",z2="";
            try {
                while ((z1 = br1.readLine()) != null)
                s1 += z1;

                while ((z2 = br2.readLine()) != null)
                s2 += z2;

                    if (s1.equals(s2)) {
                     count1++;
                        }
                /*while((strLine1 = br1.readLine()) != null && (strLine2 = br2.readLine()) != null){
                    if(strLine1.equals(strLine2)){
                        count1++;
                    }
                }*/
            } catch (IOException ex) {
                Logger.getLogger(MutatationWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                  String myString = Integer.toString(count1);
                  jTextArea6.setText(myString);
     String ashish = directory +"\\"+ filename1 +"\\"+ "NoOfEquivalence.txt";
     try{
         FileWriter writer = new FileWriter( ashish );
         BufferedWriter bw = new BufferedWriter ( writer );
         jTextArea6.write(bw);
     }  catch (IOException ex) {
            Logger.getLogger(MutatationWindow.class.getName()).log(Level.SEVERE, null, ex);
     }
    }

    MutatationWindow(String mutatationWindow) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SelectMutants = new javax.swing.JComboBox();
        ListMutants = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("Original Program");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jLabel2.setText("Mutated Program");

        jButton5.setText("GoTo Result Page");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setText("Output");

        jTextArea3.setColumns(2);
        jTextArea3.setRows(2);
        jScrollPane2.setViewportView(jTextArea3);

        jTextArea4.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea4.setColumns(1);
        jTextArea4.setRows(1);
        jScrollPane4.setViewportView(jTextArea4);

        jTextArea5.setColumns(1);
        jTextArea5.setRows(1);
        jScrollPane5.setViewportView(jTextArea5);

        jLabel4.setText("Original Output");

        jTextArea6.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea6.setColumns(1);
        jTextArea6.setRows(1);
        jScrollPane6.setViewportView(jTextArea6);

        jTextArea7.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea7.setColumns(1);
        jTextArea7.setRows(1);
        jScrollPane7.setViewportView(jTextArea7);

        jLabel5.setText("/");

        jLabel6.setText("Mutants Survived/Total Mutants");

        SelectMutants.setModel(SelectMutants.getModel());
        SelectMutants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectMutantsActionPerformed(evt);
            }
        });

        ListMutants.setText("List Mutants");
        ListMutants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListMutantsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(SelectMutants, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(ListMutants)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(149, 149, 149)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel5)
                                            .addGap(18, 18, 18)
                                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(74, 74, 74)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(46, 46, 46)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(69, 69, 69)))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 61, Short.MAX_VALUE)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addComponent(jLabel6)
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ListMutants)
                        .addGap(23, 23, 23)
                        .addComponent(SelectMutants, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    Result s = new Result ();
    s.setVisible(true);
    s.setIconImage(new ImageIcon("C:\\Project\\abc.jpg").getImage());  
    this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed
    private void formWindowActivated(java.awt.event.WindowEvent evt) {                                     
    SelectMutants.removeAllItems();
    SelectMutants.addItem("red");
    SelectMutants.addItem("blue");
    SelectMutants.addItem("green");
    SelectMutants.addItem("yellow");
}
    private void SelectMutantsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectMutantsActionPerformed

        Object selectedItem = SelectMutants.getSelectedItem();
      String selectedItemStr = selectedItem.toString();
      numInputs = selectedItemStr;
      int y = Integer.parseInt(selectedItemStr);
      String text="";
        //File f = new File("C:\\Project\\Mutation\\Check_3.c");
            File f = new File(directory + "\\" + filename1 + "\\" + "Mutation" +"\\"+ "code" +numInputs+".c");
        String filename = f.getAbsolutePath();
        java.io.File file = new java.io.File(filename);
        try{
            Scanner input = new Scanner(file);
            while(input.hasNext()){
                text = text + input.nextLine() + "\n";
                
            }
            jTextArea2.setText(text);
            //jTextArea2.setText(filename);
            jTextArea2.setEditable(false);
        }
        catch(FileNotFoundException e){
            System.err.format("File does not exist \n");
        }  
        String text1="";
        File f1 = new File(directory + "\\" + filename1 + "\\" + "Mutation" +"\\"+ "result" +numInputs+".txt");
            String filename11 = f1.getAbsolutePath();
            java.io.File file1 = new java.io.File(filename11);
        try{
            Scanner input1 = new Scanner(file1);
            while(input1.hasNext()){
                text1 = text1 + input1.nextLine() + "\n";
                
            }
            jTextArea3.setText(text1);
            jTextArea3.setEditable(false);
        }
        catch(FileNotFoundException e){
            System.err.format("File does not exist \n");
        }
try
            {
            FileInputStream fstream1 = new FileInputStream(directory + "\\" + filename1 + "\\" + "output.txt");
            FileInputStream fstream2 = new FileInputStream(directory + "\\" + filename1 + "\\" + "Mutation" +"\\"+ "result" +numInputs+".txt");
            
            DataInputStream in1= new DataInputStream(fstream1);
            DataInputStream in2= new DataInputStream(fstream2);
            
            BufferedReader br1 = new BufferedReader(new InputStreamReader(in1));
            BufferedReader br2 = new BufferedReader(new InputStreamReader(in2));
            
            //String strLine1, strLine2;
            String strLine1, strLine2;
            String s1="",s2="",z1="",z2="";
            try {
                while ((z1 = br1.readLine()) != null)
                s1 += z1;

                while ((z2 = br2.readLine()) != null)
                s2 += z2;

                    if (s1.equals(s2)) {
                        jTextArea5.setText("Result Matched");
                        Color c = new Color(255,0,0,100);
                        jTextArea5.setBackground(c);
                        jTextArea5.setEditable(false);
                        count++;
                        }
            
                    else
                    {
                        jTextArea5.setText("Result Not Matched");
                        jTextArea5.setEditable(false);
                         Color c = new Color(102,255,102,100);
                        jTextArea5.setBackground(c);
                    }
                    String myString = Integer.toString(count);
                    jTextArea6.setText(myString);
                }   
             catch (IOException ex) {
                    Logger.getLogger(MutatationWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
     catch(FileNotFoundException e){
                System.err.format("File does not exist \n");
            }
     String ashish = directory +"\\"+ filename1 +"\\"+ "NoOfEquivalenceMutants.txt";
     try{
         FileWriter writer = new FileWriter( ashish );
         BufferedWriter bw = new BufferedWriter ( writer );
         jTextArea6.write(bw);
     }  catch (IOException ex) {
            Logger.getLogger(MutatationWindow.class.getName()).log(Level.SEVERE, null, ex);
     }
     jTextArea7.setText(myStr);

    }//GEN-LAST:event_SelectMutantsActionPerformed

    private void ListMutantsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListMutantsActionPerformed
        String [] s=new String[countc];
        int jj;
        for(jj=0;jj<countc;jj++)
        {
          String mySt = Integer.toString(jj+1);  
            s[jj]=mySt;
        }

        SelectMutants.setModel(new javax.swing.DefaultComboBoxModel(s));// TODO add your handling code here:
    }//GEN-LAST:event_ListMutantsActionPerformed

    
     //* @param args the command line arguments
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MutatationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MutatationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MutatationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MutatationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MutatationWindow().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(MutatationWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ListMutants;
    private javax.swing.JComboBox SelectMutants;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    // End of variables declaration//GEN-END:variables
}
