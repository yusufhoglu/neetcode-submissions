from collections import defaultdict
class Solution:
    def findOrder(self, numCourses: int, prerequisites: List[List[int]]) -> List[int]:
        preMap = defaultdict(list)
        for course, preReq in prerequisites:
            preMap[course].append(preReq)

        result = []
        seen = set()
        visited = set()
        def traverse(course):
            if course in seen:
                return False
            if course in visited:
                return True
            seen.add(course)
            for preq in preMap[course]:
                if not traverse(preq):
                    return False
            
            result.append(course)
            seen.remove(course)
            visited.add(course)
            return True

        for curr in range(numCourses):
            if not traverse(curr):
                return []

        return result
