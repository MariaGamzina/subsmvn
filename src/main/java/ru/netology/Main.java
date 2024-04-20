package ru.netology;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();

        post.name = "Иван";
        post.patronymic = "Иванов";
        post.surname = "Иванович";
        post.passport = "4444 № 444444";
        post.phone = "+7 (999)-999-99-99";
        post.subscription = true;
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;


    }
}