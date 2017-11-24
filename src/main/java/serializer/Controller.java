package serializer;

import com.google.gson.Gson;
import dto.UsdDTO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.stream.Collectors;

public class Controller {
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

    public static String getUsdRule(final String file) {
        UsdDTO usd = new Controller().fromJsonToDTO(file, UsdDTO.class);
        return usd.getBuy().stream()
                .map(e -> e.getRegex() + "|")
                .collect(Collectors.toList())
                .toString();
    }
}