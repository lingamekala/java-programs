 import java.util.Scanner;
 class main
{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
    System.out.println(" n value:");
		n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
		    arr[i] = sc.nextInt();
		}
		int res=emirpNumber(arr,n);
		System.out.println(res);
	}
	 public static int emirpNumber(int input1[],int input2)
  {
	    int c=0;
	    int result =0;
	    for(int i=0;i<input2;i++){
	        if(input1[i]>10){
	            int res = isprime(input1[i]);
	            if(res==1){
	                c+=1;
	                //System.out.println(input1[i]);
	            }
	            int n=input1[i];
	            int rev=0;
	            while(n!=0){
	                rev = rev*10+n%10;
	                n=n/10;
	            }
	            int res1 = isprime(rev);
	            if(res1==1){
	                c+=1;
	                //System.out.println("reverse:"+rev);
	            }
	        }
	        if(c==2){
	                result+=1;
	                c=0;
	            }
	    }
	    return result;
	}
	public static int isprime(int p){
	    for(int i=2;i*i<=p;i++){
	        if(p%i==0){
	            return 0;
	        }
        }
             return 1;
        }
    
	    }