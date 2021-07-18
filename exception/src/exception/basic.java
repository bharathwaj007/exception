package exception;

import org.omg.Messaging.SyncScopeHelper;

import java.util.*;

public class basic {
    public static void main(String[] args)
    {
       try{
          String s="";
           System.out.println(s.charAt(0));
       }
       catch (Exception e)
       {
           System.out.println(e);
       }
        System.out.println("mama");

        int a[]={5,8,6,2,2,1,9,8};
        HashMap<Integer,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<a.length;i++)
        {
            if(map.containsKey(a[i]))
            {
                map.put(a[i],map.get(a[i])+1);
            }
            else{
                map.put(a[i],1);
            }
        }
        System.out.println(map);
        int j=0;
        for(int i:map.keySet())
        {
            a[j]=i;
            j++;
        }
        for(int x=j;x<a.length;x++)
            a[x]=0;
        System.out.println(Arrays.toString(a));
        String a1="madam";
        String b="silent";
        for(int i=0;i<a1.length();i++)
        {
            b=b.replaceFirst(a1.charAt(i)+"","");

        }
        if(b.equals(""))
            System.out.println("anagram");
    }

}
