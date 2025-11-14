 class ReplaceChar {
    public static void main(String[] args) {
        String s="banana";
        char[] a=s.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]=='a'){
                a[i]='o';
            }
        }
        s=new String(a);
        System.out.println(s);
        
    }
}
