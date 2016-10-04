/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.inputpage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static my.inputpage.inputpageUI.directory;

/**
 *
 * @author akhiluchil
 */
public class trial {
    char[][] perm = new char[10000000][20];                                     // to store all permutations
    String program1;                                                            // to store the input program ( & perform required operations)
    int[] index = new int[100];                                                 // to store the indexes of the operators
    public static int count = 0;                                                // index for index[]
    public static int num = 0;                                                  // number of permutation generated
    public trial() {};
    public void check() {
        String text="";
        File f = new File("C:\\Users\\akhiluchil\\Documents\\sum2.c");
        String file1 = f.getAbsolutePath();
        java.io.File file = new java.io.File(file1);
        try{
            Scanner input = new Scanner(file);
            while(input.hasNext()){
                text = text + input.nextLine() + "\n";
                
            }
            
        }
        catch(FileNotFoundException e){
            System.err.format("File does not exist \n");
        }
        String program = text;
        program1 = text;
        int curindex = 0;                                                       //keep track of the current index
        int previndex = -1;                                                     //keep track of the previous index - to check if no more operators are present
        int sym1,sym2,sym3,sym4,sym5;                                           //to keep track of all the operators individually i.e., their next index positions
        int nearest;                                                            //to know the nearest operator
        int quotes[] = new int[1000];                                                           //to store the position of quotes
        int quotecount;
        int i = 0;
        int j = 0;
        while(i<program1.length()){
            if(program1.charAt(i)=='\"'){
                quotes[j++] = i;
                System.out.println("Quote position " + i);
            }
                
            i++;
        }
        quotecount = j/2;
        System.out.println("Number of quote pairs = " + quotecount);
        for(i=0;i<quotecount;i++){
            System.out.println("Opening quote = " + quotes[2*i] + " Closing Quotes = " + quotes[(2*i)+1]);
        }
        
        while(previndex != curindex){
           previndex = curindex;
           //sym6 = program1.indexOf("\"",curindex);                              //to get opening double quotes
           //sym7 = program1.indexOf("\"",(sym6 + 1));                            //to get closing double quotes
           //System.out.println("Opening quotes = " + sym6);
           //System.out.println("Closing quotes = " + sym7);
           sym1 = program1.indexOf("+",curindex);
           for(i=0;i<quotecount;i++){                                     //to ignore symbol between double quotes
               if(sym1>quotes[2*i] && sym1<quotes[(2*i)+1])
                    sym1 = program1.indexOf("+",(sym1 + 1));
           }
           sym2 = program1.indexOf("-",curindex);
           for(i=0;i<quotecount;i++){                                     //to ignore symbol between double quotes
               if(sym2>quotes[2*i] && sym2<quotes[(2*i)+1])
                sym2 = program1.indexOf("-",(sym2 + 1));
           }
           sym3 = program1.indexOf("*",curindex);
           for(i=0;i<quotecount;i++){                                     //to ignore symbol between double quotes
               if(sym3>quotes[2*i] && sym3<quotes[(2*i)+1])
                sym3 = program1.indexOf("*",(sym3 + 1));
           }
           sym4 = program1.indexOf("/",curindex);
           for(i=0;i<quotecount;i++){                                     //to ignore symbol between double quotes
               if(sym4>quotes[2*i] && sym4<quotes[(2*i)+1])
                sym4 = program1.indexOf("/",(sym4 + 1));
           }
           
           sym5 = program1.indexOf("%",curindex);
           for(i=0;i<quotecount;i++){                                     //to ignore symbol between double quotes
               if(sym5>quotes[2*i] && sym5<quotes[(2*i)+1])
                sym5 = program1.indexOf("%",(sym5 + 1));
           }
           //System.out.println("at 196 "+ program1.charAt(196));
           //System.out.println("\n sym1 = " + sym1 +" sym2 = " + sym2 +" sym3 = " + sym3 +" sym4 = " + sym4 +" sym5 = " + sym5);
           if((sym1 != -1) || (sym2 != -1) || (sym3 != -1) || (sym4 != -1) || (sym5 != -1)){
               nearest = 100000;
               if((sym1 != -1)&&(sym1<nearest))
                   nearest = sym1;
               else if((sym2 != -1)&&(sym2<nearest))
                   nearest = sym2;
               else if((sym3 != -1)&&(sym3<nearest))
                   nearest = sym3;
               else if((sym4 != -1)&&(sym4<nearest))
                   nearest = sym4;
               else
                   nearest = sym5;
               System.out.println("\n Nearest = " + nearest + "Symbol = "+ program1.charAt(nearest));
               index[count] = nearest;
               count++;
               curindex = nearest + 1;                           //to check after the current symbol on the next iteration
               
           }
               
        }
        System.out.println("Count = " + count +"\n");
        for(i = 0; i<count;i++) {
            System.out.println("\n" + index[i]);
            //System.out.println(" Symbol = " + program1[index[i]]);
    }
    }
    
    public void permute(int length, String domain, String result)
    {
        if (length == 0)
        {
            int i=0;
            for(i=0;i<count;i++)                                                // used 5
                perm[num][i] = result.charAt(i);
            //result.getChars(0,5,perm[num],0);
            //System.out.println(result.toCharArray());
            //perm[num] = result.toCharArray();
            for(i=0;i<count;i++){
                if(perm[num][i]!=program1.charAt(index[i]))
                    break;
            }
            if(i==count)    
                num--;
            else
                System.out.println(Arrays.toString(perm[num]));
            num++;
        }
        else
        {
            for (int i = 0; i < domain.length(); i++)
                permute(length-1, domain, result + domain.charAt(i));
        }
    }
    public void CreateFiles(){
        int i,j;
        String text0="";                                                                                          // code to create new directory for mutants
        try (PrintWriter writer = new PrintWriter("makefiledir.bat")) {
            text0 = text0 + "md " + "\"" + directory + "\\" + "check" + "\\" + "Mutation" + "\"" + "\n" ;        // give the file name when you put in actual program
            writer.println(text0);
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(inputpageUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        Runtime rt = Runtime.getRuntime();
        try {
            rt.exec("cmd /c"+"makefiledir.bat");
        }
        catch (IOException ex) {
            Logger.getLogger(inputpageUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        char[] program2;
        program2 = program1.toCharArray();
        //System.out.println(program2);
        for( i = 0; i < num; i++) {                                      // to run for number of permutation of the given operators
            for(j=0;j<count;j++){                                               // to run for number of operators in the program
                program2[index[j]] = perm[i][j];                              // to do the particular permutation in the program
            }
            System.out.println(program2);                                       // print the program with particular permutation 
        }
        
    }
    
    
    public static void main(String args[]){
        trial t = new trial();
        t.check();
        t.permute(count,"+-*/%","");                                                 
        System.out.println(t.count);
        //System.out.println(t.perm[1][1]);
        t.CreateFiles();
    }
}