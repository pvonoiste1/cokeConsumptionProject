import java.util.*;
import java.io.*;
public class cokeAnalysis{
    public static void main(String[] args){
        ArrayList<Double> test = new ArrayList<Double>(Arrays.asList(1.0, 5.0, 7.0));
        double mean = mean(test);
        System.out.println(standardDeviation(test, mean));
        File f = new File("countriesCoke.csv");
        mainFindR(f,"Per capita consumption in 8 oz servings", "Proximity to USA (miles)");
    }

    //find correlation coefficient between proximity two variables given name of columns
    public static void mainFindR(File dataSet, String column1, String column2) throws FileNotFoundException{
        Scanner fileScan = new Scanner(dataSet);
        String [] header = fileScan.nextLine().split(",");
        ArrayList <String> headerAsL = new ArrayList<String> (Arrays.asList(header));
        
        //create arrayLists for two variables
        ArrayList <Double> list1 = new ArrayList<Double> ();
        ArrayList <Double> list2 = new ArrayList<Double> ();

        //find indices for proximity and consumption
        int index1 = headerAsL.indexOf(column1); //"Per capita consumption in 8 oz servings"
        int index2 = headerAsL.indexOf(column2); //"Proximity to USA (miles)"

        //populate arrayLists for the two columns
        while(fileScan.hasNextLine()){
            String[] currentLine = fileScan.nextLine().split(",");
            double current1 = Double.parseDouble(currentLine[index1]);
            double current2 = Double.parseDouble(currentLine[index2]);
            list1.add(current1);
            list2.add(current2);
        }

        //find means and standard deviations
        double mean1 = mean(list1);
        double mean2 = mean(list2);
        double stanDev1 = standardDeviation(list1, mean1);
        double stanDev2 = standardDeviation(list2, mean2);

        //find r and print out
        double r = findR(stanDev1, stanDev2, mean1, mean2, list1, list2);
        System.out.println("The correlatoin coefficient between " + column1 + " and" + column2 + " is" + r);
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
            // sum all the differences between the indivdiaul x and the mean squared
            total += Math.pow(list.get(i)-mean, 2);
        }   
        // divide total by total 'N' and take sqrt
        return Math.sqrt(total/list.size());

    }

    public static double findR(double stanDev1, double stanDev2, double mean1, double mean2, ArrayList<Double> list1, ArrayList<Double> list2){
        double numer = 0;
        double denom = stanDev1 * stanDev2;
        for(int i = 0; i<list1.size();i++){
            numer += (list1.get(i)-mean1)*(list2.get(i)-mean2);
        }
        return numer/denom;
    }
}
        
 