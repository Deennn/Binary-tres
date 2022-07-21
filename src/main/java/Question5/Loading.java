package Question5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Loading {



    public MyArrayList<String> solution(String CLIENT_REQUEST_FILE_LOCATION) {
        String FILE_LOCATION = "src/main/java/Question5/sample.txt";

        String SOLUTION_FILE_LOCATION = "src/main/java/Question5/solution.txt";

        PlayGround workSPace = new PlayGround(FILE_LOCATION);
        workSPace.setUpFromFile();
        MyArrayList<String> myArrayList = new MyArrayList<>();

        String line;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(CLIENT_REQUEST_FILE_LOCATION));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(SOLUTION_FILE_LOCATION))){
            while(!(line = bufferedReader.readLine()).equals("END")){
                String [] arr = line.split(",");
                int x = Integer.parseInt(arr[0]);
                int y = Integer.parseInt(arr[1]);
                double expectedPercentile = Double.parseDouble(arr[2]);
                double probabilityPercentile = workSPace.shortestPath(x, y);

                if ((probabilityPercentile >= expectedPercentile)) {
                    myArrayList.add("YES");
                    bufferedWriter.write("YES");
                } else {
                    bufferedWriter.write("NO");
                    myArrayList.add("NO");
                }
                bufferedWriter.write("\n");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return myArrayList;
    }
}
