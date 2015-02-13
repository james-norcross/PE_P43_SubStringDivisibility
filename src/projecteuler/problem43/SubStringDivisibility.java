package projecteuler.problem43;

public class SubStringDivisibility {

	/**
	 * Author: James Norcross
	 * Date: 2/11/15
	 * Purpose: Project Euler Problem 43
	 * Description: finds the sum of a set of 'unique' 0-9 pandigital numbers.  These numbers have property that d2d3d4 is divisible by 2
	 * d3d4d5 is divisible by 3 and so forth to d8d9d10 being divisible by 17
	 */
	
	public static long sum = 0;
	
	public static void main(String[] args) {
		
		String list = "0123456789";
		findUnique(list, "");
		System.out.println("The sum of the unique numbers is " + sum);

	}

	// a variation of a recursive function to find permutations
	// it limits work by checking appropriate divisibility conditions
	// as the permutation is built up and terminating recursion for
	// any permutations that don't meet the 'unique' criteria
    private static void findUnique(String list, String p) {
        int nmax = list.length();
        if (nmax == 0) {
        	System.out.println(p);
        	sum += Long.parseLong(p);
        }
        else if (p.length() < 3){
        	for(int i = 0; i < nmax; i++)
        		findUnique(list.substring(0, i) + list.substring(i+1, nmax),list.charAt(i) + p);
        }
        else if (p.length() == 3) {
        	if (Integer.parseInt(p)%17 == 0) { 
        		for(int i = 0; i < nmax; i++)
        			findUnique(list.substring(0, i) + list.substring(i+1, nmax),list.charAt(i) + p);
        	}
        }
        else if (p.length() == 4) {
        	if (Integer.parseInt(p.substring(0, 3))%13 == 0) { 
        		for(int i = 0; i < nmax; i++)
        			findUnique(list.substring(0, i) + list.substring(i+1, nmax),list.charAt(i) + p);
        	}
        }        
        else if (p.length() == 5) {
        	if (Integer.parseInt(p.substring(0, 3))%11 == 0) { 
        		for(int i = 0; i < nmax; i++)
        			findUnique(list.substring(0, i) + list.substring(i+1, nmax),list.charAt(i) + p);
        	}
        }        
        else if (p.length() == 6) {
        	if (Integer.parseInt(p.substring(0, 3))%7 == 0) { 
        		for(int i = 0; i < nmax; i++)
        			findUnique(list.substring(0, i) + list.substring(i+1, nmax),list.charAt(i) + p);
        	}
        }               
    	else if (p.length() == 7) {
        	if (Integer.parseInt(p.substring(0, 3))%5 == 0) { 
        		for(int i = 0; i < nmax; i++)
        			findUnique(list.substring(0, i) + list.substring(i+1, nmax),list.charAt(i) + p);
        	}
        }               
    	else if (p.length() == 8) {
        	if (Integer.parseInt(p.substring(0, 3))%3 == 0) { 
        		for(int i = 0; i < nmax; i++)
        			findUnique(list.substring(0, i) + list.substring(i+1, nmax),list.charAt(i) + p);
        	}
        }
    	else if (p.length() == 9) {
        	if (Integer.parseInt(p.substring(0, 3))%2 == 0) { 
        		for(int i = 0; i < nmax; i++)
        			findUnique(list.substring(0, i) + list.substring(i+1, nmax),list.charAt(i) + p);
        	}
        }
        else {
        	for(int i = 0; i < nmax; i++)
        		findUnique(list.substring(0, i) + list.substring(i+1, nmax),list.charAt(i) + p);
        }
    }

}
