/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.manuxpath.akarisql.models;

public class Table {
    private String name;
    private Object[][] rows;
    private String[] columns;

    public Table(String name,String[] columns, Object[][] rows) {
        this.name=name;
        this.columns = columns;
        this.rows = rows;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object[][] getRows() {
        return rows;
    }

    public void setRows(Object[][] rows) {
        this.rows = rows;
    }

    public String[] getColumns() {
        return columns;
    }

    public void setColumns(String[] columns) {
        this.columns = columns;
    }

    public void addRow(Object[] row) {
        // Lógica para añadir una fila a rows
    }

    public void addColumn(String column, Object[] columnData) {
        // Lógica para añadir una columna a columns y actualizar rows
    }
}

