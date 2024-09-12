import java.lang.management.ThreadMXBean;

class FindSubstring {
        public static boolean mySubstring(String main, String sub) {
        
            String[] mainArray = main.split("\\s+");
            String[] subArray = sub.split("\\s+");
    
            
            for (int i = 0; i <= mainArray.length-subArray.length; i++) {
                
                boolean match = true;
                for (int j = 0; j < subArray.length; j++) {
                    if (!mainArray[i+j].equals(subArray[j])) {
                        match = false;
                        break;
                    }
                }
                
                if (match) {
                    return true;
                }
            }
            
            return false;
        }
    
        public static void main(String[] args) {
            String main = "my name is priyanshi";
            String sub = "is priyanshi";
            boolean result = mySubstring(main, sub);
            System.out.println("Substring is found: " + result);  
        }
    }






     

    

