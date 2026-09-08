class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for i in s:
            if i == "(":
                stack.append("(")
            elif i == "{":
                stack.append("{")
            elif i == "[":
                stack.append("[")
            elif i == ")":
                if len(stack)>0 and stack.pop() == "(":
                    continue
                else:
                    return False
            elif i == "}":
                if len(stack)>0 and stack.pop() == "{":
                    continue
                else:
                    return False
            elif i == "]":
                if len(stack)>0 and stack.pop() == "[":
                    continue
                else:
                    return False
        if len(stack) > 0:
            return False
        else:
            return True