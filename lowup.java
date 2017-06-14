

class lp {

	public static void main(String[] args) {
		char ch='a';
		char ch1=ch;
	   if(ch>='a'&&ch<='z'){
		ch=Character.toUpperCase(ch);
			System.out.println(ch1+" "+ch);
		}
		else if (Character.isLowerCase(ch)){
			System.out.println(ch1+" "+ch);
		}
	   
    
	}

}
