
class My_Queue:
    def __init__(self,max_size):
        self.Queue = []
        self.max_size = max_size
        self.Q_size = 0
        
    def enqueue(self,value):
        
        if (self.max_size != self.Q_size):    
            self.Queue.append(value)
            self.Q_size += 1
            # print(self.Queue)
        else:
            print(Queue is full)
    def dequeue(self):
        if (self.Q_size):
            self.Q_size -= 1
            return self.Queue.pop(0)
            
        else:
            return Queue Empty
    def size(self):
        return self.Q_size
        
    def isEmpty(self):
        return not self.Q_size
        
    def first(self):
        if (self.Q_size):
            return self.Queue[0]
            
        else:
            return Queue Empty
        
Q = My_Queue(1)
Q.enqueue(5)
Q.enqueue(2)
Q.enqueue(6)
# print(Q.dequeue())
# print(Q.dequeue())
# print(Q.dequeue())

print(Q.dequeue())
print(Q.first())
