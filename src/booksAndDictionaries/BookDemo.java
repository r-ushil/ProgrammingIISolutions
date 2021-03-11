package booksAndDictionaries;

public class BookDemo {

  public static void main(String[] args) {
    Bookshelf shelf = new Bookshelf();
    shelf.addBookOnLeftSide(new Book("1", "Book 1", 50));
    shelf.addBookOnRightSide(new Book("2", "Book 2", 75));
    shelf.addBookOnLeftSide(new Dictionary("3", "Dictionary 1", 50,
      "Spanish", "English", 100));
    shelf.addBookOnRightSide(new Dictionary("4", "Dictionary 2", 35,
      "French", "English", 200));
    shelf.addBookOnLeftSide(new Book("5", "Book 3", 100));
    shelf.addBookOnRightSide(new Book("6", "Book 4", 60));

    shelf.printLeftToRight();
    System.out.println("\n");

    sortShelf(shelf);
    shelf.printLeftToRight();

  }

  private static void sortShelf(Bookshelf shelf) {
    int size = shelf.size();
    int currentIndex = 0;
    for (int i = 0; i < size; i++) {
      Book b = shelf.remove(currentIndex);
      if (b instanceof Dictionary) {
        shelf.addBookOnRightSide(b);
      } else {
        shelf.addBookOnLeftSide(b);
        currentIndex++;
      }
    }
  }

}
