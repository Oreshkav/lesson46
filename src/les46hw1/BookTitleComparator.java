package les46hw1;

import java.util.Comparator;

public class BookTitleComparator implements Comparator<Book> {
  //Создайте компаратор, который позволит сортировать книги
  // по названию, при одинаковых названиях - по автору (и там,
  // и там - по алфавиту)

  @Override
  public int compare(Book o1, Book o2) {

    //Book list sorted by Title 1-9, than Author 1-9")
    if (!o1.getTitle().equals(o2.getTitle())) {
      return o1.getTitle().compareTo(o2.getTitle());
    }
//    if (o1.getAuthor().equals(o2.getAuthor())) {
      return (o1.getAuthor().compareTo(o2.getAuthor()));
//    }
  }
}