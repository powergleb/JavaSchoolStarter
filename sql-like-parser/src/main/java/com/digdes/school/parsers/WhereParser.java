package com.digdes.school.parsers;

import com.digdes.school.entities.SelectStatement;
import com.digdes.school.entities.User;
import com.digdes.school.entities.WhereStatement;

import java.lang.reflect.Field;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WhereParser {

    public static WhereStatement parse(String sql) throws Exception {
        WhereStatement whereStatement = new WhereStatement();

        String regex = "(WHERE)\\s+'([a-zA-Z0-9_]+)'\\s*(=|<|>|<=|>=|<>|LIKE|ILIKE)\\s*('[^']+'|[0-9]+|%[^%]+%)\\s*((AND|OR)\\s+'([a-zA-Z0-9_]+)'\\s*(=|<|>|<=|>=|<>|LIKE|ILIKE)\\s*('[^']+'|[0-9]+|%[^%]+%))?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sql);

        if (matcher.find()) {
            whereStatement.setColumn1(matcher.group(2));
            whereStatement.setOperator1(matcher.group(3));
            whereStatement.setValue1(matcher.group(4));
            whereStatement.setConjunction(matcher.group(6));
            whereStatement.setColumn2(matcher.group(7));
            whereStatement.setOperator2(matcher.group(8));
            whereStatement.setValue2(matcher.group(9));
            Class<User> userClass = User.class;
            Field[] fields = userClass.getDeclaredFields();
            int counter1=0;
            int counter2=0;

            for (Field field : fields) {
                if (field.getName().toUpperCase(Locale.ROOT).equals(matcher.group(2))) {
                    counter1++;
                    System.out.println(matcher.group(4));
                    if (matcher.group(4).matches("\\d+") && notNumeric(field.getType())){
                        throw new Exception("bad type field in request");
                    }
                }
                if (field.getName().toUpperCase(Locale.ROOT).equals(matcher.group(7))){
                    counter2++;
                    System.out.println(matcher.group(9));
                    if (matcher.group(9).matches("\\d+") && notNumeric(field.getType())){
                        throw new Exception("bad type field in request");
                    }
                }
            }
            if (counter1==0 || counter2==2){
                throw new Exception("bad field in request");
            }


        }
        return whereStatement;
    }

    public static boolean notNumeric(Class<?> fieldType) {
        return (fieldType != byte.class ||
                fieldType != short.class ||
                fieldType != int.class ||
                fieldType != long.class ||
                fieldType != float.class ||
                fieldType != double.class);
    }
}
