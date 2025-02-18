class Employees {
    String name;
    String id;
    static String cname = "Infosys";
    int salary;

    int tds() {
        int s = (10 * salary) / 100;
        System.out.println("TDS: " + s);
        return s;
    }
}

class Board extends Employees {
    int profitshare() {
        int ps = (20 * salary) / 100;
        System.out.println("Profit Share: " + ps);
        return ps;
    }
}

class Directors extends Board {
    boolean dm = true;

    void policymakers() {
        System.out.println("Policymaker: " + dm);
    }
}

public class Main {
    public static void main(String[] args) {
        Employees emp = new Employees();
        emp.name = "eza";
        emp.id = "E123";
        emp.salary = 50000;
        System.out.println("Company Name: " + Employees.cname);
        emp.tds();

        Board bm = new Board();
        bm.salary = 60000;
        bm.profitshare();

        Directors director = new Directors();
        director.policymakers();
    }
}
