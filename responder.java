import java.io.BufferedReader;
import java.awt.event.KeyEvent;
import java.awt.AWTException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.util.Set;
import java.util.HashSet;
import java.lang.String;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.Font;
import java.lang.NullPointerException;
import java.io.PrintStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;
import java.nio.file.Path;
import java.util.stream.Stream;
import java.nio.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.awt.Robot;

public class respondprint{   
    public static String name;
    public static String player;
    public static String contents;
    
    public static void main(String args[]) throws AWTException {
        
       

       
    
     File file = new File("logconsolelogconsole.txt");
      if(file.exists()){
        
          ask();
          
        
    }
        
        else {
  
         try
         {
             start();
         }
         catch (IOException ioe)
         {
             
         }
    
        
        }
        
    
   }
   
   

    
        
      
   
      
    
   
   public static void start() throws IOException {
        JLabel label = new JLabel("Hello! Let's Start!");
    label.setFont(new Font("Arial", Font.BOLD, 15));
    JFrame f= new JFrame();
    JOptionPane.showMessageDialog(f, label);    

    nameselect();
    
    
    JLabel label1 = new JLabel("So, now that you know my name..What's yours");
    label.setFont(new Font("Arial", Font.BOLD, 15));
    JFrame f1= new JFrame();
    JOptionPane.showMessageDialog(f1, label1);
    initialize();
    
    
    }
 
    

 
public static void initialize() {
                String _1 = "1";
      String _2 = "2";
      String _3 = "3";
      String _4 = "4";
      String _5 = "5";
      String _6 = "6";
      String _7 = "7";
      String _8 = "8";
      String _9 = "9";
      String _10 = "10";
      String _0 = "0";
      String jaja = "";
      String jajaa = " ";
      
      String aa = "`";
      String ab = "~";
      String ac = "!";
      String aq = "@";
      String aw = "#";
      String ae = "$";
      String ar = "%";
      String at = "^";
      String ay = "&";
      String au = "*";
      String ai = "(";
      String ao = ")";
      String ap = "-";
      String as = "_";
      String ad = "=";
      String af = "+";
      String ag = "[";
      String ah = "{";
      String aj = "}";
      String ak = "]";
      String al = ";";
      String az = ":";
      String ax = "'";
      String av = "\\";
      String an = "|";
      String am = ",";
      String aA = ">";
      String aB = ".";
      String aC = "<";
      String aQ = "/";
      String aW = "?";
      
      String aaa = "q";
      String aab = "w";
      String aac = "e";
      String aaq = "r";
      String aaw = "t";
      String aae = "y";
      String aar = "u";
      String aat = "i";
      String aay = "o";
      String aau = "p";
      String aai = "a";
      String aao = "s";
      String aap = "d";
      String aas = "f";
      String aad = "g";
      String aaf = "h";
      String aag = "j";
      String aah = "k";
      String aaj = "l";
      String aak = "z";
      String aal = "x";
      String aaz = "c";
      String aax = "v";
      String aav = "b";
      String aan = "n";
      String aam = "m";
      
      String player = JOptionPane.showInputDialog("Enter your name:");
 if(player.contains(_1)||player.contains(_2)||player.contains(_3)||player.contains(_4)||player.contains(_5)||player.contains(_6)||player.contains(_7)||player.contains(_8)||player.contains(_9)||player.contains(_10)||player.contains(_0)||player.contains(aa)||player.contains(az)||player.contains(ax)||player.contains(ac)||player.contains(av)||player.contains(an)||player.contains(am)||player.contains(al)||player.contains(ak)||player.contains(aj)||player.contains(ah)||player.contains(ag)||player.contains(af)||player.contains(ad)||player.contains(as)||player.contains(ap)||player.contains(ao)||player.contains(ai)||player.contains(au)||player.contains(ay)||player.contains(at)||player.contains(ar)||player.contains(ae)||player.contains(aw)||player.contains(aq)||player.contains(ab)||player.contains(aC)||player.contains(aB)||player.contains(aA)||player.contains(aW)||player.contains(aQ)||player.equals(aam)||player.equals(aan)||player.equals(aab)||player.equals(aav)||player.equals(aac)||player.equals(aax)||player.equals(aaz)||player.equals(aal)||player.equals(aak)||player.equals(jaja)||player.equals(jajaa)||player.equals(aah)||player.equals(aag)||player.equals(aaj)||player.equals(aaf)||player.equals(aad)||player.equals(aas)||player.equals(aaa)||player.equals(aap)||player.equals(aao)||player.equals(aai)||player.equals(aau)||player.equals(aay)||player.equals(aat)||player.equals(aar)||player.equals(aae)||player.equals(aaw)||player.equals(aaq)){
        JLabel label2 = new JLabel("Is that really your name? Please re-enter.");
    label2.setFont(new Font("Arial", Font.BOLD, 15));
    JFrame fff= new JFrame();
    JOptionPane.showMessageDialog(fff, label2);
        }
      else {
          JLabel label22 = new JLabel("Player name: "+player);
    label22.setFont(new Font("Arial", Font.BOLD, 15));
    JFrame ffff= new JFrame();
    JOptionPane.showMessageDialog(ffff, label22);
          
          
          JLabel label222 = new JLabel("That's a nice name!");
    label222.setFont(new Font("Arial", Font.BOLD, 15));
    JFrame fffff= new JFrame();
    JOptionPane.showMessageDialog(fffff, label222);}
          
         
         
            
         File file1 = new File("logconsolelogconsole.txt");
         
         
         
      try {
  
           
   PrintStream stream = new PrintStream(file1);
          
            stream.print(player);
  
            stream.close();
        }
         catch (Exception e) {
            System.out.println(e);
        }
    
      try
      {
          ask();
      }
      catch (AWTException awte)
      {
          awte.printStackTrace();
      }
         
        }
           public static void ask() throws AWTException {
    String path = "logconsolelogconsole.txt";

        try (Stream<String> lines = Files.lines(Paths.get(path))) {

            String content = lines.collect(Collectors.joining(System.lineSeparator()));
            JLabel label222 = new JLabel("Hi "+content+", how can I help you?");
    label222.setFont(new Font("Arial", Font.BOLD, 15));
    JFrame fffff= new JFrame();
    JOptionPane.showMessageDialog(fffff, label222);
            String input = JOptionPane.showInputDialog("ask: ").toLowerCase();
            
            if (input.equals("")||input.equals(" ")){
                
                JFrame framee = new JFrame();
              JOptionPane.showMessageDialog(framee,"Exiting.");
              System.exit(1);
           
                
              
            
            
           
            
              
            
        
    
        }
            if (input.equals("weather")||input.equals("climate")){
            
            openweather();
            }
            if (input.equals("wether")||input.equals("wather")||input.equals("weathar")||input.equals("wethar")||input.equals("wathar")){
            JFrame frame = new JFrame();
              int result = JOptionPane.showConfirmDialog(frame,"Did you mean 'Weather'?", "",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
            if(result == JOptionPane.YES_OPTION){
              openweather();
            
            }
            else {
            ask();
            }
            
            
            if (input.contains("wether")||input.contains("wather")||input.contains("weathar")||input.contains("wethar")||input.contains("wathar")||input.contains("weather")||input.contains("climate")){
            JFrame framee = new JFrame();
              int resulte = JOptionPane.showConfirmDialog(framee,"Do you want to know the Weather?", "",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
            if(resulte == JOptionPane.YES_OPTION){
              openweather();
            
            }
            else {
            ask();
            }
            
            }
        }
        
         if(input.equals("search")||input.equals("serch")||input.equals("sarch")||input.equals("seach")||input.equals("saerch")) {
            search();
            }   
            
            
        
    
        } catch (IOException e) {
            e.printStackTrace();
        }
         
        
        
    
    }

    public static void search() throws IOException {
    
    String serch = JOptionPane.showInputDialog("Search :");
    
    Runtime rt = Runtime.getRuntime();
String url = "https://www.google.com/search?q="+serch;
rt.exec("rundll32 url.dll,FileProtocolHandler "+ url);
    
    }
    public static void openweather() throws AWTException{
    
    JLabel label222 = new JLabel("opening weather app");
    label222.setFont(new Font("Arial", Font.BOLD, 15));
    JFrame fffff= new JFrame();
    JOptionPane.showMessageDialog(fffff, label222);
             
     Robot r = new Robot();
r.keyPress(KeyEvent.VK_WINDOWS);
r.keyRelease(KeyEvent.VK_WINDOWS);
Robot robot = new Robot();
try
{
    TimeUnit.SECONDS.sleep(3);
}
catch (InterruptedException ie)
{
    ie.printStackTrace();
}
robot.keyPress(KeyEvent.VK_W);

robot.keyPress(KeyEvent.VK_E);

robot.keyPress(KeyEvent.VK_A);

robot.keyPress(KeyEvent.VK_T);

robot.keyPress(KeyEvent.VK_H);

robot.keyPress(KeyEvent.VK_E);

robot.keyPress(KeyEvent.VK_R);


ask();
    
    }
       
      

   public static void nameselect() throws IOException
   
   {

      String _1 = "1";
      String _2 = "2";
      String _3 = "3";
      String _4 = "4";
      String _5 = "5";
      String _6 = "6";
      String _7 = "7";
      String _8 = "8";
      String _9 = "9";
      String _10 = "10";
      String _0 = "0";
      String jaja = "";
      String jajaa = " ";
      
      String aa = "`";
      String ab = "~";
      String ac = "!";
      String aq = "@";
      String aw = "#";
      String ae = "$";
      String ar = "%";
      String at = "^";
      String ay = "&";
      String au = "*";
      String ai = "(";
      String ao = ")";
      String ap = "-";
      String as = "_";
      String ad = "=";
      String af = "+";
      String ag = "[";
      String ah = "{";
      String aj = "}";
      String ak = "]";
      String al = ";";
      String az = ":";
      String ax = "'";
      String av = "\\";
      String an = "|";
      String am = ",";
      String aA = ">";
      String aB = ".";
      String aC = "<";
      String aQ = "/";
      String aW = "?";
      
      String aaa = "q";
      String aab = "w";
      String aac = "e";
      String aaq = "r";
      String aaw = "t";
      String aae = "y";
      String aar = "u";
      String aat = "i";
      String aay = "o";
      String aau = "p";
      String aai = "a";
      String aao = "s";
      String aap = "d";
      String aas = "f";
      String aad = "g";
      String aaf = "h";
      String aag = "j";
      String aah = "k";
      String aaj = "l";
      String aak = "z";
      String aal = "x";
      String aaz = "c";
      String aax = "v";
      String aav = "b";
      String aan = "n";
      String aam = "m";
      
    
      File f1=new File("corncob_lowercase.txt" );
      File f4=new File("Names.txt" );

  
      
      String[] words=null;  
      FileReader fr1 = new FileReader(f1);
    
 
      FileReader fr4 = new FileReader(f4);
      
      BufferedReader br1 = new BufferedReader(fr1);
    
  
      BufferedReader br4 = new BufferedReader(fr4); 
 
     
      
      String s;     
      String name= JOptionPane.showInputDialog("Give me a name: ").toLowerCase();
      
      String printer= name;
      
      JLabel label222 = new JLabel("My name: "+name);
    label222.setFont(new Font("Arial", Font.BOLD, 15));
    JFrame fffff= new JFrame();
    JOptionPane.showMessageDialog(fffff, label222);
      
      

      int count1=0;   
      while((s=br1.readLine())!=null)  
      {
         words=s.split(" "); 
          for (String word : words) 
          {
                 if (word.equals(name))  
                 {
                   count1++;    
                 }
          }
      }
    
      int count4=0;   
      while((s=br1.readLine())!=null)  
      {
         words=s.split(" "); 
          for (String word : words) 
          {
                 if (word.equals(name))  
                 {
                   count4++;    
                 }
          }
      }
      
     
     
      if(count1!=0||count4!=0||name.contains(_1)||name.contains(_2)||name.contains(_3)||name.contains(_4)||name.contains(_5)||name.contains(_6)||name.contains(_7)||name.contains(_8)||name.contains(_9)||name.contains(_10)||name.contains(_0)||name.contains(aa)||name.contains(az)||name.contains(ax)||name.contains(ac)||name.contains(av)||name.contains(an)||name.contains(am)||name.contains(al)||name.contains(ak)||name.contains(aj)||name.contains(ah)||name.contains(ag)||name.contains(af)||name.contains(ad)||name.contains(as)||name.contains(ap)||name.contains(ao)||name.contains(ai)||name.contains(au)||name.contains(ay)||name.contains(at)||name.contains(ar)||name.contains(ae)||name.contains(aw)||name.contains(aq)||name.contains(ab)||name.contains(aC)||name.contains(aB)||name.contains(aA)||name.contains(aW)||name.contains(aQ)||name.equals(aam)||name.equals(aan)||name.equals(aab)||name.equals(aav)||name.equals(aac)||name.equals(aax)||name.equals(aaz)||name.equals(aal)||name.equals(aak)||name.equals(jaja)||name.equals(jajaa)||name.equals(aah)||name.equals(aag)||name.equals(aaj)||name.equals(aaf)||name.equals(aad)||name.equals(aas)||name.equals(aaa)||name.equals(aap)||name.equals(aao)||name.equals(aai)||name.equals(aau)||name.equals(aay)||name.equals(aat)||name.equals(aar)||name.equals(aae)||name.equals(aaw)||name.equals(aaq))
      {
         JLabel label2222 = new JLabel("I don't think I like that very much.. try to do better \n");
    label2222.setFont(new Font("Arial", Font.BOLD, 15));
    JFrame ffffff= new JFrame();
    JOptionPane.showMessageDialog(ffffff, label2222);
         
         nameselect();
         
        }
      else
      {
         JLabel label2222 = new JLabel("This is a nice name thx :) \n");
    label2222.setFont(new Font("Arial", Font.BOLD, 15));
    JFrame ffffff= new JFrame();
    JOptionPane.showMessageDialog(ffffff, label2222);
         
      }
      
         fr1.close();
  

         fr4.close();
         File file = new File("logconsolelog.txt");
         
         
         
      try {
  
           
            PrintStream stream = new PrintStream(file);
          
            stream.print(name);
  
            stream.close();
        }
         catch (Exception e) {
            System.out.println(e);
        }
    
      
         
        }
        
   

       
}

