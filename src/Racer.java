import java.time.LocalDate;

public class Racer {
    Racer chuck;
    String chucksname;

    Racer firstRacer=new Racer();
    Racer secondRacer=new Racer();
    public String getChucksname() {
        return chucksname;
    }

    public void setChucksname(String chucksname) {
        this.chucksname = chucksname;

        System.out.println(firstRacer.getChucksname());

        chuck=new Racer();

    }
}
