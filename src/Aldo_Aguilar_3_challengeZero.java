public class Aldo_Aguilar_3_challengeZero {
    public static void main(String args[]){
        for (int i = 1; i < 500; i ++){
            
            if (isDivisibleByTwo(i) & isDivisibleByThree(i)){
                System.out.println( i+" Chisme");
            }
            
            else if (isDivisibleByFive(i) & isDivisibleByThree(i)){
                System.out.println( i+" Old School");
            }
            
            else if (isDivisibleByFive(i) & isDivisibleByThree(i) & isDivisibleByTwo(i)){
                System.out.println( i+" Team Building");
            }
            
            else{
                if (isDivisibleByTwo(i) & isDivisibleByEleven(i) ){
                    System.out.println( i+" Ninja");
                }
            
                else if (isDivisibleByTwo(i)){
                    System.out.println( i+" Davis");
                }
            
                if(isDivisibleByThree(i) & isDivisibleByEleven(i)){
                    System.out.println( i+" Herr Direktor");
                }
                else if (isDivisibleByThree(i)){
                    System.out.println( i+" Claughton");
                }
            
                if(isDivisibleByFive(i) & isDivisibleByEleven(i)){
                    System.out.println( i+" Animate This");
                }
            
                else if (isDivisibleByFive(i)){
                    System.out.println( i+" Vidal");
                }
            }
            
        }
    }
    
    static boolean isDivisibleByTwo (int number){
        if (number % 2 == 0){
            return true;
        }
        
        else{
            return false;
        }

    }

    static boolean isDivisibleByThree(int number){
        if (number % 3 ==0){
            return true;
        }
        
        else{
            return false;
        }
    }
    
    static boolean isDivisibleByFive(int number){
        if (number % 5 ==0){
            return true;
        }
        
        else{
            return false;
        }
    }
    
    static boolean isDivisibleByEleven(int number){
        if (number % 11 ==0){
            return true;
        }
        
        else{
            return false;
        }
    }
    
        

}
