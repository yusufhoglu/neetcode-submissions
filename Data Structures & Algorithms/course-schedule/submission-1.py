class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        ## [1,0] [2,0] [0,5] [5,1] [1,0][0,1]
        ##  {'lesson':[prerequisites]}
        ##  []
        preCourse = {}
        for course in range(numCourses):
            preCourse[course] = []
        
        for course,prerequest in prerequisites:
            preCourse[course].append(prerequest)
        
        seen = set()
        def isCircle(course):
            if course in seen:
                return False
            if preCourse[course] == []:
                return True

            seen.add(course)
            for curr in preCourse[course]:
                if not isCircle(curr):
                    return False

            seen.remove(course)
            preCourse[course] = []
            return True
        
        for courses in preCourse.keys():
            if not isCircle(courses):
                return False
        return True

        