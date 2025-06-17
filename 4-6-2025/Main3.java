class Main3 {
static boolean checkPanagram(String s) {
for(char ch='a';ch<='z';ch++) {
boolean found=false;
for(int i=0;i<s.length();i++) {
if(ch==Character.toLowerCase(s.charAt(i))) {
found=true;
break;
}
}
if(!found)
return false;
}
return true;
}
public static void main(String[]args) {
String s="the quick  brown fox jumps over the lazy day";
if(checkPanagram (s)) {
System.out.println("true");
}
else
{
System.out.println("false");
}
}
}
