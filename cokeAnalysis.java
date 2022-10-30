public class cokeAnalysis{
    public static void main(String[] args){

    }


    public static int findAverageConsumption(File dataSet) throws FileNotFoundException{
        Scanner fileScan = new Scanner(dataSet);
        //grab header and put into an AL
        String [] header = fileScan.nextLine().split(",");
        ArrayList <String> headerAsL = new ArrayList<String> (Arrays.asList(header));

        //create an arrayList to hold the averageValues
        ArrayList <Integer> averageValues = new ArrayList<Integer> ();

        //get index of the per capita consumption in 8 oz servings
        int averageConsumptionIndex = headerAsL.indexOf("Per capita consumption in 8 oz servings");

        while(fileScan.hasNextLine()){
            String[] current = fileScan.nextLine().split(",")
        }
        
    }

    public static 
}
        
 