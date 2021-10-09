import java.util.Scanner;
/*
给定一个字符串，请输出该字符串中是否包含red、yellow、blue三个字符串。
 */
class Solution16 {
    public static void main(String[] args) {
        //String str = "lkjredqwablueasdyellow";
        //String str = "asdaasdredasjdhnkas";
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String string_1 = "red";
        String string_2 = "blue";
        String string_3 = "yellow";
        int i_1 = strStr(str, string_1);
        int i_2 = strStr(str, string_2);
        int i_3 = strStr(str, string_3);
        if(i_1==-1){
            i_1=0;
        }else {
            i_1 = 1;
        }
        if (i_2==-1){
            i_2 = 0;
        }else{
            i_2 = 1;
        }
        if (i_3 ==-1){
            i_3 = 0;
        }else{
            i_3 = 1;
        }
        System.out.println(Integer.toString(i_1)+ " " + Integer.toString(i_2)+" " + Integer.toString(i_3));



    }
    public static void getNext(int[] next, String s){
        int j = -1;
        next[0] = j;
        for (int i = 1; i<s.length(); i++){
            while(j>=0 && s.charAt(i) != s.charAt(j+1)){
                j=next[j];
            }

            if(s.charAt(i)==s.charAt(j+1)){
                j++;
            }
            next[i] = j;
        }
    }
    public static int strStr(String haystack, String needle) {
        if(needle.length()==0){
            return 0;
        }

        int[] next = new int[needle.length()];
        getNext(next, needle);
        int j = -1;
        for(int i = 0; i<haystack.length();i++){
            while(j>=0 && haystack.charAt(i) != needle.charAt(j+1)){
                j = next[j];
            }
            if(haystack.charAt(i)==needle.charAt(j+1)){
                j++;
            }
            if(j==needle.length()-1){
                return (i-needle.length()+1);
            }
        }

        return -1;
    }
}
