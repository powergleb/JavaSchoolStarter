package com.digdes.school;


import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String... args){
        JavaSchoolStarter starter = new JavaSchoolStarter();
        try {

            List<Map<String,Object>> result3 = starter.execute("SELECT WHERE 'age' == 34 and 'lastName' ilike '%п%'");

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
