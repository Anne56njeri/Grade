import java.util.HashMap;

// we create a class library

class Library{
  // we create a constructor 
  public Library(){
    
  }
  // we create a method that takes in a hash map as an argument 
  public void getFinishedBooks(HashMap<String, Boolean>library){
    if (library.size()<1){
      System.out.println("The hash map is empty!!");
    }
    else{
      // we loop through the hashmap and check the value if is equal to true 
      for(String book : library.keySet()){
        if(library.get(book)== true ){
          System.out.println(book);
        }
      }
    }
  }
  public static void main(String[] args){
    HashMap<String, Boolean>myBooks= new HashMap<String ,Boolean>();
    myBooks.put("Road Down The Funnel", true);
    myBooks.put("Rat: A Biology", false);
    myBooks.put("TimeIn", true);
    myBooks.put("3D Food Printing", false);
  
  Library myLibrary= new Library();
  myLibrary.getFinishedBooks(myBooks);
}
}
