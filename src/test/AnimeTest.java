package test;

import Company.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime a = new Anime();
        a.init("boku no hero", "TV", 12, "hero");
        a.imprime();
        System.out.println("______________________________");
        Anime b = new Anime();
        b.init("boku no pico", "TV", 12,"hentai");
        b.imprime();
        System.out.println("______________________________");
    }
}
