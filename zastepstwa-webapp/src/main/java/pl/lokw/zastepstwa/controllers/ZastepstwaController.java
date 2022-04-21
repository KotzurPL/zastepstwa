package pl.lokw.zastepstwa.controllers;

import java.sql.Date;
//import java.util.Calendar;
import org.springframework.stereotype.Controller;
import org.springframework.data.domain.Sort;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import pl.lokw.zastepstwa.application.*;
import pl.lokw.zastepstwa.domain.*;
import pl.lokw.zastepstwa.dto.*;

@Controller
public class ZastepstwaController {
	
    @Autowired
    protected NauczycielDao nauczycielDao;
    @Autowired
    protected PrzedmiotDao przedmiotDao;
    @Autowired
    protected GodzinaDao godzinaDao;
    @Autowired
    protected KlasaDao klasaDao;
    @Autowired
    protected ZastepstwoDao zastepstwoDao;
// główna ######################################################################
    @RequestMapping("/")
    public String metoda() {
        System.out.println("Ooo... Kontroler glowny");
        return "glowny";
    }
// nauczyciele #################################################################
    @RequestMapping("/listaNauczycieli")
    public String listaNauczycieli(Model model) {
        model.addAttribute("nauczyciele", nauczycielDao.findAll());
        System.out.println("Ooo... Kontroler listaNauczycieli");
        return "listaNauczycieli";
    }
        
    @RequestMapping("/dodajNauczyciela")
    public String dodajNauczyciela(
        HttpServletRequest request,
        @ModelAttribute("nauczycielDto")
        @Valid
        NauczycielDTO nauczycielDto,
        BindingResult result
    ) {
        if (request.getMethod().equalsIgnoreCase("post") && !result.hasErrors()) {
            Nauczyciel nauczyciel = new Nauczyciel(
                nauczycielDto.getNazwisko(),
                nauczycielDto.getImie(),
                nauczycielDto.getSkrot()
            );
            nauczycielDao.save(nauczyciel);
            return "redirect:/listaNauczycieli";
        }
        return "dodajNauczyciela";
    }
    
    @RequestMapping("/nauczyciel-{id}")
    public String szczegolyNauczyciela(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("nauczyciel", nauczycielDao.getNauczycielById(id));
        return "szczegolyNauczyciela";
    }
    
// przedmioty ##################################################################
        @RequestMapping("/listaPrzedmiotow")
	public String listaPrzedmiotow(Model model) {
		model.addAttribute("przedmioty", przedmiotDao.findAll());
		System.out.println("Ooo... Kontroler listaPrzedmiotów");
		return "listaPrzedmiotow";
	}
     
        @RequestMapping("/dodajPrzedmiot")
    public String dodajPrzedmiot(
        HttpServletRequest request,
        @ModelAttribute("przedmiotDto")
        @Valid
        PrzedmiotDTO przedmiotDto,
        BindingResult result
    ) {
        if (request.getMethod().equalsIgnoreCase("post") && !result.hasErrors()) {
            Przedmiot przedmiot = new Przedmiot(
                przedmiotDto.getNazwa(),
                przedmiotDto.getSkrot()
            );
            przedmiotDao.save(przedmiot);
            return "redirect:/listaPrzedmiotow";
        }
        return "dodajPrzedmiot";
    }
// godziny #####################################################################
        @RequestMapping("/listaGodzin")
	public String listaGodzin(Model model) {
		model.addAttribute("godziny", godzinaDao.findAll());
		System.out.println("Ooo... Kontroler listaGodzin");
		return "listaGodzin";
	}
// klasy #######################################################################
        @RequestMapping("/listaKlas")
	public String listaKlas(Model model) {
		model.addAttribute("klasy", klasaDao.findAll(Sort.by("aktywna","poziom", "symbol")));
		System.out.println("Ooo... Kontroler listaKlas");
		return "listaKlas";
	}
        
    @RequestMapping(value =  "/dodajKlase")
    public String dodajKlase(
        HttpServletRequest request,
        @ModelAttribute("klasaDto") @Valid KlasaDTO klasaDto,
        BindingResult result
    ) {
        System.out.println("Wejście w dodajKlase!");
        //if (request.getMethod().equalsIgnoreCase("post") && !result.hasErrors()) {
        if (request.getMethod().equalsIgnoreCase("post") && !result.hasErrors()) {
            Klasa klasa = new Klasa(
                klasaDto.getPoziom(),
                klasaDto.getSymbol(),
                klasaDto.getTyp(),
                klasaDto.getAktywna(),
                klasaDto.getDlugosc()
            );
            klasaDao.save(klasa);
            return "redirect:/listaKlas";
        }
        return "dodajKlase";
    }
// zastępstwa ##################################################################
	@RequestMapping(value="/listaZastepstw", method = RequestMethod.GET)
	public String listaZastepstw(
            HttpServletRequest request,
            @ModelAttribute("dataDto") DataDTO dataDto,
            BindingResult result,
            Model model
        ) {
            System.out.println("Pierwsze wyświetlenie zastępstw.");
            //Date dataZast = new java.sql.Date(Calendar.getInstance().getTime().getTime());
            Date dataZast = Date.valueOf("2020-03-02");
            model.addAttribute("zastepstwa", zastepstwoDao.findByData(dataZast));
            model.addAttribute("dataZast", dataZast);
            System.out.println("Ooo... Kontroler listaZastępstw");
            return "listaZastepstw";
	}
        
        @RequestMapping(value="/listaZastepstw", method = RequestMethod.POST)
	public String listaZastepstwPokaz(
            HttpServletRequest request,
            @ModelAttribute("dataDto")
            DataDTO dataDto,
            BindingResult result,
            Model model
        ) {
            System.out.println("Wyświetlenie zastępstw po podaniu daty.");
            //Date dataZast = new java.sql.Date(Calendar.getInstance().getTime().getTime());
            Date dataZast = Date.valueOf(dataDto.getDataListaZast().toString());
            model.addAttribute("zastepstwa", zastepstwoDao.findByData(dataZast));
            model.addAttribute("dataZast", dataZast);
            System.out.println("Ooo... Kontroler listaZastępstw");
            return "listaZastepstw";
	}
        
        @RequestMapping("/dodajZastepstwo")
	public String dodajZastepstwo(
            HttpServletRequest request,
            @ModelAttribute("zastepstwoDto") @Valid ZastepstwoDTO zastepstwoDto,
            BindingResult result,
            Model model
        ) {
            
            model.addAttribute("godziny", godzinaDao.findAll(Sort.by("id")));
            model.addAttribute("nauczyciele", nauczycielDao.findAll(Sort.by("nazwisko", "imie")));
            model.addAttribute("klasy", klasaDao.findAll(Sort.by("poziom", "symbol")));
            model.addAttribute("przedmioty", przedmiotDao.findAll());
            
            System.out.println("metoda: " + request.getMethod());
            System.out.println("czy są błędy: " + result.hasErrors());
            
            if (request.getMethod().equalsIgnoreCase("post") && !result.hasErrors()) {
                
                int ile = zastepstwoDto.getListaZast().size();
                System.out.println("długość listy: " + ile);
                
                Integer idNieobecnego = zastepstwoDto.getNieobecny();
                Nauczyciel nieobecny = nauczycielDao.getNauczycielById(idNieobecnego);
                
                Date data = zastepstwoDto.getDataZastepstwa();
                
                for (int i = 0; i < ile; i++) {
                    
                    ZastIDS zastIDS = zastepstwoDto.getListaZast().get(i);
                    Integer idKlasy = zastIDS.getKlasaID();
                    Integer idPierwotnego = zastIDS.getPierwotnyID();
                    Integer idZastepujacego = zastIDS.getZastepujacyID();
                    Integer idDocelowego = zastIDS.getDocelowyID();
                    if (idNieobecnego != null && idKlasy != null && idPierwotnego != null && idZastepujacego != null && idDocelowego != null) {
                        System.out.println(idKlasy);
                        Godzina godzina = godzinaDao.getGodzinaById(i);
                        Klasa klasa = klasaDao.getKlasaById(idKlasy);
                        Przedmiot pierwotny = przedmiotDao.getPrzedmiotById(idPierwotnego);
                        Nauczyciel zastepujacy = nauczycielDao.getNauczycielById(idZastepujacego);
                        Przedmiot docelowy = przedmiotDao.getPrzedmiotById(idDocelowego);
                        
                        Zastepstwo zastepstwo = new Zastepstwo(
                            data,
                            nieobecny,
                            godzina,
                            klasa,
                            pierwotny,
                            zastepujacy,
                            docelowy
                        );
                        zastepstwoDao.save(zastepstwo);
                        System.out.println("Zapisany");
                    } 
                }
                return "redirect:/listaZastepstw";
            }
            return "dodajZastepstwo";
	}
	
        @RequestMapping("/zastepstwa")
	public String zastepstwa(Model model) {
                java.util.Date utilDate = new java.util.Date(2021-1900, 3, 8);
                java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
		model.addAttribute("wynik", zastepstwoDao.findByDataOrderByNauczycielNieobecnyAscGodzinaAsc(sqlDate).toString());
		System.out.println("Ooo... Kontroler zastepstwa");
                System.out.println(sqlDate);
                System.out.println(zastepstwoDao.findByDataOrderByNauczycielNieobecnyAscGodzinaAsc(sqlDate).toString());
                
		return "zastepstwa";
	}	
        
}
