package main.util.bpmn;

import java.util.List;

/**
 *
 * @author nico.rehwaldt
 * Camunda
 */
public class First {

	// returns the first element of a specific type
	public static <T> T byType(Class<T> cls, List<?> elements) {
	    for (Object o: elements) {
	      if (cls.isInstance(o)) {
	        return cls.cast(o);
	      }
	    }

	    return null;
	}
}