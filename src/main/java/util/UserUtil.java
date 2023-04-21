package util;

import com.google.gson.Gson;
import enums.environment.UserType;
import exceptions.UserNotFoundInDataException;
import model.User;
import util.environment.EnvironmentDataHandler;

import java.util.EnumMap;

public class UserUtil {

    private static final Gson jsonConverter = new Gson();

    private UserUtil() {}

    static final EnumMap<UserType, String> userTypeMap = new EnumMap<>(UserType.class);

    static {
        userTypeMap.put(UserType.USER_REGISTERED,
                EnvironmentDataHandler.get().userRegistered());
    }

    public static User get(UserType userType) {
        User user = jsonConverter.fromJson(userTypeMap.get(userType), User.class);

        if (user == null) {
            throw new UserNotFoundInDataException(String.format("User type %s not found", userType));
        }

        user.setUserType(userType);

        return user;
    }
}