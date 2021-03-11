package booksAndDictionaries;

import java.util.LinkedList;
import java.util.List;

public class Bookshelf {

  private final List<Book> bookshelf;

  public Bookshelf() {
    this.bookshelf = new LinkedList<>();
  }

  public int size() {
    return bookshelf.size();
  }

  public void addBookOnLeftSide(Book b) {
    bookshelf.add(0, b);
  }

  public void addBookOnRightSide(Book b) {
    bookshelf.add(size(), b);
  }

  public void addBook(int i, Book b) {
    bookshelf.add(i, b);
  }

  public Book remove(int i) {
    return bookshelf.remove(i);
  }

  public void printLeftToRight() {
    for (Book b : bookshelf) {
      System.out.println(b.toString());
    }
  }

  public void printRightToLeft() {
    for (int i = size() - 1; i >= 0; i--) {
      System.out.println(bookshelf.get(i).toString());
    }
  }


}
