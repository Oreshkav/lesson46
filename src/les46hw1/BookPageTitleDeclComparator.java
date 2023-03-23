package les46hw1;

import java.util.Comparator;

public class BookPageTitleDeclComparator  implements Comparator<Book> {

  @Override
  public int compare(Book o1, Book o2) {

    //Book list sorted by Pages 9-1
    if (o1 != o2) {
      return o1.getPages() - o2.getPages();
    }

    //Book list sorted  Title 9-1")
    if ((o1.getTitle().compareTo(o2.getTitle()) < 0)) {
      return 1;
    }

    if ((o1.getTitle().compareTo(o2.getTitle()) > 0)) {
      return -1;
    }

    return o1.getTitle().compareTo(o2.getTitle());
  }
}
