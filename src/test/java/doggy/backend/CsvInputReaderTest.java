package doggy.backend;

import org.junit.jupiter.api.Test;

import doggy.backend.input.InputReader;
import doggy.backend.input.csv.CsvInputReader;

public class CsvInputReaderTest {
	
	private InputReader inputReader = new CsvInputReader();
	
	@Test
	void readCsvFile() {
		inputReader.loadInput("src/test/resources/csvs/inventario_fuentes_2021.csv");
	}
}
