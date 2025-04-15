package nested.test.ex1;

public class Library {

  private Book[] books;
  private int size = 0;

  public Library(int capacity) {
    books = new Book[capacity]; // 외부에서 배열 크기 지정
  }

  void addBook(String title, String author) {
    if (size < books.length) {
      books[size++] = new Book(title, author);
    } else {
      System.out.println("도서관 저장 공간이 부족합니다.");
    }
  }

  void showBooks() {
    System.out.println("== 책 목록 출력 ==");
    for (int i = 0; i < size; i++) {
      System.out.println("도서 제목: " + books[i].title + ", 저자: " + books[i].author);
    }
  }

  class Book {

    private String title;
    private String author;

    public Book(String title, String author) {
      this.title = title;
      this.author = author;
    }
  }
}
