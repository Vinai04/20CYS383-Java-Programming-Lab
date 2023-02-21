class My_Stack:
    def __init__(self,m):
        self.stack=[]
        self.size = m
    def stack_print(self):
        print(self.stack)
    def push(self,value):
        if len(self.stack) != self.size:
            self.stack.append(value)
        else:
            print("print stack Full")
            
    def pop(self):
        if (self.stack):
            self.stack.pop(-1)
        else:
            print("stack is Empty")
    def top(self):
        if (self.stack):
            return self.stack[-1]
        else:
            return "stack is Empty"
    def isEmpty(self):
        return  not  self.stack
    def size(self):
        return len(self.stack)



