import java.util.Scanner;
public class TrimSpaces {
    public static int[] trimIndices(String s) {
        int start=0,end=s.length()-1;
        while(start<=end && s.charAt(start)==' ') start++;
        while(end>=start && s.charAt(end)==' ') end--;
        return new int[]{start,end+1};
    }
    public static String substringByCharAt(String s,int start,int end){
        String res="";
        for(int i=start;i<end;i++) res+=s.charAt(i);
        return res;
    }
    public static boolean compareStrings(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        for(int i=0;i<s1.length();i++) if(s1.charAt(i)!=s2.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] idx=trimIndices(s);
        String res1=substringByCharAt(s,idx[0],idx[1]);
        String res2=s.trim();
        System.out.println(compareStrings(res1,res2));
    }
}
