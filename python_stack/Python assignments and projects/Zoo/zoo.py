from lion import lion 
from monkeys import monkey
from bears import bears 

class Zoo():
    def __init__(self, zoo_name):
        self.animals = []
        self.name = zoo_name
    def add_lion(self, name, age , health , happiens, speed):
        self.animals.append( lion(name , age , health , happiens , speed ) )
    def add_monkey(self, name  , age , health , happiens,climbing_skills ):
        self.animals.append( monkey(name  , age , health , happiens ,climbing_skills) )
    def add_bears(self, name  , age , health , happiens,weight):
        self.animals.append( bears(name  , age , health , happiens ,weight) )
    def print_all_info(self):
        print("-"*30, self.name, "-"*30)
        for animal in self.animals:
            animal.display_info()
zoo1 = Zoo("John's Zoo")
zoo1.add_lion("Nala" , 8 , 60 , 60 , 80)
zoo1.animals[0].feed()
zoo1.add_monkey("drill" , 30 , 40 , 60 , "climbing")
zoo1.animals[1].feed()
zoo1.add_bears("Yogi" , 5 , 90 , 60 , "300kg")
zoo1.animals[2].feed()
zoo1.print_all_info()