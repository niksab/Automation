package Automation1;

import java.util.StringTokenizer;

public class number {
public static void main(String[] args){

String str= "  The  with     multiple          spaces   ";

StringTokenizer strTok = new StringTokenizer(str," ");
StringBuffer strbuf = new  StringBuffer();
while(strTok.hasMoreTokens())
{
	strbuf.append(strTok.nextElement()).append(" ");
	
}
System.out.println(strbuf.toString().trim());
System.out.println("GitHub-Learning");

}



}
