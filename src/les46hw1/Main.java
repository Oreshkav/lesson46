package les46hw1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
  //Задача 1

  /*//Используйте класс Book (книга) из предыдущего домашнего задания.
  //Создайте компаратор, который позволит сортировать книги
  // по названию, при одинаковых названиях - по автору (и там,
  // и там - по алфавиту)*/

  //Задача 2* (не обязательно)

  /*Создайте компаратор, который позволит сортировать книги по
  // убыванию количества страниц, а при совпадающем объёме - по
  // названиям ("по возрастанию", по алфавиту).*/

  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();

    books.add(new Book("Author 3", "Book 4", 250));
    books.add(new Book("Author 1", "Book 2", 251));
    books.add(new Book("Author 3", "Book 1", 252));
    books.add(new Book("Author 2", "Book 2", 250));

    Collections.sort(books);
    System.out.println("List of books");
    for (Book b : books) {
      System.out.println(b);
    }
    System.out.println("\nBook list sorted by Title 1-9, than Author 1-9");

    books.sort(new BookTitleComparator());
    for (Book b : books) {
      System.out.println(b);
    }
    System.out.println("\nBook list sorted by Pages 9-1, than Title 1-9");

    books.sort(new BookPageComparator());
    for (Book b : books) {
      System.out.println(b);
    }

    System.out.println("\nBook list sorted by Pages 9-1, than Title 9- 1");

    books.sort(new BookPageTitleDeclComparator());
    for (Book b : books) {
      System.out.println(b);
    }
  }
}
