class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        while(j>i){
            if(sb.charAt(i)=='a'|| sb.charAt(i)=='e'|| sb.charAt(i)=='i'|| sb.charAt(i)=='o'|| sb.charAt(i)=='u'|| sb.charAt(i)=='O'|| sb.charAt(i)=='A'|| sb.charAt(i)=='E'|| sb.charAt(i)=='I'|| sb.charAt(i)=='U' ){
                if(sb.charAt(j)=='a'|| sb.charAt(j)=='e'|| sb.charAt(j)=='i'|| sb.charAt(j)=='o'|| sb.charAt(j)=='u' ||sb.charAt(j)=='O'|| sb.charAt(j)=='A'|| sb.charAt(j)=='E'|| sb.charAt(j)=='I'|| sb.charAt(j)=='U'){ 
                    char temp=sb.charAt(i);
                    sb.setCharAt(i, sb.charAt(j));  
                    sb.setCharAt(j, temp);  
                    i++;
                    j--;

                }else{
                    j--;
                }

            }else{
                i++;
            }

        }
        return sb.toString();
        
    }
}