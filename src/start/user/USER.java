package start.user;

import java.util.Date;

public class USER {
    private String login;
    private String password;
    private double salary;
    private boolean activity;
    private Date empl_date;



// ctrl-insert - constructor select none, bez argumentowy
    public USER() {


    }

    // konstruktory ctrl - alt - przypisuje wartosci do wszystkich zmiennych, wygasza konstruktor domyslny
    public USER(String login, String password, double salary, boolean activity, Date empl_date) {
        this.login = login;
        this.password = password;
        this.salary = salary;
        this.activity = activity;
        this.empl_date = empl_date;
    }

    // ALT + INSERT  - AUTO GENERACJA - metoda toString();
    public String toString() {
        return "USER{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", salary=" + salary +
                ", activity=" + activity +
                ", empl_date=" + empl_date +
                '}';


    }

    public String getLogin() {
        return login;
    }

    //nie zwraca zadnej wartosci, ustawia wartosc login,
    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
// zmeinne logiczne, is - moze byc albo nie, np, przy autoryszacji
    public boolean isActivity() {
        return activity;
    }

    public void setActivity(boolean activity) {
        this.activity = activity;
    }

    public Date getEmpl_date() {
        return empl_date;
    }

    public void setEmpl_date(Date empl_date) {
        this.empl_date = empl_date;
    }
}
