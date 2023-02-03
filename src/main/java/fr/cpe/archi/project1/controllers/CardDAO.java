package fr.cpe.archi.project1.controllers;

import org.springframework.stereotype.Service;

@Service
public class CardDAO {

    private String name;
    private String description;
    private String family;
    private String affinity;
    private String imgUrl;
    private String smallImgUrl;
    private int id;
    private int energy;
    private int hp;
    private int defence;
    private int attack;
    private int price;

    public String getName() {
        return name;
    }

    public CardDAO setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CardDAO setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getFamily() {
        return family;
    }

    public CardDAO setFamily(String family) {
        this.family = family;
        return this;
    }

    public String getAffinity() {
        return affinity;
    }

    public CardDAO setAffinity(String affinity) {
        this.affinity = affinity;
        return this;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public CardDAO setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
        return this;
    }

    public String getSmallImgUrl() {
        return smallImgUrl;
    }

    public CardDAO setSmallImgUrl(String smallImgUrl) {
        this.smallImgUrl = smallImgUrl;
        return this;
    }

    public int getId() {
        return id;
    }

    public CardDAO setId(int id) {
        this.id = id;
        return this;
    }

    public int getEnergy() {
        return energy;
    }

    public CardDAO setEnergy(int energy) {
        this.energy = energy;
        return this;
    }

    public int getHp() {
        return hp;
    }

    public CardDAO setHp(int hp) {
        this.hp = hp;
        return this;
    }

    public int getDefence() {
        return defence;
    }

    public CardDAO setDefence(int defence) {
        this.defence = defence;
        return this;
    }

    public int getAttack() {
        return attack;
    }

    public CardDAO setAttack(int attack) {
        this.attack = attack;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public CardDAO setPrice(int price) {
        this.price = price;
        return this;
    }
}
