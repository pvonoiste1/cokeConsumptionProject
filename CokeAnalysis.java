import java.util.*;
import java.io.*;
public class CokeAnalysis{
    public static void main(String[] args) throws FileNotFoundException{
        ArrayList<Double> test = new ArrayList<Double>(Arrays.asList(1.0, 5.0, 7.0));
        double mean = mean(test);
        //System.out.println(standardDeviation(test, mean));
        File f = new File("countriesCoke.csv");
        mainFindR(f,"Per capita consumption in 8 ounce servings", "Proximity to USA (miles)");
        mainFindR(f,"Per capita consumption in 8 ounce servings", "Average BMI (%)");
    }

    //find correlation coefficient between proximity two variables given name of columns
    public static void mainFindR(File dataSet, String column1, String column2) throws FileNotFoundException{
       //grab header and put into arrayList
        Scanner fileScan = new Scanner(dataSet);
        String [] header = fileScan.nextLine().split(",");
        ArrayList <String> headerAsL = new ArrayList<String> (Arrays.asList(header));
        
        //create arrayLists for two variables that I will iterate through
        ArrayList <Double> list1 = new ArrayList<Double> ();
        ArrayList <Double> list2 = new ArrayList<Double> ();

        //find indices for two variables given in the parameters
        int index1 = headerAsL.indexOf(column1); // ex. "Per capita consumption in 8 oz servings"
        int index2 = headerAsL.indexOf(column2); // ex. "Proximity to USA (miles)"

        //populate arrayLists for the two columns
        while(fileScan.hasNextLine()){
            String[] currentLine = fileScan.nextLine().split(",");
            double current1 = Double.parseDouble(currentLine[index1]);
            double current2 = Double.parseDouble(currentLine[index2]);
            list1.add(current1);
            list2.add(current2);
        }

        //find means
        double mean1 = mean(list1);
        double mean2 = mean(list2);

        //find r and print out
        double r = findR(mean1, mean2, list1, list2);
        System.out.println("The correlation coefficient between " + column1 + " and " + column2 + " is " + r + ".");
        double rSquared = findRSquared(r);
        System.out.println(100*rSquared + " of the variability in " + column1 + " can be accounted for in the change in " + column2 + ".");
    }

    public static double mean(ArrayList<Double> list){
        //find the mean given a list
        double total = 0;
        for(int i = 0; i<list.size();i++){
            total += list.get(i);
        }
        //mean is total/num elements
        return total/(list.size());
    }

    public static double standardDeviation(ArrayList<Double> list, double mean){
        double total = 0;
        for(int i = 0; i<list.size();i++){
            // sum all the differences between the individual x and the mean squared
            total += Math.pow(list.get(i)-mean, 2);
        }   
        // divide total by total 'N' and take sqrt
        return Math.sqrt(total/list.size());

    }

    public static double findR(double mean1, double mean2, ArrayList<Double> list1, ArrayList<Double> list2){
        double numer = 0;
        double xsum = 0;
        double ysum = 0;
        //find the numerator by finding the product between each individual x and the mean and each individual y and the mean
        for(int i = 0; i<list1.size();i++){
            numer += (list1.get(i)-mean1)*(list2.get(i)-mean2);
            //find each xsum and ysum, which is the square of the differences between each indvidual x and mean and each individual y and mean
            xsum += Math.pow(list1.get(i)-mean1, 2);
            ysum += Math.pow(list2.get(i)-mean2, 2);
        }
        //r is numerator divided by the sqaure root of the product of the sums
        return numer/(Math.sqrt(xsum*ysum));
    }

    public static double findRSquared(double r){
        return Math.pow(r, 2);
    }
}
        
 