class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        preCourse = {}
        for number in range(numCourses):
            preCourse[number] = []
        
        for course,pre in prerequisites:
            preCourse[course].append(pre) 
        ##[1,0][1,2][2,5][2,1][3,1]
        
        seen = set()
        def is_circle(course):
            if course in seen:
                return False
            if preCourse[course] == []:
                return True
            seen.add(course)
            
            for others in preCourse[course]:
                if not is_circle(others):
                    return False
            seen.remove(course)
            preCourse[course] = []
            return True
        
        for key in preCourse.keys():
            if not is_circle(key):
                return False
        return True
