/**
 * @author Ambuj Gupta
 * @since 14-05-2020
 */
import java.util.*;
public class Optimal
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
        int p=in.nextInt(),f=0,d,j;
        ArrayList<Integer> m=new ArrayList<Integer>(p);
        while(q.size()!=0)
        {
            if(m.indexOf(q.get(0))==-1)
            {
                f++;
                if(m.size()<p)
                m.add(q.get(0));
                else
                {
                    d=-1;j=-1;
                    for(int i=0;i<p;i++)
                    {
                        int a=q.indexOf(m.get(i));
                        if(a==-1)
                        {
                            j=i;break;
                        }
                        else if(a>d)
                        {
                            j=i;d=a;
                        }
                    }
                    m.set(j,q.get(0)); 
                }
            }
            q.remove(0); 
            io.out.println("Frame:"+Arrays.toString(m.toArray()));
        }
        System.out.println("Page faults:"+f);
        io.in.close();io.out.close();in.close();
    }
}