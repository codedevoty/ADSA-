public class Hashcode {
    
    int sum = 0;
  

    public  void hashcode(String str){
        for(int i =0 ; i < str.length() ; i++){
            
             sum += (int)(str.charAt(i));
                  
        }
        int result = sum%(str.length());
        System.out.println(result);
    }

    
}



