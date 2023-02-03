package fr.cpe.archi.project1.model;

import fr.cpe.archi.project1.controllers.CardDAO;

public class Card {
    private final String name;
    private final String description;
    private final String family;
    private final String affinity;
    private final String imgUrl;
    private final String smallImgUrl;
    private final int id;
    private final int energy;
    private final int hp;
    private final int defence;
    private final int attack;
    private final int price;

    public static Card FromDAO(CardDAO dao)  {
        return new Card(
                dao.getName(),
                dao.getDescription(),
                dao.getFamily(),
                dao.getAffinity(),
                dao.getImgUrl(),
                dao.getSmallImgUrl(),
                dao.getId(),
                dao.getEnergy(),
                dao.getHp(),
                dao.getDefence(),
                dao.getAttack(),
                dao.getPrice()
        );
    }

    private Card(
            String name,
            String description,
            String family,
            String affinity,
            String imgUrl,
            String smallImgUrl,
            int id,
            int energy,
            int hp,
            int defence,
            int attack,
            int price
    ) {
        this.name = name;
        this.description = description;
        this.family = family;
        this.affinity = affinity;
        this.imgUrl = imgUrl;
        this.smallImgUrl = smallImgUrl;
        this.id = id;
        this.energy = energy;
        this.hp = hp;
        this.defence = defence;
        this.attack = attack;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getFamily() {
        return family;
    }

    public String getAffinity() {
        return affinity;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getSmallImgUrl() {
        return smallImgUrl;
    }

    public int getId() {
        return id;
    }

    public int getEnergy() {
        return energy;
    }

    public int getHp() {
        return hp;
    }

    public int getDefence() {
        return defence;
    }

    public int getAttack() {
        return attack;
    }

    public int getPrice() {
        return price;
    }

    public CardDAO ToDAO() {
        return new CardDAO()
                .setName(name)
                .setDescription(description)
                .setFamily(family)
                .setAffinity(affinity)
                .setImgUrl(imgUrl)
                .setSmallImgUrl(smallImgUrl)
                .setId(id)
                .setEnergy(energy)
                .setHp(hp)
                .setDefence(defence)
                .setAttack(attack)
                .setPrice(price);
    }
}
