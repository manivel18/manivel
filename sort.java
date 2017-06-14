class Ad
{
    public static void main(String[] args) 
    {
int temp;
    int[] a=new int[]{12,54,65,32,21};
    int[] b=new int[]{a[0],a[1],a[2],a[3],a[4]};  
             for(int i = 0; i < b.length ; i++)
             {
             
             for(int j=i+1;j<b.length;j++)
                {
                 if(b[i]<b[j])
                    {
                    temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                    }
            
                    }
                  }

System.out.println("descending order is ");
for(int i=0;i<b.length;i++){

System.out.println(b[i]);
}}
}
