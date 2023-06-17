import java.util.List;

 interface CheckIfAdult {

     //fields


     //methods

     /*  function to check if bacteria is adult
     function will return false if on position n will be character other than "A" or "B"
     depending on used constructor, e.g. for value "0" function will return false   */
     default boolean CheckIfAdult(List<List<String>> Map, BacteriaCreator BacteriaType, int positionX, int positionY) {


         String adult = String.valueOf(BacteriaType).toUpperCase();
         //checking is there uppercase character - adult bacteria
         return Map.get(positionY).get(positionX).equals(adult);
     }

 }
