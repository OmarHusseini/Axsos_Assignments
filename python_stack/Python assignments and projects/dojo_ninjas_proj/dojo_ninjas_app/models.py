from django.db import models

class dojo(models.Model):
    name=models.CharField(max_length=255)
    city=models.CharField(max_length=255)
    state=models.CharField(max_length=2)
    created_at= models.DateTimeField(auto_now_add=True)
    updated_at=models.DateTimeField(auto_now=True)
                #  request.POST
    def new_dojo(post):
        dojo.objects.create(name= post['name'] , city= post['city'] ,state=post['state'])

class ninja(models.Model):
    dojo=models.ForeignKey(dojo, related_name="ninjas", on_delete = models.CASCADE)
    first_name=models.CharField(max_length=255)
    last_name=models.CharField(max_length=30)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)

def new_ninja1(post):
    dodo=dojo.objects.get(id =post['specific_dojo'])
    print(dodo)
    ninja.objects.create(dojo=dodo,first_name= post['first_name'] , last_name= post['last_name']  )

def all_dojo():
    return dojo.objects.all()
    
def all_ninja():
    return ninja.objects.all()

