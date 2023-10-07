class Solution:
    def addBinary(self, a: str, b: str) -> str:
        carry = 0
        i = len(a)-1
        j = len(b)-1
        answer = ""
        while i >= 0 and j >= 0:
            answer = str((int(a[i])+int(b[j])+carry) % 2) + answer
            if int(a[i])+int(b[j])+carry >= 2:
                carry = 1
                # print(answer)
            elif int(a[i])+int(b[j])+carry < 2:
                carry = 0
                
            i -=1 
            j-= 1

        while i >= 0:
            answer = str((int(a[i])+carry)%2) + answer
            if int(a[i]) + carry >= 2:
                carry = 1
            else:
                carry = 0
            i-=1
            
        while j >= 0:
            answer = str((int(b[j])+carry)%2) + answer
            if int(b[j]) + carry >= 2:
                carry = 1
            else:
                carry = 0
            j-=1

        if carry == 1:
            answer = '1' + answer

        return answer