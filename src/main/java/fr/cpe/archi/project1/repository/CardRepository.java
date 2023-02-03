package fr.cpe.archi.project1.repository;

import fr.cpe.archi.project1.model.Card;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CardRepository {

    List<Card> cards;

    public CardRepository() {
        cards = new ArrayList<>();
    }

    public List<Card> findAll() {
        return cards;
    }

    public Card findByName(String name) {
        for (Card card : cards) {
            if (card.getName().equals(name)) {
                return card;
            }
        }
        return null;
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void deleteCard(Card card) {
        cards.remove(card);
    }

    public void deleteCardByName(String name) {
        Card card = findByName(name);
        if (card != null) {
            deleteCard(card);
        }
    }
}
