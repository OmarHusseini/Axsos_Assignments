from animal import  Animal 

class monkey(Animal) :
    def __init__(self ,name , age , health , happiens , climbing_skills):
        self. climbing_skills= climbing_skills
        super().__init__(name , age , health , happiens )
     
      
    def feed(self):
        self.health += 15
        self.happiens +=20  
          
    def display_info(self):
        print(f"Name:{self.name} - Age:{self.age} - Health:{self.health} - Happiens:{self.happiens} - skills:{self.climbing_skills}")