package DI;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Objects;

public class Context {
	 static class Foo {
	        String getMessage() {
	            return "Hello!";
	        }
	    }
	static HashMap<String, Class> types = new HashMap<>();
	static HashMap<String, Class> beans = new HashMap<>();

	static void register(String name, Class type) {
		types.put(name, type);
	}

	
	// containerに登録済みなら返してなければ生成して返す。
	static Object getBean(String name) {
		return beans.computeIfAbsent(name, key ->{
			Class type = types.get(name);
			Objects.requireNonNull(type, name + "not found" );
				try {
					return (Class) type.getDeclaredConstructor().newInstance(); // Todo cast dekinai
				} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
						| InvocationTargetException | NoSuchMethodException | SecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return type;
		});
	}
}
