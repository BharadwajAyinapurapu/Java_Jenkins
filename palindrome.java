class palindrome{
	public static void main(String args[]){
		boolean ans;
		int x=args[0];
		if(x<0){
			ans=false;
		}
		else{
			int y=x,rev=0,rem;
			while(y!=0){
				rem=y%10;
				rev=rev*10+rem;
				y=y/10;
			}
			if(rev==x) ans=true;
			else ans=false;
		}
		return ans;
	}
}