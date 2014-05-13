import java.util.Arrays;

public class Name implements Comparable<Sort>
{
    Name[] klnmarr = new Name[aantal];
    Arrays.sort(klnmarr);
    Name[] arrCopy = klnmarr.clone();
    
    public int compareTo(Name kl)
    {
	// kl1 vergelijken met de this.attrributen
	return kleiner -1, gelijk == 0 , groter = +1
    }
    
    public String toon(int brnr)
    {
        String br="\n";
        if (brnr==1){br="<br/>";
    }
    
    StringBuilder sb=new StringBuilder();
    sb.append("== Naam van de class==="+br);
    // inhoud van de variabelen (naam variabele + waarde)
    sb.append("== EINDE SIMWAARDEN =="+br);
    return sb.toString();
}