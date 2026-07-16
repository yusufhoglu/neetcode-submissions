class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] oldStudent = students;
        int i = 0;
        boolean[] removed = {false};
        while(i < sandwiches.length) {
            int desiredSandwich = sandwiches[i++];        
            students = Arrays.stream(students)
                        .filter(x -> {
                            if (!removed[0] && x == desiredSandwich) {
                                removed[0] = true;
                                return false;
                            }
                            return true;
                        })
                        .toArray();
            if(Arrays.equals(oldStudent, students)) return students.length;
            oldStudent = students;
            removed[0] = false;
        }
        return 0;
    }
}