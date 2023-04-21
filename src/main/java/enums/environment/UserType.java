package enums.environment;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum UserType {

    USER_REGISTERED("usuario registrado en activo");

    private final String value;

    UserType(String value){ this.value = value; }

    public String getValue() { return value; }

    public static UserType findUserProperty(String property){
        Map<String, UserType> valuesToMap =
                Arrays.stream(UserType.values()).parallel()
                        .collect(Collectors.toMap(UserType::getValue, e-> e));
        return valuesToMap.get(property);
    }
}