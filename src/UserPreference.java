public class UserPreference
{
	private int userid;            
	private int[] itemids; 
	private float[] preferences;
	
	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int[] getItemids() {
		return itemids;
	}

	public void setItemids(int[] itemids) {
		this.itemids = itemids;
	}

	public float[] getPreferences() {
		return preferences;
	}

	public void setPreferences(float[] preferences) {
		this.preferences = preferences;
	}
	
	public void  setItemIDRating(int itemid, float rating)
	{
		
	}
	
	public float searchRating(int itemId)
	{
		return itemId;
		
	}
	
	public RecordData getSimilarRating(UserPreference us2)
	{
	   
	}  
	public RecordData getNonSimilarRating(UserPreference us2)
	{
	
	}
	
	public String read
	 
	public String show(int nr)
	{
		String einde="\n";
        if (nr==1)
        {
        	einde="";
	    }
        StringBuilder sb=new StringBuilder();
        sb.append("userid="+this.userid+ einde+"   ");
		return einde;
	}
	
	public UserPreference fill(int userid)
	{
        UserPreference up = new UserPreference();
        int itemid = 0;
        float rating;
        
        if (userid == 1) 
        {
	        up.setUserid(userid);
	
	        itemid = 101;        rating = 2.5f;
	        up.setItemIDRating(itemid, rating);
	        itemid = 102;        rating = 3.5f;
	        up.setItemIDRating(itemid, rating);
	        itemid = 103;        rating = 3.0f;
	        up.setItemIDRating(itemid, rating);
	        itemid = 104;        rating = 3.5f;
	        up.setItemIDRating(itemid, rating);
	        itemid = 105;        rating = 2.5f;
	        up.setItemIDRating(itemid, rating);
	        itemid = 106;        rating = 3.0f;
	        up.setItemIDRating(itemid, rating);
    	}
        
        
        if (userid == 2) 
	    {
 
		    up.setUserid(userid);
		
		    itemid = 101;        rating = 3.0f;
		    up.setItemIDRating(itemid, rating);
		    itemid = 102;        rating = 3.5f;
		    up.setItemIDRating(itemid, rating);
		    itemid = 103;        rating = 1.5f;
		    up.setItemIDRating(itemid, rating);
		    itemid = 104;        rating = 5.0f;
		    up.setItemIDRating(itemid, rating);
		    itemid = 105;        rating = 3.5f;
		    up.setItemIDRating(itemid, rating);
		    itemid = 106;        rating = 3.0f;
		    up.setItemIDRating(itemid, rating);
	    }
        
        if (userid == 3) 
        {
 
	        up.setUserid(userid);
	
	        itemid = 101;        rating = 2.5f;
	        up.setItemIDRating(itemid, rating);
	        itemid = 102;        rating = 3.0f;
	        up.setItemIDRating(itemid, rating);
	        itemid = 103;        rating = 2.0f;
	        up.setItemIDRating(itemid, rating);
	        itemid = 104;        rating = 3.5f;
	        up.setItemIDRating(itemid, rating);
	        itemid = 105;        rating = 2.0f;
	        up.setItemIDRating(itemid, rating);
	        itemid = 106;        rating = 4.0f;
	        up.setItemIDRating(itemid, rating);
        }   
        
        if (userid == 4) 
        {
 
	        up.setUserid(userid);
	
	        itemid = 101;        rating = 3.0f;
	        up.setItemIDRating(itemid, rating);
	        itemid = 102;        rating = 3.5f;
	        up.setItemIDRating(itemid, rating);
	        itemid = 103;        rating = 3.0f;
	        up.setItemIDRating(itemid, rating);
	        itemid = 104;        rating = 4.0f;
	        up.setItemIDRating(itemid, rating);
	        itemid = 105;        rating = 2.5f;
	        up.setItemIDRating(itemid, rating);
	        itemid = 106;        rating = 4.5f;
	        up.setItemIDRating(itemid, rating);
        }   
        
        if (userid == 5) 
        {
 
	        up.setUserid(userid);
	
	        itemid = 101;        rating = 3.0f;
	        up.setItemIDRating(itemid, rating);
	        itemid = 102;        rating = 4.0f;
	        up.setItemIDRating(itemid, rating);
	        itemid = 103;        rating = 2.0f;
	        up.setItemIDRating(itemid, rating);
	        itemid = 104;        rating = 3.0f;
	        up.setItemIDRating(itemid, rating);
	        itemid = 105;        rating = 2.0f;
	        up.setItemIDRating(itemid, rating);
	        itemid = 106;        rating = 3.0f;
	        up.setItemIDRating(itemid, rating);
        }
        
        if (userid == 6) 
        {
	      
	        up.setUserid(userid);
	        itemid = 101;        rating = 3.0f;
	        up.setItemIDRating(itemid, rating);
	        itemid = 102;        rating = 4.0f;
	        up.setItemIDRating(itemid, rating);
	        itemid = 104;        rating = 5.0f;
	        up.setItemIDRating(itemid, rating);
	        itemid = 105;        rating = 3.5f;
	        up.setItemIDRating(itemid, rating);
	        itemid = 106;        rating = 3.0f;
	        up.setItemIDRating(itemid, rating);  
        }
        
        if (userid == 7) 
        {

	        up.setUserid(userid);
	        itemid = 102;            rating = 4.5f;
	        up.setItemIDRating(itemid, rating);
	        itemid = 104;            rating = 4.0f;
	        up.setItemIDRating(itemid, rating);
	        itemid = 105;            rating = 1.0f;
	        up.setItemIDRating(itemid, rating);
	        itemid = 106;            rating = 2.8f;
	        up.setItemIDRating(itemid, rating);
        }
        return up;
    }
}