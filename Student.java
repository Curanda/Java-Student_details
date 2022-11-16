public class Student {
    private String imie;
    private String nazwisko;
    private int wiek;
    private String miejscowosc;
    private String stanStudenta;

    public static void main(String[] args) {
        // nowa instancja
        Student student1 = new Student("Egill", "Skallagrimson", 30, "Borgarnes", "p");

       // getter do imienia
        System.out.println("Imie studenta to : " + student1.getImie());

        // setter do stanu studenta
        student1.setstanStudenta("n");
        // getter do stanu studenta po zmianie
        System.out.println("Stan studenta to : " + student1.getstanStudenta());

        // do wyswietlania danych studenta
        student1.Wyswietl();

        // tutaj ostatni podpunkt, czyli switch.
        // Najpierw get do maina bo nie chce spoza statyka wyciagac.
        String stanStudenta = student1.getstanStudenta();

        // tutaj switch.

        switch (stanStudenta) {
            case "p":
                System.out.println("Student po sesji");
                break;
            case "n":
                System.out.println("Student normalny");
                break;
            case "z":
                System.out.println("Student zakochany");
                break;
            case "s":
                System.out.println("Student szczesliwy");
                break;
        }


    }

// konstruktor z 2 argumentami
    public Student(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

// konstruktor z 5 argumentami
    public Student(String imie, String nazwisko, int wiek, String miejscowosc, String stanStudenta) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.miejscowosc = miejscowosc;
        this.stanStudenta = stanStudenta;
    }

//konstruktor z bez argumentow i defaultowe wartosci
    public Student() {
        this.imie = "imie";
        this.nazwisko = "nazwisko";
        this.wiek = 0;
        this.miejscowosc = "miejscowosc";
        this.stanStudenta = "N";
    }

    // funkcja wyswietlajaca wszystkie dane
    public void Wyswietl() {
        System.out.println("Imie: " + this.imie);
        System.out.println("Nazwisko: " + this.nazwisko);
        System.out.println("Wiek: " + this.wiek);
        System.out.println("Miejscowosc: " + this.miejscowosc);
        System.out.println("Stan studenta: " + this.stanStudenta);
    }

    // funkcja gettera
    public String getImie() {
        return (imie);
    }

    // funkcja settera
    public void setstanStudenta(String stanStudenta) {
        this.stanStudenta = stanStudenta;
    }

    // funkcja gettera do zmienionego stanu studenta
    public String getstanStudenta() {
        return (stanStudenta);
    }

}
