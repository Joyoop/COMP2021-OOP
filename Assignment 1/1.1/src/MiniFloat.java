public class MiniFloat {

    public static void main(String[] args){
        /*
        printIntegralMiniFloats();*/

        miniFloatFromString("10100110");
    }

    private static float miniFloatFromString(String bitSequence){
        // Task1: compute the miniFloat value from "bitSequence";
        int len = bitSequence.length();
        int[] tempIntArray = new int[len];
        double result = 0.0;
        int sign;
        int exponent = 0;
        double mantissa = 1.0;

        //put original string into CharArray
        for(int i = 0; i < len ; i++){
            tempIntArray[i] = Character.getNumericValue(bitSequence.charAt(i));
        }

        //mantissa
        int temp = -1;
        for(int k = 0; k < 3; k++) {
            mantissa += tempIntArray[k + 5] * (double) Math.pow(2, temp);
            temp -= 1;
        }
        //System.out.println(mantissa);

        //2's component
        for(int j = 4; j > 0; j--){
            if(tempIntArray[j] == 1){
                exponent += (int) Math.pow(2,(4-j));
            }
        }
        mantissa *= (double) Math.pow(2,exponent);

        //sign
        sign = tempIntArray[0];
        
        if(sign == 0){
            mantissa *= 1;
        }else if(sign == 1){
            mantissa *= -1;
        }


        System.out.print(mantissa);

        return (float) mantissa;

    }

    private static void printIntegralMiniFloats(){
        String[] bitSequences = getValidMiniFloatBitSequences();

        // Task 2: print all the miniFloat values that are integer;

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

}
