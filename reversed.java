

 class rev {

	public static void main(String[] args) {
		int num=1234;
	int reversednum=0;
	int temp=0;
			
				while(num>0){
					temp=num%10;
					reversednum=reversednum*10+temp;
					num=num/10;
				}
				

                System.out.println(+reversednum);
				
				

			}

		



}
