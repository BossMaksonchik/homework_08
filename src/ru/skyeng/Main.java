package ru.skyeng;

public class Main {

    public static void main(String[] args) {
        Author bukovski = new Author(" Charlz", " Bukovski");
        Author london = new Author(" Jack", " London");

        Book women = new Book(bukovski, " Women", 1978);
        Book loveInLife = new Book(london, " Love in Life", 1905);
        System.out.println(women.getAuthor().getAuthorFullName() + " " + women.getTitle() + " " + women.getPublisherYear());
        System.out.println(loveInLife.getAuthor().getAuthorFullName() + " " + loveInLife.getTitle() + " " + loveInLife.getPublisherYear());
        System.out.println();
        System.out.println(" Меняем год выпуска ");
        loveInLife.setPublisherYear(2022);
        System.out.println(loveInLife.getAuthor().getAuthorFullName() + " " + loveInLife.getTitle() + " " + loveInLife.getPublisherYear());
    }
}
