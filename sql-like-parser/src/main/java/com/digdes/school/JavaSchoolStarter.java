package com.digdes.school;

import com.digdes.school.parsers.SelectParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class JavaSchoolStarter {
    //Дефолтный конструктор
    public JavaSchoolStarter(){

    }
    //На вход запрос, на выход результат выполнения запроса
    public List<Map<String,Object>> execute(String request) throws Exception {
        String[] tokens = request.split("\\s+");
        String command = tokens[0].toUpperCase();
        String sql= request.toUpperCase(Locale.ROOT);
        switch (command) {
            case "SELECT":
                System.out.println(SelectParser.parse(sql).toString());
                break;
            case "INSERT":
                //parseInsert(tokens);
                break;
            case "UPDATE":
                //parseUpdate(tokens);
                break;
            case "DELETE":
                //parseDelete(tokens);
                break;
            default:
                System.out.println("Unsupported SQL command: " + command);
        }
          return new ArrayList<>();
    }
}
