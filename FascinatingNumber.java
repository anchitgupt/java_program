com FascinatingNumber;

class FascinatingNumber
{
	public static void fasciatingno(int n;) {
		
          
          //int n = sc.nextInt();
         // String n = sc.nextLine();
          //String str=((n*1)+(n*2)+(n*3)).toString();
          /*String str1 = n.toString();
          String str2 = (n*2).toString();
          String str3 = (n*3).toString();
          String str = str1 + str2 + str1;*/ 
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
          		    return 1;
          		else
          			return -1;
		}
		
	}
}
