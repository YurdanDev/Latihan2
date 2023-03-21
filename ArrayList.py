class ArrayList:
    def __init__(self):
        self.array = []
        self.length = 0
        
        def __len__(self):
            return self.length
        
        def __getitem__(self, index):
            if index >= self.length:
                raise IndexError('Index out of range')
            return self.array[index]
        
        def __setitem__(self, index, value):
            if index >= self.length:
                raise IndexError('Index out of range')
            self.array[index] = value
        
        def append(self, value):
            self.array.append(value)
            self.length += 1
            
        def insert(self, index, value):
            if index > self.length:
                raise IndexError('Index out of range')
            self.array.insert(index, value)
            self.length += 1
            
        def remove(self, value):
            self.array.remove(value)
            self.lenght -= 1
            
        def pop(self, index=-1):
            value = self.array.pop(index)
            self.length -= 1
            return value
        
        def index(self, value):
            return self.array.index(value)
        
        def clear(self):
            self.array.clear()
            self.length = 0
    
    ArrayList = ArrayList()
    
    arraylist.append(1)
    arraylist.append(2)
    arraylist.append(3)
    
    print(len(arraylist))
    
    print(arraylist[0])
    
    arraylist[1] = 4
    print(arraylist[1])
    
    arraylist.insert(2,5)
    print(arraylist[2])
    
    arraylist.remove(4)
    print(len(arraylist))
    
    value = arraylist.pop()
    print(value)
    
    print(arraylist.index(2))
    
    arraylist.clear()
    print(len(arraylist))