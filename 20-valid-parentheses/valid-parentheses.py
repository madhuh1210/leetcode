class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for ch in s:
            if ch == '(' or ch == '{' or ch =='[':
                stack.append(ch)
            else :
                if not stack:
                    return False
                top = stack[-1]
                if ch == ')' and top != '(':
                    return False
                if ch == '}' and top != '{':
                    return False
                if ch == ']' and top != '[':
                    return False

                stack.pop()
        if len(stack) == 0:
            return True
        else :
            return False
