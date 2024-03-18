package javaPrj1Programmers;

class Solution12916 {
    boolean solution(String s) {
        int pCnt = 0;
        int yCnt = 0;
       
        for(char ch : s.toLowerCase().toCharArray()){
            if(ch == 'p'){
                pCnt++;
            } else if(ch == 'y'){
                yCnt++;
            }
        }
        
        return pCnt == yCnt;
    }
}