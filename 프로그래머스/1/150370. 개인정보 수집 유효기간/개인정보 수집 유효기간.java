class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        String temp = " ";
        
        String[] todays = today.split("\\.");
        int toYear = Integer.parseInt(todays[0]);
        int toMonth = Integer.parseInt(todays[1]);
        int toDay = Integer.parseInt(todays[2]);
        
        for(int i = 0; i < privacies.length; i++){
            String[] privacie = privacies[i].split(" ");
            String str = privacie[1];
            
            for(int j = 0; j < terms.length; j++){
                String[] termSplit = terms[j].split(" ");
                String term = termSplit[0];
                int termMonth = Integer.parseInt(termSplit[1]);
                
                if(term.equals(str)) {
                    String[] priDataSplit = privacie[0].split("\\.");
                    int year = Integer.parseInt(priDataSplit[0]);
                    int month = Integer.parseInt(priDataSplit[1]);
                    int day = Integer.parseInt(priDataSplit[2]);
                    
                    int temp1 = (year * 12) + month + termMonth;
                    int temp2 = (toYear * 12) + toMonth;
                    
                    System.out.println((i+1) +" Qnd");
                    System.out.println(temp1);
                    System.out.println(temp2);
                    
                    if(temp1 <= temp2){
                        if(temp1 == temp2){
                            if(toDay >= day) {
                                temp += (i+1) + " ";
                            }
                        }else {
                            temp += (i+1) + " ";
                        }
                    } 
                } 
            }
        }
        
        String[] result = temp.split(" ");                                    
        
        int[] answer = new int[result.length];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = Integer.parseInt(result[i]);
        }
                             
        return answer;
    }
}