package String;

public class convert {

    //convert the given string into like character contains
    // string small to capital or capital to small
    public static void main(String[] args) {
        String str="phYSICs";//output:PHysicS
        System.out.println("Input string ");
        System.out.println(str);
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            boolean flag=true;//consider it is capital
            if(ch==' ')continue;
            int asci=(int)ch;
             if (asci>=97) flag=false;
             if(flag==true) {
                 asci += 32;
                 char dh = (char) asci;
                 str = str.substring(0, i) + dh + str.substring(i + 1);
             }
             else{
                 asci-=32;
                 char dh=(char)asci;
                 str = str.substring(0, i) + dh + str.substring(i + 1);


            }
        }
        System.out.println("Output String ");
        System.out.println(str);
    }
}
