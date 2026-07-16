class Solution {
    int[] countArray = new int[2]; 
    public int countStudents(int[] students, int[] sandwiches) {
        for(int student : students) {
            countArray[student]++;
        }

        for(int sandwich : sandwiches) {
            if(countArray[sandwich] > 0) countArray[sandwich]--;
            else break;
        }
        return countArray[0] + countArray[1];
    }
}