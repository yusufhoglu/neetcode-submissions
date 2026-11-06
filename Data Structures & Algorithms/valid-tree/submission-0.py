from collections import defaultdict
class Solution:
    def validTree(self, n: int, edges: List[List[int]]) -> bool:
        if len(edges) != n - 1:
            return False

        treeMap = defaultdict(list)

        for node, adj in edges:
            treeMap[node].append(adj)
            treeMap[adj].append(node)

        visited = set()
        def is_tree(node, parent):
            visited.add(node)
            for adjs in treeMap[node]:
                if adjs == parent:
                    continue
                if adjs in visited:
                    return False
                if not is_tree(adjs, node):
                    return False
            return True
        
        if not is_tree(0, -1):
            return False
        
        return len(visited) == n