package les46hw1;

import java.util.Comparator;

/*Создайте компаратор, который позволит сортировать книги по
// убыванию количества страниц, а при совпадающем объёме - по
// названиям ("по возрастанию", по алфавиту).*/
public class BookPageComparator implements Comparator<Book> {

  @Override
  public int compare(Book o1, Book o2) {

    //Book list sorted by Pages 9-1, than Title 1-9")
//    Integer page1 = o1.getPages();
//    Integer page2 = o2.getPages();
//
//    if (!page1.equals(page2)) {
//      return page1.compareTo(page2);
//    }

    if (o1 != o2) {
      return o1.getPages() - o2.getPages();
    }

    return o1.getTitle().compareTo(o2.getTitle());
  }
}
