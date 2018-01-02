package general.utils;

import java.util.ArrayList;
import java.util.List;

public class ScratchWork {

	private static ScratchWork scratchWork;
	
	private boolean isLogging;
	private List<String> log = new ArrayList<>();
	
	public void log(String work, boolean newLine) {
		log.add(work + (newLine ? System.lineSeparator() : ""));
	}
	
	private ScratchWork() {};
	
	public static ScratchWork getInstance() {
		if(scratchWork == null) {
			scratchWork = new ScratchWork();
		}
		
		return scratchWork;
	}
	
	public void printWork() {
		for (String string : log) {
			System.out.print(string);
		}
	}
	
	
	public boolean isLogging() {
		return isLogging;
	}

	public void setLogging(boolean isLogging) {
		this.isLogging = isLogging;
	}


}
