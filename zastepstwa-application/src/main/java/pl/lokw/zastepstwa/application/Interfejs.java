package pl.lokw.zastepstwa.application;

//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Scanner;
//import java.util.regex.Pattern;

//import pl.lokw.zastepstwa.domain.Nauczyciel;

public class Interfejs {

	/*
    static Scanner sc = new Scanner(System.in);
    
    static NauczycielDAO nauczycielDao = new NauczycielDAO();

    public static void main(String[] args) {
    	String wyborUzytkownika;
    	do {
    		System.out.println();
    		System.out.println("Wybierz, co chcesz zrobić, a następnie zatwierdź enterem:");
	    	System.out.println("[1] Dodaj nowego kota");
	    	System.out.println("[2] Pokaż wszystkie koty");
	    	System.out.println("[x] Zakończ");
			wyborUzytkownika = getUserInput();
	    	if (wyborUzytkownika.equals("1")) {
	    		dodajNauczyciela();
	    	} else if (wyborUzytkownika.equals("2")) {
	    		pokazNauczycieli();
	    	}
    	} while (!wyborUzytkownika.equalsIgnoreCase("x"));
        
    }

	private static void pokazNauczycieli() {
		System.out.println();
		System.out.println("#########################################################");
		System.out.println("######                 LISTA KOTÓW                 ######");
		System.out.println("#########################################################");
		
		Nauczyciel nauczyciel;
		for (int i=0; i<nauczycielDao.getNauczyciele().size(); i++) {
			nauczyciel = nauczycielDao.getNauczyciele().get(i);
			System.out.println(i + ": " + nauczyciel.getImie());
		}
		System.out.println();
		Pattern wzorzecNumeru = Pattern.compile("[0-9]+");
		String numerWczytany;
		do {
			System.out.print("Którego kota chcesz poznać bliżej? ");
			numerWczytany = getUserInput();
		} while (!wzorzecNumeru.matcher(numerWczytany).matches());
		
		Integer numerNauczyciela = Integer.parseInt(numerWczytany);
		if (nauczycielDao.getNauczyciele().size()>numerNauczyciela) {
			Nauczyciel wybranyNauczyciel = nauczycielDao.getNauczyciele().get(numerNauczyciela);
			System.out.println("Wybrany kot ma na imie "+wybranyNauczyciel.getImie()+", waży "+wybranyNauczyciel.getWaga()+", urodził się "+wybranyNauczyciel.getDataUrodzenia().toString()+", a opiekuje się nim "+wybranyNauczyciel.getImieOpiekuna());
		} else {
			System.out.println("Niestety, nie znalazłem kota o wybranym numerze :( Sprobój ponownie lub go dodaj!");
		}
	}

	private static void dodajNauczyciela() {
		System.out.println();
		System.out.println("#########################################################");
		System.out.println("######                 DODAJ  KOTA                 ######");
		System.out.println("#########################################################");
		Nauczyciel nauczyciel = new Nauczyciel();
		System.out.print("Podaj imię kota: ");
        nauczyciel.setImie(getUserInput());

        Pattern wzorzecDaty = Pattern.compile("[0-9]{4}.[0-1]?[0-9].[0-3]?[0-9]");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        String dataUrodzeniaWczytana;
        */
        /*do {
            System.out.print("Podaj datę urodzenia kota w formacie RRRR.MM.DD: ");
            dataUrodzeniaWczytana = getUserInput();
            if (wzorzecDaty.matcher(dataUrodzeniaWczytana).matches()) {
            	try {
            		nauczyciel.setDataUrodzenia(sdf.parse(dataUrodzeniaWczytana));
            	} catch (ParseException pe) {
            		System.out.println("Coś jest nie tak z datą! Przykładowa data: 2014.01.05");
            	}
            }
        } while (nauczyciel.getDataUrodzenia()==null);
        */
        //Pattern wzorzecWagi = Pattern.compile("[0-9]+(\\.[0-9]+)?");
       // String wagaWczytana;
        /*do {
            System.out.print("Podaj wagę kota: ");
            wagaWczytana = getUserInput();
            
            if (wzorzecWagi.matcher(wagaWczytana).matches()) {
                nauczyciel.setWaga(Float.valueOf(wagaWczytana));
            }
        } while (nauczyciel.getWaga() == null);
*/
        //System.out.print("Podaj kto jest opiekunem kota: ");
        //nauczyciel.setImieOpiekuna(getUserInput());

        //nauczycielDao.dodajNauczyciela(nauczyciel);
        /*
        System.out.println("Dziękuję, teraz wiem o kocie naprawdę wszystko! Dodałem go do naszego zbioru.");
	}

    public static String getUserInput() {
        return sc.nextLine().trim();
    }*/

}
