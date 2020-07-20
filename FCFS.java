/**
 * @author Ambuj Gupta
 * @since 14-05-2020
 */
import java.util.*;
public class FCFS
{
    public static void main(String arg[])
    {     
        InOut io=new InOut(arg[0],arg[1]);
        Scanner in=new Scanner(System.in); 
        ArrayList<Integer> q=new ArrayList<Integer>(2);
        while(io.in.hasNext())
        q.add(io.in.nextInt());
        System.out.println("Entered Reference String:"+Arrays.toString(q.toArray()));
        System.out.print("Enter Frame Size:");
        int p=in.nextInt(),f=0,i=0;
        ArrayList<Integer> m=new ArrayList<Integer>(p);
        while(q.size()!=0)
        {
            if(m.indexOf(q.get(0))==-1)
            {
                f++;
                m.add(q.get(0));
                if(m.size()>p)
                m.remove(0);
            }
            q.remove(0); 
            io.out.println("Frame:"+Arrays.toString(m.toArray()));
        }
        System.out.println("Page faults:"+f);
        io.in.close();io.out.close();in.close();
    }
}