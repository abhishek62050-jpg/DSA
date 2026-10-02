class Solution {
    public int compress(char[] chars) {
        int rIndex=0;
        int wIndex=0;
        while(rIndex<chars.length){
            char currentChar=chars[rIndex];
            int count=0;
            while(rIndex<chars.length&&currentChar==chars[rIndex]){
                rIndex++;
                count++;
            }
            chars[wIndex]=currentChar;
            wIndex++;
            if(count>1){
                String countstr=String.valueOf(count);
                for(char digit : countstr.toCharArray()){
                    chars[wIndex]=digit;
                    wIndex++;
                }
            }
        }
        return wIndex;
        
    }
}