package FascinatingNumber;

public class FascinatingNo1
{
	public static boolean fasciatingno(String n) {
          
          char ch[] = n.toCharArray();
          boolean flag=true;
          for(int i=0;i<ch.length;i++)
          	for(int j=i+1;j<ch.length-1;j++)
          		if(ch[i]==ch[j])
          		{
          			flag=false;
          			break;
          		}
          		if(flag==true)
          		    return true;
          		else
          			return false;
		}
		
	}

