public class UniqueNumberGenerator {

    public static void main(String []args){
        
        int randomNumber = 0; // (int)(Math.random() * 64 + 1);
        int[] storage = new int[6];
        
        for(int i = 0; i < storage.length; i++) {
            randomNumber = (int)(Math.random() * 64 + 1);
            storage[i] = randomNumber;
            
            for(int j = 0; j < i; j++) {
                while (storage[j] == randomNumber) {
                    randomNumber = (int)(Math.random() * 64 + 1);
                    storage[i] = randomNumber;
                }
            }
            
        }
        
        
        for(int i = 0; i < storage.length; i++) {
            System.out.println(storage[i]);
        }
        
    }
}