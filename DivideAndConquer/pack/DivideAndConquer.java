package pack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class DivideAndConquer {
	
	private static BufferedReader br;
	private static FileReader fr;
	private static File f;
	
	public static void main(String[] args) {
		try {
			f = new File("");
			fr = new FileReader(f);
			br = new BufferedReader(fr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void FileToList(String fileName) {
		// TODO Auto-generated method stub

	}
	
	private void QuickSort(List<Double> list) {
		// TODO Auto-generated method stub

	}
	
	private void MergeSort(List<Double> list) {
		// TODO Auto-generated method stub

	}
}
