package dev.afcasco.entitty;

import java.text.DecimalFormat;

@SuppressWarnings("unused")
public class Indemnitzacio {

    private double salariMensual;
    private double importPagaExtra;
    private double salariAnual;
    private int dies;
    private double salariDia;
    private int limit;
    private int antiguitat;
    private double indemnitzacio;
    private double indemnitzacioMax;

    public Indemnitzacio() {
    }

    public int getAntiguitat() {
        return antiguitat;
    }

    public void setAntiguitat(int antiguitat) {
        this.antiguitat = antiguitat;
    }

    public double getSalariAnual() {
        return salariAnual;
    }

    public void setSalariAnual(double salariAnual) {
        this.salariAnual = salariAnual;
    }

    public int getDies() {
        return dies;
    }

    public void setDies(int dies) {
        this.dies = dies;
    }

    public double getIndemnitzacio() {
        return indemnitzacio;
    }

    public void setIndemnitzacio(double indemnitzacio) {
        this.indemnitzacio = indemnitzacio;
    }

    public double getIndemnitzacioMax() {
        return indemnitzacioMax;
    }

    public void setIndemnitzacioMax(double indemnitzacioMax) {
        this.indemnitzacioMax = indemnitzacioMax;
    }

    public double getSalariMensual() {
        return salariMensual;
    }

    public void setSalariMensual(double salariMensual) {
        this.salariMensual = salariMensual;
    }

    public double getImportPagaExtra() {
        return importPagaExtra;
    }

    public void setImportPagaExtra(double importPagaExtra) {
        this.importPagaExtra = importPagaExtra;
    }


    public double getSalariDia() {
        return salariDia;
    }

    public void setSalariDia(double salariDia) {
        this.salariDia = salariDia;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void calculate() {
        salariAnual = salariMensual * 12 + importPagaExtra * 2;
        salariDia = salariAnual / 365;
        indemnitzacio = dies * (antiguitat / 12.0) * salariDia;
        indemnitzacioMax = salariAnual * (limit / 12.0);

        DecimalFormat df = new DecimalFormat("0.00");
        indemnitzacio = Double.parseDouble(df.format(indemnitzacio));

        if (indemnitzacio > indemnitzacioMax) {
            indemnitzacio = indemnitzacioMax;
        }


    }
}