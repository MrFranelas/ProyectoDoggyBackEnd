package doggy.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import doggy.backend.input.InputReader;
import doggy.backend.input.csv.CsvInputReader;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		
		InputReader inputReader = new CsvInputReader();
		inputReader.loadInput("src/main/resources/csvs/inventario_fuentes_2021.csv");
		
		SpringApplication.run(BackendApplication.class, args);
	}
	
	

}
