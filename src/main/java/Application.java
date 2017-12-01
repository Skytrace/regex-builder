import builder.UsdRegexBuilder;
import mock.Mock;

public class Application {

    public static void main(String... args) {
        UsdRegexBuilder usdBuilder = new UsdRegexBuilder();
        final String rule = usdBuilder.getRule("json/usd.json");

        UsdRegexBuilder.assertRule();
    }

}
