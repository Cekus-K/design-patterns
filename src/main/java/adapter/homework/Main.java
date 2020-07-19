package adapter.homework;

import adapter.homework.adapter.APIAdapter;
import adapter.homework.adapter.BookConnector;
import adapter.homework.adapter.User;
import adapter.homework.adapter.api.LibraryAPI;
import adapter.homework.adapter.api.LibraryAPIImpl;
import adapter.homework.adapter.api.LibraryAPIv2;
import adapter.homework.adapter.api.LibraryAPIv2Impl;

class Main {
    public static void main(String[] args) {

        LibraryAPI api = new LibraryAPIImpl();
        User user1 = new User("Paweł", "Cwik", "32131212");
        BookConnector connector1 = new BookConnector(user1, api);
        connector1.checkAvailability("Harry Potter i Zakon Feniksa");

        System.out.println("-----------------------------------");

        User user2 = new User("Paweł", "Cwik", "32131212");
        LibraryAPIv2 libraryAPIv2 = new LibraryAPIv2Impl();
        APIAdapter apiAdapter = new APIAdapter(libraryAPIv2, user2);
        BookConnector connector2 = new BookConnector(user2, apiAdapter);
        connector2.checkAvailability("Harry Potter i Zakon Feniksa");
    }
}
