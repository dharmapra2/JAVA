class Reverse_String{
    public void reverseString(char[] s) {
        for(int i=0,j=s.length-1;i<j;i++,j--){
            char temp=s[j];
            s[j]=s[i];
            s[i]=temp;
        }
    }
}