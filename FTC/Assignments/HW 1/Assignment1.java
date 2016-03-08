public class Assignment1{
    
    public int compareTo(int a, int b){
        if(a > b){
            return 1;
        } else if(a < b){
            return -1;
        } else{
            return 1;
        }
    }

    public int evenAndMultiple(int x){
        if(x % 2 == 0 && x % 7 == 0){
            return true;
        }
        return false;
    } 

    public boolean isSpecial(double a){
        double case1 = Math.pow(a,2)/3;
        if(case1 % 2 == 0){
            return true;
        }

        double case2 = a + (a/2) * 3;
        if(case2 % 2 == 0){
            return true;
        }
        return false;
    }

    public int calcValue(String x){
        //code for questin 4 goes here
    }

    public int reverseNumber(int x){
        
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
