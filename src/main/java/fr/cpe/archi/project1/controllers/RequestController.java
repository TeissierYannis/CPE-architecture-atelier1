package fr.cpe.archi.project1.controllers;


import fr.cpe.archi.project1.model.Card;
import fr.cpe.archi.project1.repository.CardRepository;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RequestController {

    @Autowired
    private CardRepository cardRepository;

    @GetMapping(value = "/static/addCard")
    public String addCard() {
        return "static/cardCreateForm";
    }

    @GetMapping(value = "/static/showCard")
    public String showCard() {
        return "static/cardView";
    }

    @GetMapping(value = "/")
    public String index(Model model) {

        CardDAO cardDAO = new CardDAO();
        model.addAttribute("card", cardDAO);

        return "index";
    }

    @GetMapping(value = "/addCard")
    public String addCard(Model model) {

        CardDAO cardDAO = new CardDAO();
        model.addAttribute("cardForm", cardDAO);

        return "addCard";
    }

    @PostMapping(value = "/addCard")
    public String addCard(CardDAO cardDAO) {

        Card card = Card.FromDAO(cardDAO);
        cardRepository.addCard(card);

        return "redirect:/";
    }

    @PostMapping(value = "/show")
    public String showCard(Model model, CardDAO cardDAO) {
        Card card = cardRepository.findByName(cardDAO.getName());

        if (card == null) {
            return "redirect:/404";
        }

        model.addAttribute("card", card);

        return "showCard";
    }
}
