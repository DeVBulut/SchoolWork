import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DanaLewisArray {
	
	//: I want an array for the storage - so you get some practice on that data type
	DanaLewisDataPoint[] __danaLewisArrays;
	private int size;
	//: Probably add a constructor?

	public DanaLewisArray(){
		__danaLewisArrays = new DanaLewisDataPoint[5];
		size = 0;
	}
	
	public void addDataPoint(DanaLewisDataPoint d) {
		// Get this working
		if (size == __danaLewisArrays.length) {
			int newCapacity = __danaLewisArrays.length * 2;
			DanaLewisDataPoint[] newDataPoints = new DanaLewisDataPoint[newCapacity];
			System.arraycopy(__danaLewisArrays, 0, newDataPoints, 0, size);
			__danaLewisArrays = newDataPoints;
        }

		__danaLewisArrays[size] = d;
        size++;
	}
	
	public int getCurrentAverageHeartRate() {
		int totalHeartRate = 0;
        for (int i = 0; i < size; i++) {
            totalHeartRate += __danaLewisArrays[i].getHeartRate();
        }
        return totalHeartRate / size;
	}

	public int getCurrentAverageInsulinLevel() {
		int totalInsulinLevel = 0;
        for (int i = 0; i < size; i++) {
            totalInsulinLevel += __danaLewisArrays[i].getInsulinLevel();
        }
        return totalInsulinLevel / size;
	}
	
	public static void main(String [] args) {
		
		DanaLewisArray danaLewisArray = new DanaLewisArray();
        File file = new File("unknownPoints.txt");

        try (Scanner scanner = new Scanner(file)) {
            scanner.nextLine();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
				String[] parts = line.split(",");
					if (parts.length == 3) {
						String time = parts[0].trim();
						int heartRate = Integer.parseInt(parts[1].trim());
						int insulinLevel = Integer.parseInt(parts[2].trim());
						DanaLewisDataPoint dataPoint = new DanaLewisDataPoint(time, heartRate, insulinLevel);
						danaLewisArray.addDataPoint(dataPoint);
					}
            }
            System.out.println("Average Heart Rate: " + danaLewisArray.getCurrentAverageHeartRate());
            System.out.println("Average Insulin Level: " + danaLewisArray.getCurrentAverageInsulinLevel());

        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
