package com.digdes.school.entities;

public class WhereStatement {
    public String column1;
    public String operator1;
    public String value1;
    public String conjunction;
    public String column2;
    public String operator2;
    public String value2;


    public WhereStatement() {

    }

    public WhereStatement(String column1, String operator1, String value1, String conjunction, String column2, String operator2, String value2) {
        this.column1 = column1;
        this.operator1 = operator1;
        this.value1 = value1;
        this.conjunction = conjunction;
        this.column2 = column2;
        this.operator2 = operator2;
        this.value2 = value2;
    }

    public String getColumn1() {
        return column1;
    }

    public void setColumn1(String column1) {
        this.column1 = column1;
    }

    public String getOperator1() {
        return operator1;
    }

    public void setOperator1(String operator1) {
        this.operator1 = operator1;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getConjunction() {
        return conjunction;
    }

    public void setConjunction(String conjunction) {
        this.conjunction = conjunction;
    }

    public String getColumn2() {
        return column2;
    }

    public void setColumn2(String column2) {
        this.column2 = column2;
    }

    public String getOperator2() {
        return operator2;
    }

    public void setOperator2(String operator2) {
        this.operator2 = operator2;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }


    @Override
    public String toString() {
        return "WhereStatement{" +
                "column1='" + column1 + '\'' +
                ", operator1='" + operator1 + '\'' +
                ", value1='" + value1 + '\'' +
                ", conjunction='" + conjunction + '\'' +
                ", column2='" + column2 + '\'' +
                ", operator2='" + operator2 + '\'' +
                ", value2='" + value2 + '\'' +
                '}';
    }
}
