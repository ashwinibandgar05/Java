class books{
    String title;
    String author;
    int price;
    books(String title,String author,int price){
      this.title=title;
      this.author=author;
      this.price=price;


    }
    void display(){
        System.out.println("Title of book:"+title);
        System.out.println("Author of book:"+author);
        System.out.println("Price of book:"+price);

    }
}

public class OnlineLibrary {
    public static void main(String[] args){

    }
}
