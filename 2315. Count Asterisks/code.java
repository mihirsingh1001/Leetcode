class Solution {
    public int countAsterisks(String s) {
        String[] str = s.split("\\|");
        int count = 0;
        for(int i = 0; i <str.length; i+=2){
            for(int j=0; j < str[i].length(); j++){
                if(str[i].charAt(j) == '*'){
                    count++;
                }
            }
        }
        return count;
    }
}
