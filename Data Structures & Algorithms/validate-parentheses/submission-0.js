class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isValid(s) {
        const stack = [];
        const closeToOpen = {
            ')': '(',
            ']': '[',
            '}': '{',
        };

        for (let c of s) {
        if (!(c in closeToOpen)) {
            stack.push(c);
        } else {
            if (stack.pop() !== closeToOpen[c]) {
                return false;
            }
        }
        }

        return stack.length === 0;
    }
}
