import java.util.ArrayList;

class Grade{
  // this is a constructor 
  public Grade(){
    
  }
  // we create a method that takes an array as an argument
  
  public int getAverage(ArrayList<Integer>grades){
    // it first checks the size of the list to make sure its not less  than one 
    if(grades.size()<1){
      System.out.println("The array list is empty");
    }
    else{
      
       int sum = 0;
      //we loop through the array list passed as an argument and add them 
      for( Integer grade :grades){
        sum =sum+grade;
      }
      int average;
      average=sum/grades.size();
      System.out.println(average);
      return average;
    }
   return 0;
  }
  public static void main(String [] args){
    ArrayList <Integer> myClassroom=new ArrayList<Integer>();
    myClassroom.add(98);
    myClassroom.add(92);
    myClassroom.add(88);
    myClassroom.add(75);
    myClassroom.add(61);
    myClassroom.add(89);
    myClassroom.add(95);
    
   Grade myAnalyzer = new Grade();
    myAnalyzer.getAverage(myClassroom);
    
  }
}
