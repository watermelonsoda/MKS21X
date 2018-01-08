public Class ReferenceBook extends LibraryBook{

    String collection;

    public ReferenceBook(String author, String title, String ISBN, String callNumber, String collection){
        super(author, title, ISBN, callNumber);
        this. collection = collection;
    }

    public string getCollection(){return collection;}
    public void setCollection(String collection){this.collection = collection;}

    public void checkout(String patron, String due){
        System.out.println("cannot checkout a reference book");
    }

    public void returned(){
        System.out.println("reference books can't even be checked out");
    }

    public String circulationStatus(){
        System.out.println("non-circulating reference book");
    }

    public String toString(){
        return super.toString + "," + collection;
    }

}
