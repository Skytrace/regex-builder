package builder;

import dto.UsdDTO;
import java.util.stream.Collectors;

public class UsdRegexBuilder extends AbstractBuilder {

    @Override
    public String getRule(final String file) {
        UsdDTO usd = fromJsonToDTO(file, UsdDTO.class);
        return usd.getBuy().stream()
                .map(e -> e.getRegex() + "|")
                .collect(Collectors.toList())
                .toString();
    }

    @Override
    public String getDescription(final String file) {
        UsdDTO usd = fromJsonToDTO(file, UsdDTO.class);
        return usd.getBuy().stream()
                .map(e -> "\n" + e.getDescr() + "\n")
                .collect(Collectors.toList())
                .toString();
    }

    public static void assertRule(final String value, final String rule) {
        if(!value.matches(rule)) throw new IllegalArgumentException("arguments should be: ");
    }
}