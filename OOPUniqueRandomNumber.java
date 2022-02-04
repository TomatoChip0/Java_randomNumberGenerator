import java.util.Scanner;

public class OOPUniqueNumberGenerator {
    
    Scanner input = new Scanner(System.in);
    int randomNumber = 0;
    int start = 0;
    int end  = 0;
    int length = 0;
    
    
    int[] storage;
    
    /**
     * this method is used to generate unique random number from the range start and end
     * 
     * @param start
     * @param end
     * @param length
     * 
     */
     
    
    public OOPUniqueNumberGenerator(int start, int end, int length) {
        this.start = start;
        this.end = end;
        this.length = length;
    }
    
    void setRandomNumber(int randomNumber, int start, int end) {this.randomNumber = (int)(Math.random() * end + start );}
    
    int getRandomNumber() {return randomNumber;}
    
    void setStart(int start) {this.start = start;}
    
    int getStart() {return start;}
    
    void setEnd(int end) {this.end = end;}
    
    int getEnd() {return end;}
    
    void setLength(int length) {this.length = length;}
    
    int getLength() {return length;}
    
    /**
     * check dupplication in the array and return boolean value
     * @param numb1
     * @param numb2
     * 
     * @return boolean 
    */
    boolean checkDupplicate(int numb1, int numb2) {
        return (numb1 == numb2) ? true : false;
    }
    
    int randomNumber() {
        return (int)(Math.random() * this.end + this.start);
    }
    
    void generateNumber() {
        storage = new int[this.length];
        boolean checkDupp;
        
        
        for(int i = 0; i < storage.length; i++) {
            randomNumber = randomNumber();
            storage[i] = randomNumber;
            
            
            
            for(int j = 0; j < i; j++) {
                
                checkDupp = checkDupplicate(storage[j], randomNumber);
                
                while(checkDupp){
                    randomNumber = randomNumber();
                    storage[i] = randomNumber;
                }
            }
            
        }
    }
    
    void printArray() {
        for(int i = 0; i < storage.length; i++) {
            System.out.print(storage[i] + " ");
        }
        System.out.println();
    }
    
    
    @Override
    public String toString() {
        return 
        "start: " + this.getStart() + " " +
        "end: " + this.getEnd() + " " +
        "length: " + this.getLength();
    }
    
    
    
    

    public static void main(String []args){
        
        OOPUniqueNumberGenerator random = new OOPUniqueNumberGenerator(1,100,10);
        random.generateNumber();
        random.printArray();
        System.out.println(random.toString());
    }
}