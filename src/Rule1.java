
public class Rule1 
{
	public boolean check(String sentence)
	{	
		if (Character.isUpperCase(sentence.charAt(0))==true)
		{
			return false;
		}
		else
		{
		return true;
		}
	}
	
	public String message()
	{
		return "error1";
	}
}