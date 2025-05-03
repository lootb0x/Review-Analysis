import java.util.ArrayList;

public class ReviewAnalysis  
{ 
/** All user reviews to be included in this analysis */  
private Review[] allReviews;  
/** Initializes allReviews to contain all the Review objects to be analyzed */  

public ReviewAnalysis(Review[] p)  
{ 
    allReviews=p;

}  
/** Returns a double representing the average rating of all the Review objects to be * analyzed, as described in part (a) 
* Precondition: allReviews contains at least one Review. 
* No element of allReviews is null. 
*/ 
public double getAverageRating()  
{ 
    int sum = 0;
    double average = 0;
    for(int x=0; x<allReviews.length; x++)
    {
        sum+= allReviews[x].getRating();
    }
    average = (double)sum / (double)allReviews.length;
    return average;
}  
/** Returns an ArrayList of String objects containing formatted versions of * selected user comments, as described in part (b) 
* Precondition: allReviews contains at least one Review. 
* No element of allReviews is null. 
* Postcondition: allReviews is unchanged. 
*/ 
public ArrayList<String> collectComments()  
{
    ArrayList<String> collection =new ArrayList<String>();
    String temps = "";
    int tempi = 0;
    for(int x=0; x<allReviews.length; x++)
    {
        temps = allReviews[x].getComment();
        tempi =allReviews[x].getRating();
        if(temps.indexOf("!")>-1 && 
        !(temps.substring(temps.length()-1, temps.length()).equals(".")) &&
        !(temps.substring(temps.length()-1, temps.length()).equals("!"))
        ) 
        
        collection.add(tempi+"-"+temps+".");

        else  if(temps.indexOf("!")>-1) collection.add(tempi+"-"+temps);
        



    }

    return collection;

}

}  


