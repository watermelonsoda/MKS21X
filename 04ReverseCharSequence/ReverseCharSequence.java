class ReverseCharSequence implements CharSequence{
    
    private String str;

    public ReverseCharSequence(String str){
        String reversed = "";
        for (int i = str.length() - 1; i > 0; i--){
            reversed += str.charAt(i);        
        }
        this.str = reversed;
    }

    public char charAt(int index){
        return str.charAt(index);
    }    

    public int length(){
        return str.length();
    }

    public CharSequence subSequence(int start, int end){
        return str.subString(start, end);
    }
    
    /*public String toString(String str){
        return 
    }*/

    public static void main(String[] args){
        ReverseCharSequence ooo = new ReverseCharSequence("Heyo");
        System.out.println(reverse);
    } 

}
