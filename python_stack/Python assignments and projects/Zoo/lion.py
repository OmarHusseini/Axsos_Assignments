from animal import  Animal 

class lion(Animal):
    def __init__(self ,name , age , health , happiens , speed ):
        self.speed = speed
        super().__init__(name , age , health , happiens )
        
        
        
    
    def feed(self):
        self.health += 15
        self.happiens +=10 
        
    def display_info(self):
        print(f"Name:{self.name} - Age:{self.age} - Health:{self.health} - Happiens:{self.happiens} - speed:{self.speed}" )
        
        