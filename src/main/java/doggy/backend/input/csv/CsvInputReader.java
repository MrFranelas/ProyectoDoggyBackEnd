package doggy.backend.input.csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import doggy.backend.domain.Fountain;
import doggy.backend.input.InputReader;
import doggy.backend.repository.FountainsRepository;

public class CsvInputReader implements InputReader {

	public final static String SEPARATOR = ";";
	public final static String QUOTE = "\"";

	@Override
	public void loadInput(String... paths) {
		for (String path : paths) {
			
			File file = new File(path);

			try (BufferedReader br = new BufferedReader(new FileReader(file))) {

				String line = br.readLine();
				line = br.readLine();
				while (null != line) {
					String[] fields = line.split(SEPARATOR);
					
					fields = removeTrailingQuotes(fields);
					
					Fountain fountain = new Fountain(Double.valueOf(fields[5]), Double.valueOf(fields[6]), Double.valueOf(fields[10]), Double.valueOf(fields[11]), fields[3], fields[4],fields[2]);
					
					FountainsRepository.getInstance().addFountain(fountain);
					
					line = br.readLine();
				}

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

	private static String[] removeTrailingQuotes(String[] fields) {

		String result[] = new String[fields.length];

		for (int i = 0; i < result.length; i++) {
			result[i] = fields[i].replaceAll("^" + QUOTE, "").replaceAll(QUOTE + "$", "");
		}
		return result;
	}

}
