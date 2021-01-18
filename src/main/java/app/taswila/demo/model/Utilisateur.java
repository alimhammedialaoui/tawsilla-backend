package app.taswila.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Utilisateur {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private int age ;
    private String sexe ;
    private String preference ;
    private  int pricemin;
    private int pricemax;
    private boolean handicap ;

    public Utilisateur() {
    }

    public Utilisateur(int age, String sexe, String preference, int pricemin, int pricemax, boolean handicap) {
        this.age = age;
        this.sexe = sexe;
        this.preference = preference;
        this.pricemin = pricemin;
        this.pricemax = pricemax;
        this.handicap = handicap;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getPreference() {
        return preference;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }

    public int getPricemin() {
        return pricemin;
    }

    public void setPricemin(int pricemin) {
        this.pricemin = pricemin;
    }

    public int getPricemax() {
        return pricemax;
    }

    public void setPricemax(int pricemax) {
        this.pricemax = pricemax;
    }

    public boolean isHandicap() {
        return handicap;
    }

    public void setHandicap(boolean handicap) {
        this.handicap = handicap;
    }
}
