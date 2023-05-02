package com.digdes.school.parsers;

import com.digdes.school.entities.SelectStatement;
import com.digdes.school.entities.WhereStatement;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SelectParser {

    public static SelectStatement parse(String sql) throws Exception {
        SelectStatement selectStatement = new SelectStatement();

        selectStatement.setWhereStatement(WhereParser.parse(sql));
        return selectStatement;
    }

}
