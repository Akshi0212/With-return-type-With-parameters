class DigitSum1{
public static void main(String[] args){
DigitSum ds=new DigitSum();
int N=2015; 
int res=ds.findDigitSum(N); //method call
System.out.println(res);
}
int findDigitSum(int M){ //method definition
int r=0,dsum=0;
while(M!=0){
r=M%10;
dsum=dsum+r;
M=M/10;
}
return dsum;
}
}