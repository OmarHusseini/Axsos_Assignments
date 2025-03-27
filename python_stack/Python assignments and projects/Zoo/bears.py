from animal import Animal

class bears (Animal):
    def __init__(self ,name , age , health , happiens , weight):
        self. weight= weight
        super().__init__(name , age , health , happiens )
     
      
    def feed(self):
        self.health += 30
        self.happiens +=50  
         
    def display_info(self):
        print(f"Name:{self.name} - Age:{self.age} - Health:{self.health} - Happiens:{self.happiens} - weight:{self.weight}")