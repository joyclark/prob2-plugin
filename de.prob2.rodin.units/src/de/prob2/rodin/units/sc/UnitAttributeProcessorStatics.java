package de.prob2.rodin.units.sc;

public class UnitAttributeProcessorStatics {
	static String translateEventBPragmaToBPragma(String eventBPragma) {
		String bPragma = eventBPragma.replace("^", "**");
		return bPragma;
	}

}
