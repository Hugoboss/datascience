import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapPreferences 
{
	public static void main(String[] args)
	{
		Integer i_key = new Integer(userid);
		UserPreference i_value = new UserPreference
		
		TreeMap<Integer, UserPreference> map = new TreeMap<Integer, UserPreference>();
		Set<Map.Entry<Integer, UserPreference>> entrySet = this.map.entrySet();
		
		for (Map.Entry<Integer,UserPreference> entryUser : entrySet) 
		{
			i_key = entryUser.getKey();		
			i_value = entryUser.getValue();
		}

	}

}
