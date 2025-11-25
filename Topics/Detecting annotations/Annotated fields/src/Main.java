import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

/**
 Get an array of fields the object declares that contain annotations (inherited fields should be skipped).
 */
class AnnotationsUtil {

    public static String[] getFieldsContainingAnnotations(Object object) {
        // Add implementation here
        List<String> fields = new ArrayList<>();
        Field[] field = object.getClass().getDeclaredFields();

        for (Field value : field) {
            if (value.getDeclaredAnnotations().length >= 1) {
                fields.add(value.getName());
            }
        }
        return fields.toArray(new String[0]);
    }

}