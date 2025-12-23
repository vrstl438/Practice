package Complex_Tasks.Task_2;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
    private List<BookModel> bookContainer = new ArrayList<>();

    public void addBook(BookModel bookModel){
        bookContainer.add(bookModel);
    }

    public void changeStatus(BookModel book, boolean status){
        bookContainer.stream()
                .filter(bookModel -> bookModel.equals(book))
                .findFirst()
                .ifPresent(bookModel -> bookModel.setStatus(status));
    }

    public List<BookModel> searchForAuthor(String author){
        return bookContainer.stream()
                .filter(bookModel -> bookModel.getAuthor().equals(author))
                .toList();
    }

    public List<BookModel> searchForYear(int year){
        return bookContainer.stream()
                .filter(bookModel -> bookModel.getYear() == year)
                .toList();
    }
}
