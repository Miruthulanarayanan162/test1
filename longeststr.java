
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class longeststr {
    public static void main(String[] args){
    ArrayList<String>s=new ArrayList<>();//creation of array
    s.add("Rohit");//storing string in array
    s.add("Ram");
    s.add("Mala");
    s.add("Sita");
    s.add("jim");
    compare c=new compare();//object creation
    System.out.println(c.findlongest(s));//calling of method
    }
}
        
    

        
      
    

    
    

    class compare
    {
    String findlongest(ArrayList<String>s)//method
    {
        String get=s.get(0);
        int max=get.length();//intialization of max to length of the array
        for(int i=0;i<4;i++)
        {
            int a;
            a=s.get(i+1).length();
            if(max<a)
            {
                max=s.get(i+1).length();
                get=s.get(i+1);
            }
            return get;
        }
        return null;
    }
    
    }
    
    
    
   
                
        
    
    

