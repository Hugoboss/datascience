import java.util.ArrayList;
import java.util.Comparator;
import java.util.*;

public class Sort implements Comparator<Name>
{
    ArrayList<Name> datalijst = new ArrayList<Name>();
    Sort ps = new Sort();
    public int compare(Name pc1,Name pc2)
    {
    	return kleiner -1, gelijk==0 , groter = +1
    }
    Collections.sort(datalijst, ps);
    
    public String toon(int brnr)
    {
        String br="\n";
	    if (brnr==1)
	    {
	    	br="<br/>";
	    }
    
	    StringBuilder sb=new StringBuilder();
	    sb.append("== Naam van de class==="+br);
	    sb.append("== EINDE SIMWAARDEN =="+br);
	    return sb.toString();
    }   
}
