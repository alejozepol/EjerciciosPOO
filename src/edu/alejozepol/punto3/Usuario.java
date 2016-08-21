package edu.alejozepol.punto3;

/**
 *
 * @author alejozepol
 */
public class Usuario {

    String nomUsu;
    String Contr1;
    String Contr2;
    String Contr3;
    String Contr4;

    public String getNomUsu() {
        return nomUsu;
    }

    public void setNomUsu(String nomUsu) {
        this.nomUsu = nomUsu;
    }

    public String getContr1() {
        return Contr1;
    }

    public void setContr1(String Contr1) {
        this.Contr1 = Contr1;
    }

    public String getContr2() {
        return Contr2;
    }

    public void setContr2(String Contr2) {
        this.Contr2 = Contr2;
    }

    public String getContr3() {
        return Contr3;
    }

    public void setContr3(String Contr3) {
        this.Contr3 = Contr3;
    }

    public String getContr4() {
        return Contr4;
    }

    public void setContr4(String Contr4) {
        this.Contr4 = Contr4;
    }
    public Usuario(String nomUsu, String Contr1, String Contr2, String Contr3, String Contr4) {
        this.nomUsu = nomUsu;
        this.Contr1 = Contr1;
        this.Contr2 = Contr2;
        this.Contr3 = Contr3;
        this.Contr4 = Contr4;
    }

}
