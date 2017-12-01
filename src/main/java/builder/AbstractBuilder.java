package builder;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public abstract class AbstractBuilder {
    private static Gson gson = new Gson();

    public <T extends Object>T fromJsonToDTO(String fileName, Class<T> clazz) {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource(fileName).getFile());
            return gson.fromJson(new FileReader(file), clazz);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    abstract String getRule(final String file);

    abstract String getDescription(final String file);

}
