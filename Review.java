/**
 * A Review contains a text String representing a review of a movie,
 * restaurant, purchase, etc.
 * 
 * To be used in the APCS-A case study Consumer Review
 * 
 * @author   Michael Buescher, Hathaway Brown School, modified from the Consumer Review case study code
 * @version  2020-05-30
 **/
 
import java.util.ArrayList;
 
public class Review 
{
    private String reviewText;
    
    public Review (String str)
    {
        reviewText = str;
    }
    
    public String toString()
    {
        return reviewText;
    }

    public double totalSentiment (SentimentList sentiments)
    {
        double ans = 0.0;
        String review = reviewText;
        review += " ";     // so there is always another space to find
        int nextSpace = review.indexOf(" ");
        while (nextSpace >= 0)
        {
            // Fill this in with code to break the review into individual words,
            
            // strip punctuation and whitespace from them, 
            
            // find their sentiment values, and
        
            // maintain a running total
            
            // this line is just to make sure that the loop ends.
            // You need to update nextSpace differently, probably by shortening review
            // and looking for the next space. Then remove this line
            nextSpace = -1;
        }
        
        return ans;
    }
    
    

}