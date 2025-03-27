# # Update Values in Dictionaries and Lists
# x = [ [5,2,3], [15,8,9] ] 
# students = [
#      {'first_name':  'Michael' , 'last_name': 'Bryant'},
#      {'first_name' : 'John' ,     'last_name': 'Rosales'}
# ]
# sports_directory = {
#     'basketball' : ['Kobe', 'Jordan', 'James', 'Curry'],
#     'soccer' : ['Andres', 'Ronaldo', 'Rooney']
# }
# z = [ {'x': 20, 'y': 30} ]

# # print(x)

# for value in students:
#  print(value['first_name'],value['last_name'])
 
 
# # print(students)

# # for key ,value in sports_directory.items():
# #     print(x)
# # print(z)


# students = [
#          {'first_name':  'Michael', 'last_name' : 'Jordan'},
#          {'first_name' : 'John', 'last_name' : 'Rosales'},
#          {'first_name' : 'Mark', 'last_name' : 'Guillen'},
#          {'first_name' : 'KB', 'last_name' : 'Tonel'}
#     ]

# #foreach
# for i in range(0, len(students), 1):
#     print( students[i]['first_name']+ " - " + students[i]["last_name"] )


dojo = {
   'locations': ['San Jose', 'Seattle', 'Dallas', 'Chicago', 'Tulsa', 'DC', 'Burbank'],
   'instructors': ['Michael', 'Amy', 'Eduardo', 'Josh', 'Graham', 'Patrick', 'Minh', 'Devon']
}

def printInfo():
    
        # print(dojo["locations"]) 
        # print(dojo['instructors']) 
        
printInfo() 

