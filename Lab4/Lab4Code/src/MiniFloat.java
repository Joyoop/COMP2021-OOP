public class MiniFloat {

    public static void main(String[] args){
        printIntegralMiniFloats();
    }

    private static float miniFloatFromString(String bitSequence){
        String sign=bitSequence.substring(0,SIGN_LEN);
        String expo=bitSequence.substring(SIGN_LEN,SIGN_LEN+EXPO_LEN);
        String mant=bitSequence.substring(SIGN_LEN+EXPO_LEN,MINI_FLOAT_SIZE);
        int expoInt=0;
        for(int i=0;i<EXPO_LEN;i++){
        	expoInt+=(1<<(EXPO_LEN-1-i))*(expo.toCharArray()[i]-'0');
        }
        double expoVal=Math.pow(2, expoInt);
        float mantVal=1;
        for(int i=0;i<MANT_LEN;i++){
        	mantVal+=Math.pow(0.5,(i+1))*(mant.toCharArray()[i]-'0');
        }
        float result=(float)expoVal*mantVal;
        if(sign.charAt(0)=='1'){
        	result=-result;
        }
        return result; 
    }

    public static int printIntegralMiniFloats(){
        String[] bitSequences = getValidMiniFloatBitSequences();
        // Task 2: print all the miniFloat values that are integer;
        int Count=0;
        for(int i=0;i<bitSequences.length;i++){
        	float res=miniFloatFromString(bitSequences[i]);
        	if(res==(int)res){
        		Count++;
        	}
        }
        System.out.printf("Total number of integral miniFloat values: <%d> ",Count);
        return Count;
    }
    

    /**
     * Get all valid bit sequences for miniFloat values.
     */
    private static String[] getValidMiniFloatBitSequences(){
        int nbrValues = (int)Math.pow(2, MINI_FLOAT_SIZE);

        String[] result = new String[nbrValues];
        for(int i = 0; i < nbrValues; i++){
            String full = String.format("%" + Integer.SIZE + "s", Integer.toBinaryString(i))
                    .replace(' ', '0');

            result[i] = full.substring(Integer.SIZE - MINI_FLOAT_SIZE, Integer.SIZE);
        }
        return result;
    }

    private static int MINI_FLOAT_SIZE = 8;
    private static int SIGN_LEN=1;
    private static int EXPO_LEN=4;
    private static int MANT_LEN=3;

}
