class Reverse_word {
    public String reverseWords(String s) {
        String str[]=s.split("\\s+");
        String str1="";
        for(String s1:str){
            StringBuilder sb=new StringBuilder(s1);  
            sb.reverse();  
            str1+=sb.toString()+" ";  
        }
        return str1.trim();
    }
}
