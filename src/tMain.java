import java.util.Scanner;

public class tMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Please Input your sentence(s)");
		String sentence = sc.nextLine();
		
        GrammarChecker checker = new GrammarChecker();
        checker.addRule(new Rule1());
        checker.addRule(new Rule2());
        checker.addRule(new Rule3());
        checker.addRule(new Rule4());

        
        checker.check(sentence);
        
        if (checker.check(sentence))
        {
        	System.out.println("NOTHINGS WRONG TRY AGAIN SORRY.");
	    }
  }
}
