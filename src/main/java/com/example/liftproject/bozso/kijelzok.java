package com.example.liftproject.bozso;

public class kijelzok {
    boolean istuzjelzo;
    boolean issegelyHivo;
    boolean istulsuly;

    boolean isfogglaltsag;
    boolean isuzemenKivul;

    boolean isemelet_2;
    boolean isemelet_1;
    boolean isemelet_FSZ;
    boolean isemelet_pince;
    boolean isemelet_parkolo;

    int ajtoNyitas;

    public kijelzok() {
    }

    public boolean isIstuzjelzo() {
        return istuzjelzo;
    }

    public void setIstuzjelzo(boolean istuzjelzo) {
        this.istuzjelzo = istuzjelzo;
    }

    public boolean isIssegelyHivo() {
        return issegelyHivo;
    }

    public void setIssegelyHivo(boolean issegelyHivo) {
        this.issegelyHivo = issegelyHivo;
    }

    public boolean isIstulsuly() {
        return istulsuly;
    }

    public void setIstulsuly(boolean istulsuly) {
        this.istulsuly = istulsuly;
    }

    public boolean isIsfogglaltsag() {
        return isfogglaltsag;
    }

    public void setIsfogglaltsag(boolean isfogglaltsag) {
        this.isfogglaltsag = isfogglaltsag;
    }

    public boolean isIsuzemenKivul() {
        return isuzemenKivul;
    }

    public void setIsuzemenKivul(boolean isuzemenKivul) {
        this.isuzemenKivul = isuzemenKivul;
    }

    public boolean isIsemelet_2() {
        return isemelet_2;
    }

    public void setIsemelet_2(boolean isemelet_2) {
        this.isemelet_2 = isemelet_2;
    }

    public boolean isIsemelet_1() {
        return isemelet_1;
    }

    public void setIsemelet_1(boolean isemelet_1) {
        this.isemelet_1 = isemelet_1;
    }

    public boolean isIsemelet_FSZ() {
        return isemelet_FSZ;
    }

    public void setIsemelet_FSZ(boolean isemelet_FSZ) {
        this.isemelet_FSZ = isemelet_FSZ;
    }

    public boolean isIsemelet_pince() {
        return isemelet_pince;
    }

    public void setIsemelet_pince(boolean isemelet_pince) {
        this.isemelet_pince = isemelet_pince;
    }

    public boolean isIsemelet_parkolo() {
        return isemelet_parkolo;
    }

    public void setIsemelet_parkolo(boolean isemelet_parkolo) {
        this.isemelet_parkolo = isemelet_parkolo;
    }

    public int getAjtoNyitas() {
        return ajtoNyitas;
    }

    public void setAjtoNyitas(int ajtoNyitas) {
        this.ajtoNyitas = ajtoNyitas;
    }

    @Override
    public String toString() {
        return "kijelzok{" +
                "istuzjelzo=" + istuzjelzo +
                ", issegelyHivo=" + issegelyHivo +
                ", istulsuly=" + istulsuly +
                ", isfogglaltsag=" + isfogglaltsag +
                ", isuzemenKivul=" + isuzemenKivul +
                ", isemelet_2=" + isemelet_2 +
                ", isemelet_1=" + isemelet_1 +
                ", isemelet_FSZ=" + isemelet_FSZ +
                ", isemelet_pince=" + isemelet_pince +
                ", isemelet_parkolo=" + isemelet_parkolo +
                ", ajtoNyitas=" + ajtoNyitas +
                '}';
    }
}
