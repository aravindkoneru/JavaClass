public class Assignment1{

	public int makePerfect(int x){
		return Math.pow(x,2);
	}

	public boolean isFactor(int a, int b){
		
		return a%b == 0;
	}

    public boolean isSpecial(int a){
       double case1 = Math.pow(a,2)/3;
       if(case1 % 2 == 0){
           return true;
       } 

       double case2 = a + (a/2) * 3;
       return case2 % 2 == 0; 
    }

    public String convertDouble(a){
        String number = "";
        //@TODO: Finish this method 
    } 

    public double reverseNumber(int x){
        //@TODO: finish this method
    } 

	public static void main(String[] args){
		
		Assignment1 tester = new Assignment1();

		System.out.println(tester.makePerfect(10));
		System.out.println(tester.isFactor(10,5));
        System.out.println(tester.isSpecial(9));
	}	

}
