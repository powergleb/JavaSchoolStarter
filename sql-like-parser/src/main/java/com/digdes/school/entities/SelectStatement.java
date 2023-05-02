package com.digdes.school.entities;

import java.util.List;

public class SelectStatement {
    WhereStatement whereStatement;

    public SelectStatement(WhereStatement whereStatement) {
        this.whereStatement = whereStatement;
    }

    public SelectStatement() {
    }

    public WhereStatement getWhereStatement() {
        return whereStatement;
    }

    public void setWhereStatement(WhereStatement whereStatement) {
        this.whereStatement = whereStatement;
    }

    @Override
    public String toString() {
        return "SelectStatement{" +
                "whereStatement=" + whereStatement+
                '}';
    }
}