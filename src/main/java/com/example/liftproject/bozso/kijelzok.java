package com.example.liftproject.bozso;

public class kijelzok {
    boolean tuzjelzo;
    boolean segelyHivo;
    boolean tulsuly;

    boolean fogglaltsag;
    boolean uzemenKivul;

    boolean emelet_2;
    boolean emelet_1;
    boolean emelet_FSZ;
    boolean emelet_pince;
    boolean emelet_parkolo;

    int ajtoNyitas;

    public kijelzok() {
    }

    public boolean isTuzjelzo() {
        return tuzjelzo;
    }

    public void setTuzjelzo(boolean tuzjelzo) {
        this.tuzjelzo = tuzjelzo;
    }

    public boolean isSegelyHivo() {
        return segelyHivo;
    }

    public void setSegelyHivo(boolean segelyHivo) {
        this.segelyHivo = segelyHivo;
    }

    public boolean isTulsuly() {
        return tulsuly;
    }

    public void setTulsuly(boolean tulsuly) {
        this.tulsuly = tulsuly;
    }

    public boolean isFogglaltsag() {
        return fogglaltsag;
    }

    public void setFogglaltsag(boolean fogglaltsag) {
        this.fogglaltsag = fogglaltsag;
    }

    public boolean isUzemenKivul() {
        return uzemenKivul;
    }

    public void setUzemenKivul(boolean uzemenKivul) {
        this.uzemenKivul = uzemenKivul;
    }

    public boolean isEmelet_2() {
        return emelet_2;
    }

    public void setEmelet_2(boolean emelet_2) {
        this.emelet_2 = emelet_2;
    }

    public boolean isEmelet_1() {
        return emelet_1;
    }

    public void setEmelet_1(boolean emelet_1) {
        this.emelet_1 = emelet_1;
    }

    public boolean isEmelet_FSZ() {
        return emelet_FSZ;
    }

    public void setEmelet_FSZ(boolean emelet_FSZ) {
        this.emelet_FSZ = emelet_FSZ;
    }

    public boolean isEmelet_pince() {
        return emelet_pince;
    }

    public void setEmelet_pince(boolean emelet_pince) {
        this.emelet_pince = emelet_pince;
    }

    public boolean isEmelet_parkolo() {
        return emelet_parkolo;
    }

    public void setEmelet_parkolo(boolean emelet_parkolo) {
        this.emelet_parkolo = emelet_parkolo;
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
                "tuzjelzo=" + tuzjelzo +
                ", segelyHivo=" + segelyHivo +
                ", tulsuly=" + tulsuly +
                ", fogglaltsag=" + fogglaltsag +
                ", uzemenKivul=" + uzemenKivul +
                ", emelet_2=" + emelet_2 +
                ", emelet_1=" + emelet_1 +
                ", emelet_FSZ=" + emelet_FSZ +
                ", emelet_pince=" + emelet_pince +
                ", emelet_parkolo=" + emelet_parkolo +
                ", ajtoNyitas=" + ajtoNyitas +
                '}';
    }
}
