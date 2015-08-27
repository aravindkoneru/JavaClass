public class Assignment1{
    
    public int compareTo(int a, int b){
        //code for question 1 goes here
    }

    public int evenAndMultiple(int x){
        //code for question 2 goes here
    } 

    public boolean isSpecial(double a){
        //code for question 3  goes here
    }

    public int calcValue(String x){
        //code for questin 4 goes here
    }

    public int reverseNumber(int x){
        //code for question 5 goes here
    } 
    

	public static void main(String[] args){
		
		Assignment1 tester = new Assignment1();
        
        System.out.println("Testing compareTo...");
        assert(compareTo(8,8) == 0);
        assert(compareTo(8,0) == 1);
        assert(compareTo(0,8) == -1);

        System.out.println("Testing evenAndMultiple...");
        assert(evenAndMultiple(9) == false);
        assert(evenAndMultiple(14) == true);
        assert(evenAndMultiple(7168) == true);

        System.out.println("Testing isSpecial...");
        assert(isSpecial(500) == true);
        assert(isSpecial(75) == true);
        
        System.out.println("Testing calcValue...");
        assert(calcValue("coding") == 14 );
        assert(calcValue("java") == 0 );
        assert(calcValue("Android") == 0 );

        System.out.println("Testing reverseNumber...");
        assert(reverseNumber(243) == 342);
        assert(reverseNumber(918) == 819);
        assert(reverseNumber(510) == 15);
	}	
}
