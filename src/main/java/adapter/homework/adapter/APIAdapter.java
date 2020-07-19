package adapter.homework.adapter;

import adapter.homework.adapter.api.LibraryAPI;
import adapter.homework.adapter.api.LibraryAPIv2;

import java.time.LocalDate;

public class APIAdapter implements LibraryAPI {

    private LibraryAPIv2 api;
    private User user;

    public APIAdapter(LibraryAPIv2 api, User user) {
        this.api = api;
        this.user = user;
    }


    @Override
    public boolean isAvailable(String bookTitle) {
        return api.numberOfAvailableCopies(bookTitle) > 0;
    }

    @Override
    public LocalDate dueDate(String bookTitle, String pesel) {
        return api.dueDate(bookTitle, user.getFirstName(), user.getLastName(), user.getDateOfBirth());
    }

    @Override
    public boolean reserve(String bookTitle, String pesel) {
        return api.reserve(bookTitle, user.getFirstName(), user.getLastName(), user.getDateOfBirth());
    }
}
