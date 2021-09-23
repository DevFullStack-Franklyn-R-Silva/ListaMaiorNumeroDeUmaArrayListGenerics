package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.MaiorNumero;


public class Program {
	public static void main(String[] args) {
		String caminho = "C:\\temp\\a.txt";

		List<Integer> list = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			
			String line = br.readLine();
			while (line != null) {
				
				list.add(Integer.parseInt(line));
				line = br.readLine();
			}
			
			Integer x = MaiorNumero.max(list);
			System.out.println("Max: ");
			System.out.println(x);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
